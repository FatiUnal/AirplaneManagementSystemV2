
function airplaneCreate(event){
    event.preventDefault();

    const brand = document.querySelector("#brand")
    const model = document.querySelector("#model")
    const business = document.querySelector("#business")
    const economy = document.querySelector("#economy")

    const airplane = {
        brand : brand.value,
        model : model.value,
        business : business.value,
        economy : economy.value
    }



    const url = 'http://localhost:8080/airplane';

    fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(airplane),
    })
      .then((response) => response.json())
      .then((responseData) => {
            console.log(responseData)
      })
      .catch((error) => {
        console.log(error+"  varrrrr")
      });

    brand.value = ""
    model.value = ""
    business.value =""
    economy.value = ""


}