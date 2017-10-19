$(document).ready(function () {
    var count = 5;
    setInterval(function(){
        count--;
        document.getElementById('redirectTimer').innerHTML = String(count);
        if (count === 0) {
            window.location = '/User/login';
        }
    },1000);
})