document.getElementById("form").addEventListener("submit", function (e) {
    e.preventDefault();
    addData();
  });


function addData() {
let busName = document.getElementById("busName").value;
var actionValue = form.querySelector('input[name="action"]:checked').value;
let tablerow = document.getElementById("entries");


let row = tablerow.insertRow(-1);
let cell1 = row.insertCell(0);
let cell2 = row.insertCell(1);
cell1.innerHTML = busName;
cell2.innerHTML = actionValue;

}