
function getFlight(event){
    event.preventDefault();
    /**
                      tr>
                        <td>1</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        <td>@mdo</td>
                      </tr>

        
     */


    const url = 'http://localhost:8080/flight';

    // Fetch API ile GET isteği gönderme
    fetch(url)
    .then((response) => {
        // Yanıtı kontrol etmek için durum kodunu kontrol edin
        if (!response.ok) {
        throw new Error(`HTTP hata! Durum kodu: ${response.status}`);
        }
        // Yanıtı JSON olarak ayrıştırın
        return response.json();
    })
    .then((data) => {
        const tr = document.querySelector("#flightList")
        tr.innerHTML = ""
        
        for (let i = 0;i<data.length;i++){

            tr.innerHTML +=
            `
            <tr>
                        <td>${data[i].flightId}</td>
                        <td>${data[i].expeditionId}</td>
                        <td>${data[i].departureAirport}</td>
                        <td>${data[i].landingAirport}</td>
                        <td>${data[i].expeditionTime}</td>
                        <td>${data[i].airplaneId}</td>
                        <td>${data[i].brand}</td>
                        <td>${data[i].model}</td>
                        <td>${data[i].business}</td>
                        <td>${data[i].economy}</td>
                        <td>${data[i].localDateTime}</td>
                        <td>${data[i].active}</td>
                        <td>${data[i].economyPrice}</td>
                        <td>${data[i].businessPrice}</td>
            </tr>
            
            `

        }





    })
    .catch((error) => {
        // Hata durumunda hata mesajını yakalayın
        console.error('Hata:', error);
    });



}

/*
active: true
airplaneId: 1
brand: "Airbus"
business: 100
businessPrice: 100
departureAirport: "İstanbul"
economy: 300
economyPrice: 25
expeditionId: 1
expeditionTime: "3"
flightId: 1
landingAirport: "Ankara"
localDateTime: "2002-06-26T10:15:00"
model: "A330"

*/





window.onload = function getAdmin(event){
    event.preventDefault();
  
    fetchApi = `http://localhost:8080/admin/${localStorage.getItem("mail")}`
  
    fetch(fetchApi)
    .then(response => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
          return response.json();
    })
    .then(data => {
        const username = document.querySelector("#username")
        username.innerHTML = " " +data.firstName +" "+data.lastName
    })
    .catch(error => {
      console.error('Fetch error:', error);
    });
  
  }







  //-----------------EXPEDİTİON-------------------

  function  getExpedition(event){
    event.preventDefault();

    const url = 'http://localhost:8080/expedition';

    fetch(url)
    .then(response => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      return response.json(); // JSON yanıtını işle
    })
    .then(data => {
        const tr = document.querySelector("#expeditionList")
        tr.innerHTML = ""
        
        for (let i = 0;i<data.length;i++){

            tr.innerHTML +=
            `
            <tr>
                        <td>${data[i].expeditionId}</td>
                        <td>${data[i].departureAirport}</td>
                        <td>${data[i].landingAirport}</td>
                        <td>${data[i].expeditionTime}</td>    
            </tr>
            
            `

        }

    })
    .catch(error => {
      // Hata durumunda işlemleri burada ele alın
      console.error('Fetch error:', error);
    });



  }























  //-------------------FLIGHT-------------------


  function getAirplane(event){
    event.preventDefault();

    const url = 'http://localhost:8080/airplane';

    fetch(url)
    .then(response => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      return response.json(); // JSON yanıtını işle
    })
    .then(data => {
        const tr = document.querySelector("#airplaneList")
        tr.innerHTML = ""
        
        for (let i = 0;i<data.length;i++){

            tr.innerHTML +=
            `
            <tr>
                        <td>${data[i].airplaneId}</td>
                        <td>${data[i].brand}</td>
                        <td>${data[i].model}</td>
                        <td>${data[i].business}</td>    
                        <td>${data[i].economy}</td>    
            </tr>
            
            `

        }

    })
    .catch(error => {
      // Hata durumunda işlemleri burada ele alın
      console.error('Fetch error:', error);
    });



  }








  //-------------LOGOUT------------------

  function logout(){
    localStorage.clear()
    window.location.href = '/loginpage/login.html'
  }
