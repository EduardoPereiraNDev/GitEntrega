function verificar() {
    let d = document.getElementById("valor").value; // valor 
    let re = d%2; //resto
    if(re == 0) {
    document.getElementById("da").textContent = "Resposta: "+ d +" è Par";
    }else {
    document.getElementById("da").textContent = "Resposta: "+ d +" è Impar";
    }
}
/*
Função é uma forma de se chamar determinada ações através de algum acontecimento, como um click;
Let é para a criação de uma variavel;
% é o resto de uma divisão;
text.content é a modificação do conteudo de algo, de uma id,class ou elemento;
*/