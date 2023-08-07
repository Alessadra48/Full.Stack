const analizarNumeros = () => {
    const numeros = [];
    let numero = parseInt(document.getElementById('numero').value);
    while (numero !== 0) {
    if (isNaN(numero)) {
        document.getElementById('resultado').textContent = 'Por favor, ingrese un número válido.';
        return;
    }
    numeros.push(numero);
    numero = parseInt(prompt('Ingrese otro número (0 para terminar):'));
    }
    if (numeros.length === 0) {
    document.getElementById('resultado').textContent = 'No se ingresaron números válidos.';
    return;
    }
    const maximo = Math.max(...numeros);
    const minimo = Math.min(...numeros);
    const sumaTotal = numeros.reduce((acc, curr) => acc + curr, 0);
    const promedio = sumaTotal / numeros.length;
    document.getElementById('resultado').textContent = `
    Máximo: ${maximo}
    Mínimo: ${minimo}
    Promedio: ${promedio.toFixed(2)}
    `;
};
//Aprender predicciones