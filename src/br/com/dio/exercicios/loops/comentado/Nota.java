package br.com.dio.exercicios.loops.comentado;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Nota de 0 a 10: "); //Peça uma nota de 0 a 10
        int nota = scan.nextInt(); //Entrada de dados, neste caso de um int

        while(nota < 0 | nota > 10) { //Enquanto o valor da nota for menor que 0 ou maior que 10.
            System.out.println("Nota Inválida!"); //Mensagem que o valor é inválido
            System.out.println("Tente novamente. Nota: "); //Peça novamente a nota
            nota = scan.nextInt(); //Entrada de dados, neste caso de um int
        }

        System.out.println("Nota: " + nota); //imprimindo a nota válida
    }

}
