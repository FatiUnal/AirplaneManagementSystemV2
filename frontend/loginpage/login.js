

function login(event){
    event.preventDefault()
    const email = document.querySelector("#lemail")
    const password = document.querySelector("#lpassword")
    const selected = document.querySelector("#lselect")

    const log={
        email : email.value,
        password:password.value,
        role : selected.value
    }
    
    var fetchApi = "http://localhost:8080/login"
    fetch(fetchApi, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(log),
    })
      .then((response) => response.json())
      .then((responseData) => {
        console.log(responseData);
      })
      .catch((error) => {
        console.error("hata: ", error);
      });
  
    
    email.value = ""
    password.value = ""
    selected.value = "1"
    
}


