function saque() {
    let d = document.getElementById("valor").value; // valor de saque
    let a = 0; // nota de 100
    let b = 0; // nota de 50
    //let c = 0; // nota de 20
    let e = 0; // nota de 10
    //let f = 0; // nota de 5
    //let g = 0; // nota de 2
    do{
        if(d >= 100 ) {
            a = a + 1;
            d = d - 100;
        }else if(d >= 50) {
            b = b + 1;
            d = d - 50;
        }/*else if(d >= 20){
            c = c + 1;
            d = d - 20;
        }*/else if(d >= 10){
            e = e + 1;
            d = d - 10;
        }/*else if(d >= 5){
            f = f + 1;
            d = d - 5;
        }else if(d >= 2){
            g = g + 1;
            d = d - 2;
        }*/else {
            alert("Não é possivel sacar o valor determinado, este será arredondado");
            break;

        /*else {
            f = f - 1;
            d = d + 5;
            do{
                g = g + 1;
                d = d - 2;
                if (d = 1){
                    alert("Não é possivel sacar o valor determinado")
                    exit();
                }
            }while(d != 0);*/
        }
    }while (d != 0);
    document.getElementById("da").innerHTML = "Notas de R$100:"+ a;
    document.getElementById("db").innerHTML = "Notas de R$50:"+ b;
   // document.getElementById("dc").innerHTML = "Notas de R$20:"+ c;
    document.getElementById("de").innerHTML = "Notas de R$10:"+ e;
   // document.getElementById("df").innerHTML = "Notas de R$5:"+ f;
  //  document.getElementById("dg").innerHTML = "Notas de R$2:"+ g;
}