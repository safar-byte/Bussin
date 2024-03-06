document.getElementById("form").addEventListener("submit", function (e) {
    e.preventDefault();
    addData();
  });


function addData() {
let busName = document.getElementById("busName").value;
var actionValue = form.querySelector('input[name="optedValue"]:checked').value;
let tablerow = document.getElementById("entries");
let row = tablerow.insertRow(-1);
let cell1 = row.insertCell(0);
let cell2 = row.insertCell(1);
cell1.innerHTML = actionValue;
cell2.innerHTML = busName;

document.getElementById("form").reset();
}