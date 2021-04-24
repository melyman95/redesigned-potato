/**
 * Checks if form data is valid
 * @returns {boolean} Returns true is all data is valid on the form, or false is something is invalid
 */
function isValid() {
    var allValid = true;
    var milesBox = document.getElementById("miles");
    var milesDriven = milesBox.value;
    var gallonsBox = document.getElementById("gallons");
    var gallonsUsed = gallonsBox.value;
    if (milesDriven == "" || isNaN(parseFloat(milesDriven))) {
        allValid = false;
        milesBox.nextElementSibling.innerHTML = "Miles Driven field is empty or is not a number.";
    }
    if (gallonsUsed == "" || isNaN(parseFloat(gallonsUsed))) {
        allValid = false;
        gallonsBox.nextElementSibling.innerHTML = "Gallons Used field is empty or is not a number.";
    }
    return allValid;
}
window.onload = function () {
    var calcBtn = document.getElementById("calculate");
    calcBtn.onclick = main;
    var clearBtn = document.getElementById("clear");
    clearBtn.onclick = resetForm;
};
function main() {
    if (isValid()) {
        ;
        var miles = document.getElementById("miles").value;
        var gallons = document.getElementById("gallons").value;
        var mpg = calculateMPG(parseFloat(miles), (parseFloat(gallons)));
        displayResults(mpg);
    }
}
/**
 * Displays given MPG on the form
 *
 */
function displayResults(milesPerGallon) {
    //display the MPG result in a textbox
    var mpgBox = document.getElementById("mpg");
    mpgBox.value = milesPerGallon.toString();
}
/**
 * Calculates miles per gallon
 * @param {number} milesDriven The number of miles driven
 * @param {number} gallonsUsed The number of gallons used
 */
function calculateMPG(milesDriven, gallonsUsed) {
    var mpg = milesDriven / gallonsUsed;
    return mpg;
}
function resetForm() {
    var allBoxes = document.querySelectorAll("input[type=text]");
    for (var i = 0; i < allBoxes.length; i++) {
        var currBox = allBoxes[i];
        currBox.value = "";
    }
    var allSpans = document.querySelectorAll("span");
    for (var i = 0; i < allSpans.length; i++) {
        var currSpan = allSpans[i];
        currSpan.innerHTML = "*";
    }
}
