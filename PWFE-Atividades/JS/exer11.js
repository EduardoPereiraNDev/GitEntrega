function parcelas(){
    document.getElementById("text_parcelas").textContent ="";
    let i= parseFloat(document.getElementById("valor").value);
    for(let t = 1; t <= 10; t++){
        let p =document.getElementById("text_parcelas").innerHTML;
        let resu = i/t;
        p = p + t +"x de R$: "+resu.toFixed(2)+"<br>"
        document.getElementById("text_parcelas").innerHTML =p;
    }
}