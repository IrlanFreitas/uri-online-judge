[quantidade_numeros, limite_numeros] = input().split()
[quantidade_numeros, limite_numeros] = [int(quantidade_numeros), int(limite_numeros)]

count = 1

linha = ""

while count < limite_numeros:

    count_numeros_linha = 1

    while count_numeros_linha <= quantidade_numeros:

        linha += "{} ".format(count)

        count_numeros_linha += 1
        count += 1


    print(linha.strip())
    linha = ""