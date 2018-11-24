numeros = input().split()
somatorio = 0

for numero in range(int(numeros[len(numeros) - 1])):
    somatorio += int(numeros[0]) + numero

print(somatorio)
