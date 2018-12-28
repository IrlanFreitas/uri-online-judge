x = int(input())
z = 0
while z <= x:
    z = int(input())

acumulado, acumulado_2, ultrapassando_z = x, 0, 0

while acumulado_2 <= z:
    acumulado_2 += acumulado
    acumulado += 1
    ultrapassando_z += 1

print(ultrapassando_z)
