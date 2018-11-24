numero_pum = int(input())

numeros_exibidos = 0
linhas = 0

while linhas < numero_pum:

    print("{} {} {} PUM".format(numeros_exibidos + 1, numeros_exibidos + 2, numeros_exibidos + 3))

    numeros_exibidos += 4
    linhas += 1