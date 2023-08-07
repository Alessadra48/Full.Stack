"""Las estructuras alternativas pueden utilizarse para validar datos. Por
ejemplo, si se intenta crear una función que tome dos enteros como
parámetro y muestre el resultado de su división, puede ocurrir un error si el
denominador es cero. Utilice la estructura alternativa para validar que el
denominador no sea cero; en caso de serlo, la función deberá mostrar el
mensaje “No se puede dividir por 0!” en lugar de intentar mostrar el
resultado."""


def division(numero1,numero2):
    
    if (numero1!=0): 
        resultado= numero1/numero2
        print(f'Su resultado es: {resultado}')
    else:
            print('No se puede dividir por 0')
 

