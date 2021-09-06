numero = int(input("Digite um numero"))
divisores = 0
for divisor in range(2, numero):
    if numero == 0 or numero == 1:
        break
    else:    
        if numero % divisor == 0:
            divisores = divisores + 1
            if divisores > 1:
                break
if divisores > 1 or divisores < 1:
  print("não é primo")
else:
  print("é primo")
