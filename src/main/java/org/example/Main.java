package org.example;

public class Main {
    public static void main(String[] args) {
        Pies pies = new Pies();
        System.out.println("pierwsza funkcja");
        pies.szczekaj();
        System.out.println("druga funkcja(4 razy)");
        pies.szczekaj(4);
    }
}