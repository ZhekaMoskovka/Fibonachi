package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = 1;
        int secondNum = 1;
        int sum;
        System.out.print("Введіть скільки чисел потрібно вивести: ");
        int inputNum = input.nextInt();
        System.out.print(firstNum+", "+secondNum+", ");
        for(int i = 3; i <= inputNum; i++){
            sum=firstNum+secondNum;
            System.out.print(sum+", ");
            firstNum=secondNum;
            secondNum=sum;
        }
        System.out.println();
    }
}
