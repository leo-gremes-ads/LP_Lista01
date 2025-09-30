# PYTHON                                                        # PSEUDO CODIGO

def questao1() -> None:                               #   Algoritmo QUESTAO1
                                                                #   Declarar
                                                                #       clara, flora: real;
                                                                #   Inicio
    clara = float(input("Digite o salário de Clara: "))         #       ler clara;
    flora = clara / 3                                           #       flora = clara / 3;
    print(f"O salário de Flore é {flora}")                      #       mostrar ("O salário de Flora é " + flora);
    compara_investimento(flora, clara)                          #       compara_investimento(flora, clara);
                                                                #   Fim

def compara_investimento(menor: int, maior: int) -> None:       #   Algoritmo compara_investimento(menor: int, maior: int)
                                                                #   Declarar
                                                                #       tempo: int;
                                                                #   Inicio
    tempo = 0                                                   #       tempo = 0;
    while menor < maior:                                        #       Enquanto (menor < maior) faça
        menor = menor + (menor * 0.05)                          #           menor = menor + (menor * 0.05);
        maior = maior * 1.02                                    #           maior = maior * 1.02;
        tempo = tempo + 1                                       #           tempo = tempo + 1;
                                                                #       Fim-Enquanto
    print("Serão necessários " + str(tempo) + " meses")         #       mostrar ("Serão necessários " + tempo + " meses");
                                                                #   Fim-Segue

questao1() # --> Executar questao1