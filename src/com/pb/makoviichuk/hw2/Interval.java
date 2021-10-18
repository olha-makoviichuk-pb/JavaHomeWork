package com.pb.makoviichuk.hw2;


public class Interval {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 and 100");
    x = scan.nextInt();

    if (x >= 0) {
        System.out.println("[0 -14]");
        if (x <= 14) {
            System.out.println("[0 -14]");
        }
        if (x >= 15)
            if (x <= 35) {
                System.out.println("[15 -35]");
            }
        if (x >= 36)
            if (x <= 50) {
                System.out.println("[36 -50]");
            }
        if (x >= 51)
            if (x <= 100) {
                System.out.println("[51 -100");
            }
        if (x < 0)
            if (x > 100)
                System.out.println("Error.Please enter a number between 0 and 100");
    }