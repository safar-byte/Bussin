document.getElementById("exportButton").addEventListener("click", exportToJsonFile);

function exportToJsonFile() {
    let dataArray = []; 
    const tableRows = document.getElementById("entries").rows; 

    // Loop through the rows and collect data
    for (let row of tableRows) {
        let rowData = {
            action: row.cells[0].innerText,
            name: row.cells[1].innerText,
        };
        dataArray.push(rowData);
    }

    let json = JSON.stringify(dataArray, null, 4);

    let blob = new Blob([json], {type: "application/json"});
    // let isblob = blob instanceof Blob

    let url = URL.createObjectURL(blob);
    let a = document.createElement("a");


    /////////////// null finder //////////////////
    const reader = new FileReader();
    reader.addEventListener('loadend' , () => {
        const arrayBuffer = reader.result
        console.log(arrayBuffer)
        console.log(blob.size)
    });

    reader.readAsArrayBuffer(blob)

    if(blob.size == 2){
        window.alert("no data to export")
    }else{
        window.alert("data exported")
        a.download = "booking-details.json";
        a.href = url;
        a.textContent = "booking-details.json";
        a.click();
    }

    ////////////////////////////////////////////////

    

    
}