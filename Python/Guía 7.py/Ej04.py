"""Cree un script que le solicite al usuario ingresar un número entero, y muestre
en pantalla el factorial de dicho número. NOTA: puede obviar la validación en
este ejercicio, pero recuerde que la función range no incluye al valor máximo
enviado como parámetro.
factorial de n = n! = 1 * 2 * 3 * … * (n - 1) * n"""
def calculo(numero):
    factorial=1
    for n in range(1,numero+1):
        p=n
        factorial= factorial * p
    print(factorial)
    
