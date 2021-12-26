package com.schoolofnet.learning;

import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Whats your name?");

        String name = reader.nextLine();

        System.out.println("Nice to meeet you " + name);
    }
}
