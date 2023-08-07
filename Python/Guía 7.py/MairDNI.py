from os import system
from DNI38016084 import *
def main():
    print("="*30)
    print("1 - Ejercicio de mayor y potencia.")
    print("2 - Ejercicio de pago propina.")
    print("3 - Ejercicio de sumatoria.")
    print("4 - Ejercicio de string corto.")
    print("="*30)
    eleccion = int(input("Ingrese el numero correspondiente: "))
    system("cls")
    match eleccion:
        case(1):
            numero1 = int(input("Ingrese un numero: "))
            numero2 = int(input("Ingrese otro numero: "))
            print(f"Resultado: {potencia(numero1, numero2)}")
        case(2):
            importe = float(input("Ingrese el importe: "))
            print(f"El total sumado el 10% de envio es: {pagoPropina(importe)}")
        case(3):
            numero1 = int(input("Ingrese un numero: "))
            numero2 = int(input("Ingrese otro numero: "))
            print(f"{sumatoria(numero1, numero2)}")
        case(4):
            string1 = str(input("Ingrese un string: "))
            string2 = str(input("Ingrese otro string: "))
            print(f"El string mas corto de ambos es: {string_corto(string1,string2)}")
if __name__ == "__main__":
    main()