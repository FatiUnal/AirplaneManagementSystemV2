function expeditionCreate(event){
    event.preventDefault();

    const departure = document.querySelector("#departure")
    const landing = document.querySelector("#landing")
    const time = document.querySelector("#time")

    const expedition = {
        departureAirport : departure.value,
        landingAirport : landing.value,
        expeditionTime : time.value
    }

    const url = 'http://localhost:8080/expedition';

    fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(expedition),
    })
      .then((response) => response.json())
      .then((responseData) => {
            console.log(responseData)
      })
      .catch((error) => {
        console.log(error+"  varrrrr")
      });

      departure.value = ""
      landing.value = ""
      time.value = ""

}