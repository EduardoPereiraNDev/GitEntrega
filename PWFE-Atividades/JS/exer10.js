function tabuada(){
    document.getElementById("text_tabuada").textContent ="";
    let i=document.getElementById("valor").value;
    for(let t = 1; t <= 10; t++){
        let p =document.getElementById("text_tabuada").innerHTML;
        p = p +i +" x "+ t+" = "+i*t+"<br>"
        document.getElementById("text_tabuada").innerHTML =p;
    }
}