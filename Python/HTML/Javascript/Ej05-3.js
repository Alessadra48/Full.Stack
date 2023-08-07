// Función flecha para sumar dos números
const suma = (a, b) => a + b;

// Función flecha para restar dos números
const resta = (a, b) => a - b;

// Función flecha para multiplicar dos números
const multiplicacion = (a, b) => a * b;

// Función flecha para dividir dos números
const division = (a, b) => a / b;

// Función para mostrar el menú de opciones y obtener la elección del usuario
const mostrarMenu = () => {
console.log("---- Menú de opciones ----");
console.log("S) Suma");
console.log("R) Resta");
console.log("M) Multiplicación");
console.log("D) División");
console.log("E) Salir");
return prompt("Ingrese la opción deseada: ");
};

// Función principal del programa
const main = () => {
let continuar = true;
while (continuar) {
    const opcion = mostrarMenu().toLowerCase();
    
    if (opcion === 'e') {
    console.log("¡Hasta luego!");
    continuar = false;
    } else {
    const numero1 = parseInt(prompt("Ingrese el primer número: "));
    const numero2 = parseInt(prompt("Ingrese el segundo número: "));
    let resultado;

    switch (opcion) {
        case 's':
        resultado = suma(numero1, numero2);
        break;
        case 'r':
        resultado = resta(numero1, numero2);
        break;
        case 'm':
        resultado = multiplicacion(numero1, numero2);
        break;
        case 'd':
        resultado = division(numero1, numero2);
        break;
        default:
        console.log("Opción inválida. Intente nuevamente.");
        continue;
    }

    console.log(`El resultado es: ${resultado}`);
    }
}
};

// Ejecutar el programa
main();