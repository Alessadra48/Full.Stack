function calcular() {
    const valor1 = document.getElementById("valor1").value;
    const valor2 = document.getElementById("valor2").value;
    const operacion = document.getElementById("operacion").value;
    const resultadoElemento = document.getElementById("resultado");

    switch (operacion) {
        case 'S':
        resultado = parseFloat(valor1) + parseFloat(valor2); //solo en el primer valor
        //let sum = (a, b) => a + b
        break;
        case 'R':
        resultado = (valor1) - (valor2);
        break;
        case 'M':
        resultado = (valor1) * (valor2);
        break;
        case 'D':
        resultado = (valor1) / (valor2);
        break;
        default:
        resultado.innerHTML = "Operación no válida.";
        return;
    }
    resultadoElemento.innerHTML = `El resultado es: ${resultado}`;
}
