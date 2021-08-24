package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variáveis
        String nome; //armazena o nome
        int idade; //armazena a idade

        while(true) { //Enquando o loop for verdadeiro
            System.out.println("Nome: "); //Peça o nome
            nome = scan.next(); //armazene esse nome na variável

            if (nome.equals("0")) { //caso o nome igual a "0"
                break; //interrompa o programa
            }

            System.out.println("Idade: "); //Peça a idade
            idade = scan.nextInt(); //armazene a idade na variável

            //imprima o nome e a idade
            System.out.println("Nome: " + nome + " - idade: " + idade);
        }
    }
}
