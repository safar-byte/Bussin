document.getElementById("exportButton").addEventListener("click", exportToJsonFile);

function exportToJsonFile() {
    let dataArray = []; 
    const tableRows = document.getElementById("entries").rows; 

    // Loop through the rows and collect data
    for (let row of tableRows) {
        let rowData = {
            name: row.cells[0].innerText,
            type: row.cells[1].innerText,
            source: row.cells[2].innerText,
            destination: row.cells[3].innerText,
            departure: row.cells[4].innerText
        };
        dataArray.push(rowData);
    }

    let json = JSON.stringify(dataArray, null, 4);

    let blob = new Blob([json], {type: "application/json"});

    let url = URL.createObjectURL(blob);
    let a = document.createElement("a");
    a.download = "bus-data.json";
    a.href = url;
    a.textContent = "Download bus-data.json";
    a.click();
}