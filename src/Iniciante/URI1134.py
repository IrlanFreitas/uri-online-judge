
[alcool, gasolina, diesel, valor_pesquisa] = [0 , 0, 0, 0]

while valor_pesquisa != 4:

    valor_pesquisa = int(input())

    if valor_pesquisa == 1:
        alcool += 1
    elif valor_pesquisa == 2:
        gasolina += 1
    elif valor_pesquisa == 3:
        diesel += 1

print("MUITO OBRIGADO")
print("Alcool: {}".format(alcool))
print("Gasolina: {}".format(gasolina))
print("Diesel: {}".format(diesel))