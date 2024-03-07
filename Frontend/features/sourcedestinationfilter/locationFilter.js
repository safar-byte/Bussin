document.addEventListener('DOMContentLoaded', ()=>{
    document.getElementById("submitBtn").addEventListener('click',showData);
})

let tablerow = document.getElementById("entries");


function showData(ev){
    ev.preventDefault();
    let splace = document.getElementById("sourcePlace").value;
    let dplace = document.getElementById("destinationPlace").value;
    let place = splace+dplace;
    console.log(`splace : ${splace}`)
    console.log(`dplace : ${dplace}`)
    console.log(`file name : ${place}.json`)
    fetch(`${place}.json`)
    .then(response => response.json())
    .then(datas => datas.forEach(data => {
        console.log(data.Bus_name)

        let row = tablerow.insertRow(-1);
        row.insertCell(0).innerHTML = data.Bus_name;
        row.insertCell(1).innerHTML = data.Bus_type;
        row.insertCell(2).innerHTML = data.Source;
        row.insertCell(3).innerHTML = data.Destination;
        row.insertCell(4).innerHTML = data.Departure;
        row.insertCell(5).innerHTML = data.SeatCount;
        
    }))
}
