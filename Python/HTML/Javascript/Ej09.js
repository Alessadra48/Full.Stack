function mostrarConEspacios() {
    const frase = document.getElementById('frase').value;
    const result = document.getElementById('resultado');
    let nuevaFrase = '';
    for (let i = 0; i < frase.length; i++) {
        nuevaFrase += frase.charAt(i) + ' ';
    }
    result.textContent = nuevaFrase.trim();
}