const calculate = () => {
    const num1 = parseInt(document.getElementById('num1').value);
    const num2 = parseInt(document.getElementById('num2').value);
    const operation = document.getElementById('operation').value.toUpperCase();
    let result;
    switch (operation) {
    case 'S':
        result = num1 + num2;
        break;
    case 'R':
        result = num1 - num2;
        break;
    case 'M':
        result = num1 * num2;
        break;
    case 'D':
        result = num2 !== 0 ? num1 / num2 : 'Error: división por cero';
        break;
    default:
        result = 'Operación inválida. Use S, R, M o D';
    }
    document.getElementById('result').textContent = `Resultado: ${result}`;
};