function ParoImpar(){
    const numeros = document.getElementById("numeros").value;
    const resultado = document.getElementById("resultado");
    if (numeros == 0 )  {
        resultado.innerHTML = "No es PAR ni Impar";
    } else if (numeros %2==0){
        resultado.innerHTML = "Es PAR";
    } else{
        resultado.innerHTML = "Es IMPAR";
    }
}
