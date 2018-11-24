[numero, lista_numeros, linha] = [ 1, [], ""]

while numero != 0:
    numero = int(input())
    if numero != 0:
        lista_numeros.append(numero)

for item_numero in lista_numeros:

    count_numeros_linha = 1

    while count_numeros_linha <= item_numero:
        linha += "{} ".format(count_numeros_linha)
        count_numeros_linha += 1

    print(linha.strip())
    linha = ""


