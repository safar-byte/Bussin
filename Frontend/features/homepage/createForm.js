document.addEventListener("DOMContentLoaded", function() {
    var createButton = document.getElementById("createButton");
    var createForm = document.getElementById("createForm");
    var midDiv = document.querySelector(".mid");

    createButton.addEventListener("click", function() {
        toggleCreateForm();
    });

    function toggleCreateForm() {
        if (createForm.style.display === "none" || createForm.style.display === "") {
            createForm.style.display = "block";
            createButton.textContent = 'Close'; 
            createButton.style.backgroundColor= '#757575'
            adjustMidDivHeight(true); 
        } else {
            createForm.style.display = "none";
            createButton.textContent = '+ Create New';
            createButton.style.backgroundColor= '#425151'
            adjustMidDivHeight(false); 
        }
    }

    function adjustMidDivHeight(isFormVisible) {

        if(isFormVisible){ midDiv.style.minHeight = `calc(100vh - 375px)`;}
        else{
            midDiv.style.minHeight = `calc(100vh - 175px)`
        }
       
    }
});