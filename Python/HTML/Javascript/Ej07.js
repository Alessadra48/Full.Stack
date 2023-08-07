const sumar = () => {
    const limite = parseInt(document.getElementById('limite').value);
    let numero = parseInt(document.getElementById('numero').value);
    let suma = 0;
    if (isNaN(limite) || limite <= 0) {
    document.getElementById('resultado').textContent = 'Por favor, ingrese un valor límite positivo válido.';
    return;
    }
    while (suma <= limite) {
    if (isNaN(numero)) {
        document.getElementById('resultado').textContent = 'Por favor, ingrese un número válido.';
        return;
    }
    suma += numero;
    numero = parseInt(prompt('Ingrese otro número:'));
    }
    document.getElementById('resultado').textContent = `La suma de los números superó el límite (${limite}). La suma total es ${suma}.`;
};