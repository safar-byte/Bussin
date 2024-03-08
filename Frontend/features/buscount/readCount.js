let tablerow = document.getElementById("entries");


fetch("out.json") //File path 
    .then(response => response.json())
    .then(datas => datas.forEach(data => {

        let row = tablerow.insertRow(0);
        row.insertCell(0).innerHTML = data.Bus_type;
        row.insertCell(1).innerHTML = data.Count;

    }))
    .catch(error => console.error('Error fetching data:', error));
      
