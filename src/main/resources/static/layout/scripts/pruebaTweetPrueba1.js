inicio()
listaTweet = document.getElementById("lista-tweets")

function inicio(){
    document.getElementById("formUno").addEventListener("submit", ingresaTweet, false)
    document.getElementById("lista-tweets").addEventListener("click", eliminar, false)
}

function ingresaTweet(e){
    const valorTweet = document.getElementById("tweet").value;
    const li = document.createElement("li")
    const button = document.createElement("button")
    var tweets
    button.innerText = "Eliminar"
    button.className = "eliminar-tweet"
    li.innerText = valorTweet
    li.appendChild(button)
    listaTweet.appendChild(li)
    //agregarStorage(valorTweet)
    //=============================
    var unoVar = []
    var unoVarStr
    var unoVarJSON
    if (localStorage.getItem("uno") === null){
        localStorage.setItem("uno", valorTweet)
        unoVar.push(localStorage.getItem("uno"))
    }else{

        unoVar.push(valorTweet)
        unoVar.push(localStorage.getItem("uno"))


        unoVarJSON = JSON.parse(JSON.stringify(unoVar))
        //console.log(JSON.stringify(unoVarJSON))
        localStorage.setItem("uno", unoVarJSON)
        console.log(unoVarJSON)
        console.log(typeof unoVarJSON)
    }
    //tweets = JSON.parse('["jorge"]')
    //console.log(unoVarStr)
    //=============================
    e.preventDefault()
}

function eliminar(e){
    if (e.target.className === "eliminar-tweet"){
        e.target.parentElement.remove()
    }
}



function agregarStorage(tweet){
    var tweets
    tweets = obtenerTweetsLocalStorage()
    tweets.push(tweet)
    console.log("valor: "+tweets)
    localStorage.setItem('uno', JSON.stringify(tweets))
    console.log(JSON.stringify(tweets))
}

function obtenerTweetsLocalStorage(){
    var tweets
    if(localStorage.getItem('uno') === null){
        tweets = [];
        console.log("limpio "+localStorage.getItem('uno'))
    }else{
        tweets = JSON.parse(localStorage.getItem('uno'))
        console.log("algo "+localStorage.getItem('uno'))
    }
    console.log(tweets)
    return tweets
}