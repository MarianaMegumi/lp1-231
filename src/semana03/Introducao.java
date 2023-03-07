package semana03;

import java.util.Scanner;//java<util<lang< scaner 

public class Introducao{ //classe começa com letra maisúscula
    
    public static void main(String[] args){
        // Comentário de linha
        /*
         * Comentário
         * de
         * Várias linhas
         */
        //------------------------------------------
        // Tipos primitivos:

        /*Inteiros:
         * byte, short, int, long
         */
        byte n1 = 100; // 1 byte(-128 - 127)
        short n2 = 3000; // 2 bytes(-32768 - 32767)
        int n3 = 4000000; // 4 bytes(2 bilhoes)
        long n4 = 212212; // 8 bytes

        /* Ponto flutuante
         * float, double
         */
        float nota1 = 9.5f; // 4 bytes *PRECISA* do .f, padrão é double
        double nota2 = 9.5; // 8 bytes

        /*char */
        char letra = 'A';

        /*boolean */
        boolean ligado = true;
        boolean desligado = false;

        /*string */
        String palavra = "Olá mundo"; /*S maiúsculo = Classe(possui métodos) */
        System.out.println(palavra);
        System.out.println(palavra.toLowerCase());//<- métodos
        System.out.println(palavra.toUpperCase());
        
        /*Variáveis e constantes
         * tipo nome = valor;
         * tipo nome;
         * nome = valor;
         */
        short idade = 30;
        //ou
        short idade2;
        idade2 = 30; //NÃO é boa prática

        // Java 10 - Inferência de tipos
        var sobrenome = "Santos"; //<-apesar do "var", supõe q é string
        var idade3 = 25;
        //função: substitui nomes de tipos com nomes mto grandes

        // Constantes (valor não alterado)
        final double TESTE = 30.4; //nome digitado com capslock
        //------------------------------------------
        // Entrada e saída de dados
        // Instancia um objeto scanner para receber dados do usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu nome");/*classe dentro de lang(language) nao precisa de importe de outra biblioteca */
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        short idadeInformada = sc.nextShort();

        System.out.println(nomeInformado + " " + idadeInformada);

        //Fecha o objeto Scanner liberando os recursos alocados
        sc.close();
       
    }
}