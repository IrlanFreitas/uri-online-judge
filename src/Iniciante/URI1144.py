quantidades_linhas = int(input())

numeros_exibidos = 1

while numeros_exibidos <= quantidades_linhas:

    print("{} {} {}".format(numeros_exibidos ** 1, numeros_exibidos ** 2, numeros_exibidos ** 3))
    print("{} {} {}".format(numeros_exibidos ** 1, numeros_exibidos ** 2 + 1, numeros_exibidos ** 3 + 1))

    numeros_exibidos += 1
