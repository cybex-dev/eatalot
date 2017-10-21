function searchPayment() {
    // Declare variables
    var input = document.getElementById("searchInput"),
        filter = input.value.toUpperCase(),
        paymentQueryBox = $('#paymentsTable_search_column'),
        searchIndex = paymentQueryBox.selectedIndex,
        table = document.getElementById("paymentsTable"),
        tr = table.getElementsByTagName("tr");

    var displayVisisble = "",
        displayInvisisble = "none";

    if (paymentQueryBox.options[paymentQueryBox.selectedIndex].value === "query_credit_payment") {
        swap(displayVisisble, displayInvisisble);
    }

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[searchIndex];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = displayVisisble;
            } else {
                tr[i].style.display = displayInvisisble;
            }
        }
    }
}

function searchOrder() {
    // Declare variables
    var input = document.getElementById("searchInput"),
        filter = input.value.toUpperCase(),
        orderQueryBox = $('#orderTable_search_column'),
        searchIndex = orderQueryBox.selectedIndex,
        table = document.getElementById("orderTable"),
        tr = table.getElementsByTagName("tr");

    var displayVisisble = "",
        displayInvisisble = "none";

    // if (paymentQueryBox.options[paymentQueryBox.selectedIndex].value === "query_credit_payment") {
    //     swap(displayVisisble, displayInvisisble);
    // }

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[searchIndex];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = displayVisisble;
            } else {
                tr[i].style.display = displayInvisisble;
            }
        }
    }
}

function swap(item1, item2) {
    var t = item1;
    item1 = item2;
    item2 = t;
}