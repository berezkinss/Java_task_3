package com.company;

public class Main {

    public static void main(String[] args) {

        int fib1 = 1;
        int fib2 = 1;
        int value = 2;
        int ans = 1;

        System.out.print(fib1 + " ");
        while (value <= 11) {
            System.out.print(ans + " ");
            ans = fib1 + fib2;
            fib1 = fib2;
            fib2 = ans;
            value++;


        }

        int fib3 = 1;
        int fib4 = 1;
        int i = 1;
        int answer = 1;
        System.out.println("\n");
        System.out.print(fib3 + " ");
        for(i = 0;i < 10;i++) {
            System.out.print(answer + " ");
            answer = fib3 + fib4;
            fib3 = fib4;
            fib4 = answer;

        }
        

    }
}




