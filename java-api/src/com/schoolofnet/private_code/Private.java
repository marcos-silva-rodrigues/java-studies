package com.schoolofnet.private_code;

public class Private {

    private String name;

    public Private() {
        System.out.println("Private class");
        this.print();
    }

    private void print() {
        System.out.println("Private print method");
    }
}
