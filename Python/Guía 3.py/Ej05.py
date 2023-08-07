"""Cree un script que, dado un número de día de la semana ingresado por
teclado, muestre el nombre de ese día en lenguaje natural. La relación entre
números y días de la semana es la siguiente:
1 = Domingo.
2 = Lunes.
3 = Martes.
4 = Miércoles.
5 = Jueves.
6 = Viernes.
7 = Sábado."""
def mes():
    día=int(input('Ingrese un día de la semana: '))
    match día:
        case (1): 
            print('Lunes')
        case (2):
            print('Martes')
        case (3):
            print('Miércoles')
        case (4):
            print('Juves')
        case (5):
            print('Viernes')
        case (6):
            print('Sábado')
        case (7):  
            print('Domingo')
        case _:
            print('ERROR')
mes()