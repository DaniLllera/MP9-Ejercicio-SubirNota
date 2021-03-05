package com.company;


public class Persona extends  Thread {
        Bany bany = new Bany();

    String genero;

        int tmp;

    public Persona(String genero, String nombre,Bany bany) {
        super(nombre);
        this.genero = genero;
        this.bany = bany;
    }


    @Override
    public void run() {


        for (;;) {
        if (genero!=null)
            bany.entrar();


        tmp =  (int) ((Math.random()*4000));
        System.out.println(getName() +  " " + "En el baño....");

        try {
            Thread.sleep(tmp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(genero!=null)
            bany.salir();
        System.out.println(getName() + " " + "Saliendo del baño....");


    }
    }

}
