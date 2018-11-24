primeiro_valor = int(input())
segundo_valor = int(input())

# print(primeiro_valor, segundo_valor)

if primeiro_valor > segundo_valor:
    aux = primeiro_valor
    primeiro_valor = segundo_valor
    segundo_valor = aux

# Troca de valores
# print(primeiro_valor, segundo_valor)

primeiro_valor += 1

while primeiro_valor < segundo_valor:

    if primeiro_valor % 5 == 3 or primeiro_valor % 5 == 2 :
        print(primeiro_valor)
    primeiro_valor += 1


