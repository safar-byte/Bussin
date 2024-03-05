document.addEventListener("DOMContentLoaded", function () {
    var createButton = document.getElementById("createButton");
    var createForm = document.getElementById("createForm");
    var midDiv = document.querySelector(".mid"); 

    createButton.addEventListener("click", function () {
        toggleCreateForm();
    });

    function toggleCreateForm() {
        if (createForm.style.display === "none" || createForm.style.display === "") {
            createForm.style.display = "block";
            midDiv.style.marginTop = "20px"; 
        } else {
            createForm.style.display = "none";
            midDiv.style.marginTop = "0"; 
        }
    }
});



// document.getElementById("createButton").onclick = readData();

// function readData(){
//     var busid = document.getElementById("BusId")   // BusID
// }
