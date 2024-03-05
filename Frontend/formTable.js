document.getElementById("form").addEventListener("submit", function (e) {
        e.preventDefault();
        addData();
      });
function addData() {
    let busName = document.getElementById("busName").value;
    let busType = document.getElementById("busType").value;
    let source = document.getElementById("source").value;
    let destination = document.getElementById("destination").value;
    let time = document.getElementById("time").value;
    let tablerow = document.getElementById("entries");

    let row = tablerow.insertRow(-1);
    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);
    let cell4 = row.insertCell(3);
    let cell5 = row.insertCell(4);

    cell1.innerHTML = busName;
    cell2.innerHTML = busType;
    cell3.innerHTML = source;
    cell4.innerHTML = destination;
    cell5.innerHTML = time;

    document.getElementById("form").reset();
  }