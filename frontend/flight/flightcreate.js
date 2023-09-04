

function createFlight(event){

    event.preventDefault();

    const expeditionId = document.querySelector("#expeditionId")
    const airplaneId = document.querySelector("#airplaneId")
    const date = document.querySelector("#date")
    const businessPrice = document.querySelector("#businessPrice")
    const economyPrice = document.querySelector("#economyPrice")
    const active = document.querySelector("#active")

    const flight ={
        expedition_id : expeditionId.value,
        airplane_id : airplaneId.value,
        localDateTime : date.value,
        economyPrice : economyPrice.value,
        businessPrice : businessPrice.value,
        active : active.checked
    }

    const url = 'http://localhost:8080/flight';

    fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(flight),
    })
      .then((response) => response.json())
      .then((responseData) => {
            console.log(responseData)
      })
      .catch((error) => {
        console.log(error+"  varrrrr")
      });

      expeditionId.value = ""
      airplaneId.value = ""
      date.value = ""
      businessPrice.value = ""
      economyPrice.value = ""
      active.value = false




}