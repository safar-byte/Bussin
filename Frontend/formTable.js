function addData() {
    let busName = document.getElementById("busName").value;
    let busType = document.getElementById("busType").value;
    let source = document.getElementById("source").value;
    let destination = document.getElementById("destination");
    let arrival = document.getElementById("arrival");

    let row = table.insertRow(-1);
    let cell1 = row.insertCell(0);
    let cell2 = row.insertCell(1);
    let cell3 = row.insertCell(2);
    let cell4 = row.insertCell(3);

    cell1.innerHTML = busName;
    cell2.innerHTML = busType;
    cell3.innerHTML = source;

    // let actions = document.createElement("img");
    // actions.src = "assets/delete.png";
    // actions.addEventListener("click", function () {
    //   table.deleteRow(row.rowIndex);
    // });
    // cell4.appendChild(actions);

    form.reset();
  }