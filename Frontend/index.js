//document.getElementById("submitBtn").onclick = readData();

function readData(){
    var busid = document.getElementById("busName").value;                 // BusName
    var busType = document.getElementById("busType").value;             //BusType
    var source = document.getElementById("source").value;               //source
    var destination = document.getElementById("destination").value;    //destination value
    var time = document.getElementById("departure").value;            //departure time

createJSON(busid,busType ,source , destination , time)

}

createJSON(1231, "superfast" , "TVM" , "KZD" , "8.00AM")

function createJSON(id, type, source, destination, time){
    var id = id;
    var type = type;
    var source = source;
    var destination = destination;
    var time = time;
    var key = type;

    var jsonObj = {
        [key] : [
            {
                Busid : id,
                type : type,
                source : source, destination : destination,
                time : time
            }
        ]
    };

    var jsonString = JSON.stringify(jsonObj);
    const fs = require('fs');
    fs.writeFile('mydata.json', jsonString, (err) => {
        if (err) throw err;
        console.log('Data saved');
    })
}
