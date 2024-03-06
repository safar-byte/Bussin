

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
