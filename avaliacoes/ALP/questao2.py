# PYTHON                                                                # PSEUDO CODIGO

def questao2() -> None:                                                 #   Algoritmo QUESTAO2
                                                                        #   Declarar
                                                                        #       altura, soma_h, soma_m, media_h, media_m : real;
                                                                        #       i, sexo, qtd_h, qtd_m : int;
                                                                        #   Inicio
    soma_h = 0                                                          #       soma_h = 0;
    qtd_h = 0                                                           #       qtd_h = 0;
    soma_m = 0                                                          #       soma_m = 0;
    qtd_m = 0                                                           #       qtd_m = 0;
    for i in range(1, 51):                                              #       Para (i = 1; i < 51; i++) Faça
        altura = float(input("Digite a altura: "))                      #           ler altura;
        sexo = int(input("Digite o sexo (1 - Masc, 2 - Fem): "))        #           ler sexo;
        if sexo == 1:                                                   #       Se (sexo == 1) Entao
            soma_h = soma_h + altura                                    #           soma_h = soma_h + altura;
            qtd_h = qtd_h + 1                                           #           qtd_h = qtd_h + 1;
        else:                                                           #       Senao
            if altura >= 1.50 and altura <= 1.75:                       #           Se (altura >= 1.50 e altura <=1.75) Entao
                soma_m = soma_m + altura                                #               soma_m = soma_m + altura;
                qtd_m = qtd_m + 1                                       #               qtd_m = qtd_m + 1;
                                                                        #           Fim-Se
                                                                        #       Fim-Se
        if i == 1 or altura > maior:                                    #       Se (i == 1 ou altura > maior) Entao
            maior = altura                                              #           maior = altura;
                                                                        #       Fim-Se
        if i == 1 or altura < menor:                                    #       Se (i == 1 ou altura < menor) Entao
            menor = altura                                              #               menor = altura;
                                                                        #       Fim-Se
    media_m = soma_m / qtd_m                                            #       media_m = soma_m / qtd_m;
    media_h = soma_h / qtd_h                                            #       media_h = soma_h / qtd_h;
    print("a) Maior = " + str(maior) + ", Menor = " + str(menor))       #       mostrar ("a) Maior = " + maior + ", Menor = " + menor);
    print("b) Média das mulheres entre 1.50 e 1.75 = " + str(media_m))  #       mostrar("b) Media mulheres entre 1,50 e 1,75 = " + media_m);
    print("c) Média dos homens: " + str(media_h))                       #       msotrar ("c) Media dos homens = " + media_h)
                                                                        #   Fim

questao2() # --> Executar questao2