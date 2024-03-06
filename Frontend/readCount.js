let tablerow = document.getElementById("entries");
let seat;
let OR;
let SF;
let FP;

fetch("sampleData.json") //File path 
    .then(response => response.json())
    .then(datas => datas.forEach(data => {
        OR = data.Ordinary;
        FP = data.Fastpassenger;
        SF = data.SuperFast;

        let row1 = tablerow.insertRow(0);
        row1.insertCell(0).innerHTML = "Ordinary";
        row1.insertCell(1).innerHTML = OR

        let row2 = tablerow.insertRow(1)
        row2.insertCell(0).innerHTML = "SuperFast"
        row2.insertCell(1).innerHTML = SF

        let row3 = tablerow.insertRow(2)
        row3.insertCell(0).innerHTML = "Fast Passenger"
        row3.insertCell(1).innerHTML = FP

        
    }))
    .catch(error => console.error('Error fetching data:', error));




  
      
      
