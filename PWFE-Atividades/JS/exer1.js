function buscarCEP() {
    let cep= document.getElementById('input').value;
    if(cep !== ""){
        let url = "https://brasilapi.com.br/api/cep/v1/" + cep;

        let req= new XMLHttpRequest();
        req.open("GET",url);
        req.send();

        req.onload = function() {
            if(req.status === 200){
                let endereco = JSON.parse(req.response);
                document.getElementById("Logradouro").value = endereco.street;
                document.getElementById("Bairro").value = endereco.neighborhood;
                document.getElementById("Cidade").value = endereco.city;
                document.getElementById("Estado").value = endereco.state;
            }else if(req.status== 404){
                alert("Cep Invalido");
            }else{
                alert("Erro Na requisição")
            }
        }
    }
}

function chamar(){
    let txtcep = document.getElementById("input");
    txtcep.addEventListener("blur",buscarCEP);
}