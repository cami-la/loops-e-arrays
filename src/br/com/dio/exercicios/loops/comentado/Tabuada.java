package br.com.dio.exercicios.loops.comentado;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Número: "); //Peça um número
        int numero = scan.nextInt(); //Entrada de dados, neste caso de um int.

        System.out.println("Tabuada de " + numero + ":");//frase ilustrativa para indicar a tabuada

        //para: variável i = 0, até i menor ou igual a 10, adicionando 1 ao valor de i a cada loop.
        for (int i = 0; i <= 10; i = i + 1) {
            //número escolhido pelo usuário "X" o valor de i "=" a multiplicação do número com o i.
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
