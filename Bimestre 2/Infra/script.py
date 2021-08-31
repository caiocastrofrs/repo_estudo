import fileinput
a = 0
for nome in fileinput.input("lista_nomes.txt"):
    if nome.strip() == "Pia":
        print ("Encontrei o Pia")
    else:
        a += 1
        
print ("Encontrei outros ", a, "nomes")
