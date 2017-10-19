
var setScheduleStatus = function () {
    ScheduleJSRoutes.controllers.Order.ScheduleController.setScheduleState().ajax({
        success: function (data) {
            var btn = document.getElementById("btnScheduleStatus");
            if (data["status"].equals("true")) {
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
    alert("Create schedule selected, please implement");
};
var changeScheduleName = function () {
    alert("Change schedule name selected, please implement");
};
var clearSchedule = function () {
    alert("Create schedule selected, please implement");
};