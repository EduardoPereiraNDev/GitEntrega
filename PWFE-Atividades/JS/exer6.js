function verificar() {
    let d = document.getElementById("valor").value.toUpperCase(); // valor 
    const Palavras = d.split(" ");
    let prim = Palavras[0];
    prim = prim.substr(0,1);
    let mei = Palavras[1];
    mei = mei.substr(0,1);
    let ult = Palavras[2];
    document.getElementById("da").textContent ="Citação Bibliográfica: "+ ult+ ","+ prim+ "." + mei;
}