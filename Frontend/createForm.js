document.addEventListener("DOMContentLoaded", function() {
    var createButton = document.getElementById("createButton");
    var createForm = document.getElementById("createForm");
    var midDiv = document.querySelector(".mid");

    createButton.addEventListener("click", function() {
        toggleCreateForm();
    });

    function toggleCreateForm() {
        // Toggle form visibility
        if (createForm.style.display === "none" || createForm.style.display === "") {
            createForm.style.display = "block";
            adjustMidDivHeight(true); 
        } else {
            createForm.style.display = "none";
            adjustMidDivHeight(false); 
        }
    }

    function adjustMidDivHeight(isFormVisible) {

        if(isFormVisible){ midDiv.style.minHeight = `calc(100vh - 332px)`;}
        else{
            midDiv.style.minHeight = `calc(100vh - 170px)`
        }
       
    }
});