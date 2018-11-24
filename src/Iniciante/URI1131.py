novo_grenal = 1
vitorias_inter = 0
vitorias_gremio = 0
empates = 0
total_grenais = 0

while novo_grenal != 2:

    valor_inter, valor_gremio = input().split()
    [valor_inter, valor_gremio] = [int(valor_inter), int(valor_gremio)]

    novo_grenal = int(input('Novo grenal (1-sim 2-nao)\n'))

    total_grenais += 1

    if valor_inter > valor_gremio:
        vitorias_inter += 1
    elif valor_gremio > valor_inter:
        vitorias_gremio += 1
    else:
        empates += 1

if vitorias_inter > vitorias_gremio:
    vencedor = "Inter venceu mais"
elif vitorias_gremio > vitorias_inter:
    vencedor = "Gremio venceu mais"
else:
    vencedor = "Nao houve vencedor"

print("{} grenais".format(total_grenais))
print("Inter:{}".format(vitorias_inter))
print("Gremio:{}".format(vitorias_gremio))
print("Empates:{}".format(empates))
print(vencedor)
