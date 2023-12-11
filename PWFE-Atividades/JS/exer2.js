function add(){
   let x= prompt("Escreva seu nome:");
   let y= prompt("Escreva seu email:");
   let lista = document.getElementById("lista").innerHTML;
   lista = lista + "<li>"+ "Nome: "+x+ "  Email: "+ y +"</li>"
   document.getElementById("lista").innerHTML =lista;
}
//Create ELEMENT utilizado para criar tags como : <p>, <input>, entre outros