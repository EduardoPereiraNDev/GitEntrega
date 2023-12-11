
function seguro(){
let v = document.getElementById("sim").checked;
let f = document.getElementById("nao").checked;
if(v == true){
    document.getElementById("plano").style.display = 'block';
}else if(f == true){
    document.getElementById("plano").style.display = 'none';
}
}
function desconto(){
let f = document.getElementById("nao").checked;
if(f == true){
 d3();
 exit();
}
let escolha= document.getElementById("plano");
let valordaop = escolha.options[escolha.selectedIndex].value;
if(valordaop == "vida"){
    d1();
}else if(valordaop == "anima"){
    d2();
}else{
    d3();
}
}
function d1(){
    let p =document.getElementById("valor").value;
    document.getElementById("preco").textContent = "O preço é sem desconto é: R$"+ p;
    let res = p*0.85;
    document.getElementById("desconto").textContent = "Já com o desconto o preço é: R$"+ res;
}

function d2(){
    let p =document.getElementById("valor").value;
    document.getElementById("preco").textContent = "O preço é sem desconto é: R$"+ p;
    let res = p*0.90;
    document.getElementById("desconto").textContent = "Já com o desconto o preço é: R$"+ res ;
}
function d3(){
    let p =document.getElementById("valor").value;
    document.getElementById("preco").textContent = "O preço é: R$"+ p;
    document.getElementById("desconto").textContent ="";
}
