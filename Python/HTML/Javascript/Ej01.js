function cambiarFondo() {
    var estadoDia = document.getElementById("estadoDia").value;
    var mensaje = document.getElementById("mensaje");
    var body = document.getElementsByTagName("body")[0];
    
    mensaje.textContent = "El día de hoy está " + estadoDia + ".";
    
    body.classList.remove("soleado", "nublado", "lloviendo");
    body.classList.add(estadoDia);
    }