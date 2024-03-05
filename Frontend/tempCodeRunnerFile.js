const  fs = require('fs');
    fs.writeFile('mydata.json', jsonString, (err) => {
        if (err) throw err;
        console.log('Data saved');
    })