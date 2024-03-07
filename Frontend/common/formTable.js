document.getElementById("form").addEventListener("submit", function (e) {
  e.preventDefault();
  addData();
});

let charSet = new Set();

function addData() {
  let busName = document.getElementById("busName").value;
  let busType = document.getElementById("busType").value;
  let source = document.getElementById("sourcePlace").value;
  let destination = document.getElementById("destinationPlace").value;
  let time = document.getElementById("time").value;
  let seatCount = document.getElementById("seatCount").value;
  let tablerow = document.getElementById("entries");

  //////////////////////////////////////////////////////////

  let is_unique = true;

  if (charSet.has(busName)) {
    console.log("false");
    is_unique = false;
  } else {
    // charSet.add(busName);
    console.log("true");
    is_unique = true;
  }

  //////////////////////////////////////////////////////////////
  let count = parseInt(seatCount);
  if (source == destination) {
    //source - destination validation
    window.alert("Your source and destination are same!!");
  } else {
    if (is_unique) {
      //busname validation
      console.log(seatCount);
      charSet.add(busName);
      console.log("different");
      let row = tablerow.insertRow(-1);
      let cell1 = row.insertCell(0);
      let cell2 = row.insertCell(1);
      let cell3 = row.insertCell(2);
      let cell4 = row.insertCell(3);
      let cell5 = row.insertCell(4);
      let cell6 = row.insertCell(5);

      cell1.innerHTML = busName;
      cell2.innerHTML = busType;
      cell3.innerHTML = source;
      cell4.innerHTML = destination;
      cell5.innerHTML = time;
      cell6.innerHTML = seatCount;
      document.getElementById("form").reset();
    } else {
      window.alert("Bus name already exists!!");
    }
  }
}
