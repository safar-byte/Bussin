
// const myButton = document.querySelector('#myButton');
document.getElementById("submitBtn").onclick = function(){

    var busid = document.getElementById("busName").value;               // BusID
    var busType = document.getElementById("busType").value;             // BusType
    var source = document.getElementById("source").value;               // source
    var destination = document.getElementById("destination").value;     // destination Value
    var time = document.getElementById("dept").value;                   // departure Time
    
    // console.log(busid,busType ,source , destination , time);
    createJSON(busid,busType ,source , destination , time);
    
    
}

var obj = {
    busDetails:[]
}


// createJSON(1231, "superfast" , "TVM" , "KZD" , "8.00AM");
// createJSON(1231, "ordinary" , "klmn" , "KZD" , "8:00AM");
// createJSON(1231, "ordinary" , "fshfmn" , "KfpoasjdfD" , "8:00AM");

function createJSON(id, type, source, destination, time){

    var id = id;
    var type = type;
    var source = source;
    var destination = destination;
    var time = time;


    var jsonObj = {
                Busid : id,
                type : type,
                source : source, destination : destination,
                time : time
    };

    obj.busDetails.push(jsonObj);

    var jsonString = JSON.stringify(obj);

    //////////////////////////////////

    var blob = new Blob([jsonString], {type: "application/json"});
    var url = URL.createObjectURL(blob);

    var a = document.createElement('a');
    a.href = url;
    a.download = 'mydata.json';
    document.body.appendChild(a);
    a.click();
    document.body.removeChild(a);

    //////////////////////////////////

    // const  fs = require('fs');
    // fs.writeFile('mydata.json', jsonString, (err) => {
    //     if (err) throw err;
    //     console.log('Data saved');
    // })
}
