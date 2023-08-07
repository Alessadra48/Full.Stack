
function verificarEdad() {
    const edad = parseInt(document.getElementById("edad").value);
    const resultadoElement = document.getElementById("resultado");

    if (isNaN(edad)) {
        resultadoElement.innerHTML = "Por favor, ingresa una edad válida.";
    } else if (edad >= 18) {
        resultadoElement.innerHTML = "Inscribase en el PAMI";
    } else {
        resultadoElement.innerHTML = "Eres un crio";
    }
}




