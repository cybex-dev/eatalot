function openRegisterWindow() {
    window.open('/User/Register', 'EatAloT :: Register', 'x=y');
}

document.addEventListener('DOMContentReady', function () {
    document.getElementById('btnHomeRegisterRedirect')
        .addEventListener('click', openRegisterWindow);
});