# PYTHON                                                                # PSEUDO CODIGO

# OBS.: palavra-chave "global" diz que o python deve utilizar
#       a variável global e impede que seja criada
#       uma variável local com o mesmo nome

def questao3() -> None:                                                 #   Algoritmo QUESTAO3
                                                                        #   Declarar
    global num                                                          #       num: int;
                                                                        #   Inicio
    num = int(input("Digite um número entre 3 e 10: "))                 #       Ler num;
    while num < 3 or num > 10:                                          #       Enquanto (num < 3 ou num > 10) Faça
        print("VALOR INVÁLIDO")                                         #           Mostrar ("VALOR INVÁLIDO");
        num = int(input("Digite novamente um número entre 3 e 10: "))   #           Ler num;
                                                                        #       Fim-Enquanto
    mostrar_serie()                                                     #       mostrar_serie()
                                                                        #   Fim

def mostrar_serie() -> None:                                            #   Algoritmo mostrar_serie()
                                                                        #   Declarar
                                                                        #       serie : real;
                                                                        #       denominador, i, fatorial : int;
                                                                        #   Inicio
    global num          
    serie = 0                                                           #       serie = 0;           
    denominador = 1                                                     #       denominador = 1;
    while num >= 1:                                                     #       Enquanto (num >= 1) Faça
        fatorial = 1                                                    #           fatorial = 1;
        for i in range(1, denominador + 1):                             #           Para (i = 1; i <= denominador; i++) Faça
            fatorial = fatorial * i                                     #               fatorial = fatorial * i;
                                                                        #           Fim-Para
        serie = serie + (num / fatorial)                                #           serie = serie + (num / fatorial);
        num = num - 1                                                   #           num = num + 1;
        denominador = denominador + 2                                   #           denominador = denominador + 2;
                                                                        #       Fim-Enquanto
    print("O resultado da serie é " + str(serie))                       #       Mostrar ("O resultado da série é " + serie);
                                                                        #   Fim-Segue

questao3() # --> Executar questao3