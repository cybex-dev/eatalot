
var setScheduleStatus = function () {
    scheduleJSRoutes.controllers.Order.ScheduleController.setScheduleState().ajax({
        success: function (data) {
            var btn = document.getElementById("btnScheduleStatus");
            if (data["status"].equals("true")) {
                btn.classList.add("btn-success");
                btn.classList.remove("btn-warning");
                btn.value = "Active"
            } else {
                btn.classList.add("btn-warning");
                btn.classList.remove("btn-success");
                btn.value = "Inactive"
            }
        },
        error: function (data) {
            alert("An error occurred!")
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