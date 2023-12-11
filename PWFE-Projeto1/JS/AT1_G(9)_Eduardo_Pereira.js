const part = [];
const apr = [];
const apr2 = [];
function cadastro() {
    let nome = document.getElementById("valor").value;
    let notas = document.getElementById("valor2").value;
    if(notas>100){
        alert("Nota invalida");
    }else if(notas >= 70){
        alert("Você foi cadastrado!! Parabens, passou para a segunda Fase");
        part.push("<br>"+"Nome : "+nome+";  Nota: "+notas).innerHTML
        apr2.push("<br>"+"Nome : "+nome+";  Nota: "+notas).innerHTML
    }else if(notas >= 50){
        alert("Você foi cadastrado!! Parabens pela aprovação");
        part.push("<br>"+"Nome : "+nome+";  Nota: "+notas).innerHTML;
        apr.push("<br>"+"Nome : "+nome+";  Nota: "+notas).innerHTML
    }else if(notas <50) {
         alert("Você foi cadastrado!!");
        part.push("<br>"+"Nome : "+nome+";  Nota: "+notas).innerHTML
    } 
    document.getElementById("valor").value = "";
    document.getElementById("valor2").value = "";
}
function participantes() {
    document.getElementById("part").innerHTML = part.toString();
    document.getElementById("apr").innerHTML = "";
    document.getElementById("apr2").innerHTML = "";
}
function aprovados() {
    document.getElementById("apr").innerHTML = apr.toString();
    document.getElementById("part").innerHTML = "";
    document.getElementById("apr2").innerHTML = "";
}
function aprovados2() {
    document.getElementById("apr2").innerHTML = apr2.toString();
    document.getElementById("part").innerHTML = "";
    document.getElementById("apr").innerHTML = "";
}

