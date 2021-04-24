var $ = function (id) {
    return document.getElementById(id);
}

var processEntry = function () {
    if (isNaN($("cents").value)) {
        alert("Must be a number.");
        } else if ($("cents").value > 100 || ($("cents").value < 1)) {
            alert("Must be an integer between 1 and 100.");
            } else if ($("cents").value == "") {
                alert("Cannot be empty.");
    }
}

var makeChange = function () {

    var cents = $("cents").value;
    processEntry();

    if ($("cents").value > 24){
        var quarters = parseInt(cents / 25);
        cents = cents % 25;
        $("quarters").value = quarters }

    if ($("cents").value > 9){
        var dimes = parseInt(cents / 10);
        cents = cents % 10;
        $("dimes").value = dimes}

    if ($("cents").value > 4){
        var nickels = parseInt(cents / 5);
        cents = cents % 5;
        $("nickels").value = nickels}

    if ($("cents").value > 0) {
        var pennies = parseInt(cents / 1);
        cents = cents % 1;
        $("pennies").value = pennies}

} 

window.onload = function () {
        
        $("calculate").onclick = makeChange;
        
    }
