function verificarCaracter() {
    const caracter = document.getElementById("caracter").value.toUpperCase();
    const resultadoElement = document.getElementById("resultado");

    if (caracter === 'S' || caracter === 'N') {
        resultadoElement.innerHTML = "CORRECTO";
    } else {
        resultadoElement.innerHTML = "INCORRECTO";
    }
}