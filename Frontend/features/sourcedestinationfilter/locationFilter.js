document.addEventListener('DOMContentLoaded', ()=>{
    document.getElementById("submitBtn").addEventListener('click',showData);
})

let tablerow = document.getElementById("entries");


function showData(ev){
    ev.preventDefault();
    entries.innerHTML = '';
    
    let splace = document.getElementById("sourcePlace").value;
    let dplace = document.getElementById("destinationPlace").value;
    let place = ''


    if(splace && dplace){
        place = splace+dplace;
    }
    else if (splace == '' && dplace){
        place = `${dplace}dest`
    }
    else if (splace && dplace == ''){
        place = `${splace}source`
    }
    
    console.log(`${place}`)
 
    fetch(`${place}.json`)
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
    .catch(error => {
        let row = tablerow.insertRow(0);
        row.insertCell(0).innerHTML = "No Bus available";

    });
    document.getElementById("form").reset();
    
}
