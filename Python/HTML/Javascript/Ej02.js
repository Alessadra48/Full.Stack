function calcular() {
    const radio = parseFloat(document.getElementById('radio').value);
    
    const area = Math.PI * radio ** 2;
    const perimetro = 2 * Math.PI * radio;
    
    document.getElementById('area').textContent = area.toFixed(2);
    document.getElementById('perimetro').textContent = perimetro.toFixed(2);
    }