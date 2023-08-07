
"""
Realice las funciones solicitadas a continuación
No cambie los nombres de las funciones
Ninguna función necesita ingreso por teclado ni
mostrar algo por pantalla por lo cual ninguna lleva
Ni la instrucción "input" Ni la instrucción "print"

El archivo se debe guarda con el nombre:
    DNIxxxxxxxx.py
Donde DNI va con MAYÚSCULAS y xxxxxxxx debe ser su Nro de DNI

Al final del archivo hay un espacio para que realice las pruebas
de funcionamiento, una vez finalizadas las pruebas se debe borrar todo 
lo que allí se escribió


COLOQUE SUS DATOS
  Apellido y Nombre: 
  DNI: 

"""


"""
Realice una función que reciba una lista con números enteros y 
RETORNE otra lista con los números de la primera que sean divisibles por 5.
Ejemplo lista=[3,15,12,20,25,42,75,23] RETORNA [15,20,25,75]
"""
def divx5(lista): #No cambiar este encabezado
	pass   

"""
Realice una función que reciba una lista con números enteros y 
RETORNE un número que sea el resulado de sumar todos los números
de las posiciones impares de la lista.
Ejemplo Lista=[7,3,12,23,15,11] RETORNA   34 
Ejemplo Lista=[4,22,10,54,27,12] RETORNA  41 
"""
def sumaposimpares(lista): #No cambiar este encabezado
    suma = 0
    for i in range(len(lista)):
        if i % 2 != 0:  # si la posición es impar
            suma += lista[i]
    return suma

"""
Realice una función que reciba dos números distintos como parámetros y 
RETORNE una lista con los cuadrados de todos los números entre ellos dos 
incluidos ambos.
Por ejemplo: recibe  3 y 8 RETORNA [9,16,25,36,49,64]
Por ejemplo: recibe 10 y 6 RETORNA [36,49,64,81,100]

"""
def cuadrados(n1,n2): #No cambiar este encabezado
	pass

#***********************************************************************
#  Espacio para pruebas,  BOORAR las pruebas antes de entregar
#***********************************************************************


#***********************************************************************
# FIN  Espacio para pruebas
#***********************************************************************

