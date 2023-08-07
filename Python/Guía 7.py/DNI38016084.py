
"""
Realice las funciones solicitadas a continuación
No cambie los nombres de las funciones
Ninguna función necesita ingreso por teclado
por lo cual ninguna lleva la instrucción "input"

El archivo se debe guarda con el nombre:
    DNIxxxxxxxx.py
Donde DNI va con MAYÚSCULAS y xxxxxxxx debe ser su Nro de DNI

"""

"""
Realice una función que reciba 2 números enteros distintos y 
retorne el mayor de los números elevado al menor.
"""
def potencia(a,b): #No cambiar este encabezado
    if(a<b):
        return(b**a)
    else:
        return(a**b)


"""
Realice una función que reciba el importe de un pedido hecho y devuelva 
lo que debo pagar cuando llegue teniendo en cuenta que el
envio cuesta un 10% de la compra - Si corresponde redondear en 2 decimales
"""
def pagoPropina(importe): #No cambiar este encabezado
    importe = importe + (importe / 10)
    return round(importe,2)
    

"""
Realice una función que reciba dos números como parámetro y retorne
la sumatoria de todos los números que existen entre ellos, incluidos estos dos.
Por ejemplo:
 - Si los números ingresados son 3 y 7 deberá retornar 25.
 - Si los números ingresados son 5 y 1 deberá retornar 15.

"""
def sumatoria(n1, n2): #No cambiar este encabezado
    sumatoria=0
    if(n1<n2):
        mayor = n2
        menor = n1
    else:
        mayor = n1
        menor = n2
    for i in range(menor, mayor+1):
            sumatoria = sumatoria + i
    return(sumatoria)
    


'''
Realice una función que reciba dos strings distintos y retorne el string mas corto
'''

def string_corto(a,b):
    len(a)
    len(b)
    if(len(a)<len(b)):
        return(a)
    else:
        return(b)

