$(document).ready(function() {
    $('#isCommunity').change(function () {
        $('#communityName').prop('disabled', ($(this).is(':checked')))
    });
});