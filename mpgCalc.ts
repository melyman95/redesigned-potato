/**
 * Checks if form data is valid
 * @returns {boolean} Returns true is all data is valid on the form, or false is something is invalid
 */
function isValid():boolean {
    let allValid:boolean = true;

    let milesBox:HTMLInputElement = <HTMLInputElement>document.getElementById("miles");
    let milesDriven:string = milesBox.value;

    let gallonsBox:HTMLInputElement = <HTMLInputElement>document.getElementById("gallons");
    let gallonsUsed:string = gallonsBox.value;

    if (milesDriven == "" || isNaN(parseFloat(milesDriven))) {
        allValid = false;
        milesBox.nextElementSibling.innerHTML = "Miles Driven field is empty or is not a number."
    }

    if (gallonsUsed == "" || isNaN(parseFloat(gallonsUsed))) {
        allValid = false;
        gallonsBox.nextElementSibling.innerHTML = "Gallons Used field is empty or is not a number."
    }

    return allValid;
}

window.onload = function() {
    let calcBtn:HTMLElement = document.getElementById("calculate");
    calcBtn.onclick = main;

    let clearBtn:HTMLElement = document.getElementById("clear");
    clearBtn.onclick = resetForm;
    
}

function main(){ 
    if(isValid()){;
        let miles:string = (<HTMLInputElement>document.getElementById("miles")).value;
        let gallons:string = (<HTMLInputElement>document.getElementById("gallons")).value; 
        let mpg = calculateMPG(parseFloat(miles), (parseFloat(gallons)));
        displayResults(mpg);
    }
}

/**
 * Displays given MPG on the form
 * 
 */
function displayResults(milesPerGallon:Number):void{
    //display the MPG result in a textbox
    let mpgBox:HTMLInputElement = <HTMLInputElement>document.getElementById("mpg");
    mpgBox.value = milesPerGallon.toString();
}

/**
 * Calculates miles per gallon
 * @param {number} milesDriven The number of miles driven
 * @param {number} gallonsUsed The number of gallons used
 */
function calculateMPG(milesDriven:number, gallonsUsed:number):number{
    let mpg:number = milesDriven / gallonsUsed;
    return mpg;
}

function resetForm():void {
    let allBoxes = document.querySelectorAll("input[type=text]");
    for (let i = 0; i < allBoxes.length; i++) {
        let currBox = <HTMLInputElement>allBoxes[i];
        currBox.value = "";
    }
    let allSpans = document.querySelectorAll("span");
    for (let i = 0; i < allSpans.length; i++) {
        let currSpan = <HTMLElement>allSpans[i];
        currSpan.innerHTML = "*";
    }
}
