var listaTweet = document.getElementById("lista-tweets")

eventListener();

function eventListener(){
    document.getElementById("formUno").addEventListener("submit", agregarTweet)
    //document.getElementById("boton-eliminar").addEventListener("click", eliminar)
    listaTweet.addEventListener("click", eliminarTweet)
}

function agregarTweet(e){
    const tweet = document.getElementById("tweet")
    const li = document.createElement("li")
    const botonEliminar = document.createElement("button")

    botonEliminar.innerText = "borrar"
    botonEliminar.className = "boton-eliminar"

    li.innerText = tweet.value;
    listaTweet.appendChild(li)
    li.appendChild(botonEliminar)
    e.preventDefault()
    agregarStorage(tweet.value)
}

function eliminarTweet(e){
    if (e.target.className === "boton-eliminar"){
        //console.log("diste click")
        e.target.parentElement.remove()
    }else{
        console.log("borrando")

    }
    e.preventDefault()
}

function agregarStorage(tweet){
    var tweets
    tweets = obtenerTweetsLocalStorage()
    tweets.push(tweet)
    localStorage.setItem('uno', JSON.stringify(tweets))
}

function obtenerTweetsLocalStorage(){
    var tweets
    if(localStorage.getItem('uno') === null){
        tweets = [];
    }else{
        tweets = JSON.parse(localStorage.getItem('uno'))
    }
    console.log(tweets)
    return tweets
}