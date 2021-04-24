

window.onload = function(){
    var cleave = new Cleave('#phone', {
        phone: true,
        phoneRegionCode: 'US'
    });

    var cleave2 = new Cleave('#dob', {
        date: true,
        delimiter: '-',
        datePattern: ['m', 'd', 'Y']
    });

};

function reDirect(){
    window.location = "forum2.html";
}

function reDirectHome(){
    window.location = "forum.html";
}

