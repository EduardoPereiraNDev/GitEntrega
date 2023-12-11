function promo() {
    let nome = document.getElementById("Medi").value;
    let preco = document.getElementById("preco").value;
    preco = Math.trunc(preco)*2;
    document.getElementById("nom").innerHTML = "Promoção de "+ nome;
    document.getElementById("prec").innerHTML = "Leve 2 por apenas R$:"+ preco;
}