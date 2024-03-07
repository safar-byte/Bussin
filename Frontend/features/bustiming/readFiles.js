document.getElementById("form").addEventListener("submit", function (e) {
    e.preventDefault();
    displayData();
});

function displayData(){
    let tablerow = document.getElementById("entries");
    var actionValue = form.querySelector('input[name="timingSelection"]:checked').value;

    fetch("out.json") //File path 
    .then(response => response.json())
    .then(datas => datas.forEach(data => {

        let row = tablerow.insertRow(0);
        row.insertCell(0).innerHTML = data.name;
        row.insertCell(1).innerHTML = data.Count;

    }))
    .catch(error => console.error('Error fetching data:', error));
      

}