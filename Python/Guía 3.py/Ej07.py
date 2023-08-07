"""Cree un script que determine si un triángulo es isósceles, equilátero, o
escaleno. Para determinar esto, se le solicitará al usuario ingresar tres
números, correspondientes a los tres lados del triángulo.
equilátero = todos los lados iguales
isósceles = dos lados iguales
escaleno = todos los lados diferentes"""
def triangulo():
    lado=float(input('Ingrese el valor del primer lado: '))
    lado2=float(input('Ingrese el segundo lado: '))
    lado3=float(input('Ingrese el trecer valor: '))
    if (lado==lado2 and lado==lado3):
        print(f'Su triangulo Equilátero')
    elif(lado==lado2 and lado!=lado3 or lado==lado3 and lado!=lado2):
            print(f'Su triangulo Isósceles')
    elif(lado!=lado2 and lado!=lado3):
                  print(f'Su triagulo es escaleno')
triangulo()
