package br.com.dio.exercicios.arrays.comentado;

import java.util.Random;
/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numeros = new int[20]; //array com 20 posições

        for (int i = 0; i < 20; i++) { //para: variável i = numero, até i menor que 20, acrescentamos 1 ao valor de i a cada loop.
            int numero = random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numeros[i] = numero; //atribuindo esse valor ao elemento na respectiva posição do array numeros.
        }

        System.out.print("Numeros: "); //frase ilustrativa
        //loop for-each
        for (int numero : numeros) { //para cada numero dentro do array de números
            System.out.print(numero + " "); //imprima o número
        }

        System.out.println("\n-----------------"); //separar os vetores

        System.out.print("Sucessores: "); //frase ilustrativa
        for (int numero : numeros) { //para cada numero dentro do array de números
            System.out.print((numero + 1) + " "); //adicione o valor 1 ao número e imprima esse novo valor
        }


    }
}
