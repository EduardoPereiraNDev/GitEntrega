function senha() {
    let s = document.getElementById("valor").value;

    if(s.length < 8 || s.length > 15 ){
        document.getElementById("da").textContent ="Erro, A senha deve Possuir entre 8 e 15 Caracteres";
    }else if (!/[a-z].*[a-z]/.test(s)) {
        document.getElementById("da").textContent ="Erro, A senha deve Possuir 2 letra minuscula";
    }else if (!/[A-Z].*[A-Z]/.test(s)){
        document.getElementById("da").textContent ="Erro, A senha deve Possuir 2 letra maiuscula";
    }else if (!/[0-9]/.test(s)){
        document.getElementById("da").textContent ="Erro, A senha deve Possuir números"; 
    }else if (!/[!@#$%¨&*?_´~^`/|]/.test(s)){
        document.getElementById("da").textContent ="Erro, A senha deve Possuir caracteres especiais"; 
    }else {
        document.getElementById("da").textContent ="Senha CORRETA!!!!!"; 
    }

    let s2= document.getElementById("valor2").value;

    if(!/[@]/.test(s2)){
        document.getElementById("da").textContent ="Erro, O email Não foi identificado";
    }else if (!/[gmail]/.test(s2)) {
        document.getElementById("da").textContent ="Erro, O email Não foi identificado";
    }else if (!/[hotmail]/.test(s2)){
        document.getElementById("da").textContent ="Erro, O email Não foi identificado";
    }else if (!/[com]/.test(s2)){
        document.getElementById("da").textContent ="Erro, O email Não foi identificado"; 
    }else if (!/[br]/.test(s2)){
        document.getElementById("da").textContent ="Erro, O email Não foi identificado"; 
    }else {
        document.getElementById("da").textContent ="Você fez o login!!!"; 
    }
}