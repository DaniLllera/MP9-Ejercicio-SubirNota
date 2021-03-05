package com.company;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        Bany bany = new Bany();
        Persona persona1 = new Persona("Mujer","Rafaela", bany);
        Persona persona2 = new Persona("Mujer","Carla", bany);
        Persona persona3 = new Persona("Hombre","Rafael", bany);
        Persona persona4 = new Persona("Hombre","Dani", bany);

        persona1.start();
        persona2.start();
        persona3.start();
        persona4.start();

    }
}
