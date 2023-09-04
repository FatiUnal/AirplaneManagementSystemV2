

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
        
        localStorage.setItem("mail",`${responseData.email}`)
        localStorage.setItem("role",`${responseData.role}`)


        if(responseData.status == 500){
          alert("User Not Found Pls Try Again")
        }



        // login işlemlerini hallet
        if (responseData.role === '1'){
          window.location.href = '/AdminHomePage/adminhomepage.html';
        }else if(responseData.role === '2' ||responseData.role === '3' ||responseData.role === '4' ||responseData.role === '5' ||responseData.role === '6' ){
          window.location.href = '/UserHomePage/userhomepage.html';
        }
      })
      .catch((error) => {
        console.log(error)
      });
  
    
    email.value = ""
    password.value = ""
    selected.value = "1"
    
}






