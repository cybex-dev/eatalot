// Schedule Index page

var setScheduleStatus = function () {
    ScheduleJSRoutes.controllers.Order.ScheduleController.setScheduleState().ajax({
        success: function (data) {
            var btn = document.getElementById("btnScheduleStatus");
            if (data["status"] === "true") {
                btn.classList.add("btn-success");
                btn.classList.remove("btn-danger");
                btn.defaultValue = "Active"
            } else {
                btn.classList.add("btn-danger");
                btn.classList.remove("btn-success");
                btn.defaultValue = "Inactive"
            }
        },
        error: function (error) {
            alert("An error occurred while change your schedule state!")
        }
    })
};
var createSchedule = function () {
    redirect(ScheduleJSRoutes.controllers.Order.ScheduleController.createSchedule().url);
};
var changeScheduleName = function () {
    redirect(ScheduleJSRoutes.controllers.Order.ScheduleController.editScheduleName().url);
};
var clearSchedule = function (scheduleName) {
    if(confirm("Are you sure you want to clear \'" + scheduleName + "\' ?")){
        ScheduleJSRoutes.controllers.Order.ScheduleController.clearSchedule().ajax({
            success: function () {
                alert("Schedule Cleared!");
            }
        });
    }
};
var addOrder = function () {
    redirect(ScheduleJSRoutes.controllers.Order.ScheduleController.addOrder().url);
};

var removeScheduleOrder = function (orderId) {
    ScheduleJSRoutes.controllers.Order.ScheduleController.removeOrder(orderId);
};

var readyFunctions = function () {
    $('#editScheduleName').click(changeScheduleName());
};

// Create/Edit Schedule Page

var setOrderScheduleName = function(createName){
    if(createName) {
        ScheduleJSRoutes.controllers.Order.ScheduleController.updateScheduleName();
    } else {
        ScheduleJSRoutes.controllers.Order.ScheduleController.doCreateSchedule();
    }
};

var redirect = function (redirectPage) {
    window.location.replace(redirectPage);
    $(function() {
        $('#scheduleToggle').click(setScheduleStatus());
    })
};

$(document).ready(readyFunctions());