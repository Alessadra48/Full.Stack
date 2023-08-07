
"""Cree un script que le solicite a un alumno de la asignatura Introducción a la
Programación que ingrese las notas de sus dos parciales. Como resultado, se
le debe informar al alumno su situación, junto con la nota promedio. Las
reglas para saber la situación de un alumno son las siguientes:
● Para estar promovido (es decir, cursada aprobada y no requiere
rendir final), el alumno debe haber aprobado ambos parciales y
tener un promedio mayor o igual a 8.
● Para estar regular (cursada aprobada, pero debe rendir final), el
alumno debe haber aprobado ambos parciales (nota mayor o igual
a 4).
● Si el alumno no ha aprobado ambos parciales (es decir, tiene nota
menor que 4 en alguno de ellos), entonces queda en condición de
libre (es decir, puede rendir un final extendido o recursar)."""
def promedio():
    nombre= str(input('Nombre: '))

    nota1= float(input('Ingrese porfavor su nota: '))
    nota2=float(input('Ingrese porfavor su segunda nota: '))
    promedio= (nota1+ nota2)/2

    if(promedio>=8 and promedio>=8):
        print(f'Felicitaciones! {nombre} Esta promovido')

    elif(promedio>=4 and promedio>=4):
            print(f'su situación es regular')
    elif (promedio<4 and promedio<4):
        print(f'Usted es Matias, se encuentra libre')
promedio()