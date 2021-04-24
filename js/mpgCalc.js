function isValid() {
    let allValid = true;
    let milesBox = document.getElementById("miles");
    let milesDriven = milesBox.value;
    let gallonsBox = document.getElementById("gallons");
    let gallonsUsed = gallonsBox.value;
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
    let calcBtn = document.getElementById("calculate");
    calcBtn.onclick = main;
    let clearBtn = document.getElementById("clear");
    clearBtn.onclick = resetForm;
};
function main() {
    if (isValid()) {
        ;
        let miles = document.getElementById("miles").value;
        let gallons = document.getElementById("gallons").value;
        let mpg = calculateMPG(parseFloat(miles), (parseFloat(gallons)));
        displayResults(mpg);
    }
}
function displayResults(milesPerGallon) {
    let mpgBox = document.getElementById("mpg");
    mpgBox.value = milesPerGallon.toString();
}
function calculateMPG(milesDriven, gallonsUsed) {
    let mpg = milesDriven / gallonsUsed;
    return mpg;
}
function resetForm() {
    let allBoxes = document.querySelectorAll("input[type=text]");
    for (let i = 0; i < allBoxes.length; i++) {
        let currBox = allBoxes[i];
        currBox.value = "";
    }
    let allSpans = document.querySelectorAll("span");
    for (let i = 0; i < allSpans.length; i++) {
        let currSpan = allSpans[i];
        currSpan.innerHTML = "*";
    }
}
