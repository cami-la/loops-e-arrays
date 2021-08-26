package br.com.dio.exercicios.loops;

import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int n = 1;

        for(int i = x; i > 0; i--) {
            n = n* i;
        }
        System.out.println(n);
    }

}

