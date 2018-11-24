primeiro_valor = int(input())
segundo_valor = int(input())

# Perfomance melhorada!
if primeiro_valor > segundo_valor:
    aux = primeiro_valor
    primeiro_valor = segundo_valor
    segundo_valor = aux

total_valores = 0

while primeiro_valor <= segundo_valor:

    if primeiro_valor % 13 != 0:
        total_valores += primeiro_valor
    primeiro_valor += 1

print(total_valores)


