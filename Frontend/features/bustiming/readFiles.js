document.addEventListener('DOMContentLoaded', ()=>{
    document.getElementById("submitBtn").addEventListener('click',readFiles);
})

let tablerow = document.getElementById("entries");


function readFiles(ev){

    
    ev.preventDefault();
    // let file = document.getElementById("form").value;
    console.log(document.getElementById("form").value)

    let fileName = "MorningFilter"
 
    fetch(`${fileName}.json`)
    .then(response => response.json())
    .then(datas => datas.forEach(data => {
        

        let row = tablerow.insertRow(-1);
        row.insertCell(0).innerHTML = data.Bus_name;
        row.insertCell(1).innerHTML = data.Bus_type;
        row.insertCell(2).innerHTML = data.Source;
        row.insertCell(3).innerHTML = data.Destination;
        row.insertCell(4).innerHTML = data.Departure;
        row.insertCell(5).innerHTML = data.SeatCount;
        
    }))
}
