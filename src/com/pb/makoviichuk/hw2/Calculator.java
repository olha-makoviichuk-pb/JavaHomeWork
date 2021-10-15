package com.pb.makoviichuk.hw2;

public class Calculator {
    public static void main(String[] args) {
        // char grade = args [0]  .charAt (0);
        char num = '+';
        Scanner scan = new Scanner(System.in);
        int x = 9;
        int y = 0;
        x = scan.nextInt();
        y = scan.nextInt();
        switch (num) {
            case '+':
            System.out.println('+')(x+y));
            break;
            case '-':
            System.out.println('+')(x-y));
            break;
            case '*':
            System.out.println('+')(x*y));
            break;
            case '/':
            System.out.println('+')(x/y));
            break;
        if (y == 0)
    {System.out.println("do not divide by zero")
    break;}
}

