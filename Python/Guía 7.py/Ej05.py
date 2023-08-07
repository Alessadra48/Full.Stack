"""Cree un script que le solicite al usuario ingresar 10 números enteros, y por cada
uno, informarle si el mismo es positivo, negativo, o cero"""
 
def número():
    vector = [10]
    for i in range(1,11):
         número=int(input('Ingrese un número: '))
         vector.append(número)
    for n in range(1,11):
        print(f"\nEl numero: {vector[n]}")   
        if(vector[n]==0):
            print('Es 0')
        elif(vector[n]<0):
            print('Es negativo')
        elif(vector[n]>0):
            print('Es positivo')
        """if(número==0):
              print('Su número es 0')
        elif(número<0):
              print('Su número es negativo')
        elif(número>0):
              print('Su número es positivo')"""
número()