document.addEventListener("DOMContentLoaded", function() {
    var createButton = document.getElementById("createButton");
    var createForm = document.getElementById("createForm");
    var midDiv = document.querySelector(".mid");
    var tableDiv = document.querySelector(".scrollingEffect")

    createButton.addEventListener("click", function() {
        toggleCreateForm();
    });

    function toggleCreateForm() {
        if (createForm.style.display === "none" || createForm.style.display === "") {
            createForm.style.display = "block";
            createButton.textContent = 'Close'; 
            createButton.style.backgroundColor= '#886DEA'
            adjustMidDivHeight(true); 
        } else {
            createForm.style.display = "none";
            createButton.textContent = '+ Create New';
            createButton.style.backgroundColor= '#633eea'
            adjustMidDivHeight(false); 
        }
    }

    function adjustMidDivHeight(isFormVisible) {

        if(isFormVisible){ 
            midDiv.style.height = `calc(100vh - 356px)`;
            tableDiv.style.height =`calc(100vh - 408px)`;
    }
        else{
            midDiv.style.height = `calc(100vh - 175px)`;
            tableDiv.style.height =`calc(100vh - 228px)`;

        }
       
    }
});