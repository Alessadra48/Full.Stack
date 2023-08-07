"""Modifique el script del ejercicio anterior para que se muestren sólo los números
pares. Para saber si un número es par, utilice el operador de módulo (%)"""
def Pares():
    for n in range(1,101):
        if (n%2==0):
            print(n)
Pares()