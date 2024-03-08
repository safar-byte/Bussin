  function optionsBusNames(busData) {
    var select = document.getElementById('busName');
    busData.forEach(function(bus) {
      var option = document.createElement('option');
      option.value = option.textContent = bus.name;
      select.appendChild(option);
    });
  }


  function fetchBusData() {
    fetch('bus-data.json') 
      .then(function(response) {
        return response.json(); 
      })
      .then(function(busData) {
        optionsBusNames(busData); 
      })
      .catch(function(error) {
        console.error('Error loading bus data:', error);
      });
  }

  fetchBusData();
