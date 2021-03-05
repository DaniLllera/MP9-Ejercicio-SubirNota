package com.company;

public class Bany  {

    public  enum  estadodelbaño{
        LLIURE, OCUPAT
    }
    private  Enum<estadodelbaño> estat;

    int capacidad;


    public synchronized void entrar() {


        try {
            if (capacidad >= 2)
            while (estat == estadodelbaño.OCUPAT) wait();
            estat = estadodelbaño.OCUPAT;
            capacidad++;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }


    public synchronized void salir() {
        estat = estadodelbaño.LLIURE;
        capacidad--;
        notifyAll();
    }
}
