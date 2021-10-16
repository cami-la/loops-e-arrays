package br.com.dio.exercicios;

import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double A, B, media;

            A = sc.nextDouble();
            B = sc.nextDouble();

            media = (A * 3.5 + B      *7.5)/11; //complete os espaços em branco com  as respectivas variáveis.

            System.out.printf("MEDIA = %.5f%n", media); // complete com a média encontrada

            sc.close();
        }

    }
