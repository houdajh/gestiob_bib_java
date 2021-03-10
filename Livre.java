package com.company;

public class Livre extends Documents{
    private int nombre;
    private String type;
    private String tome;



    public Livre(int ISBN, String titre, String[] auteurs, String editeur, int ann_edition, int nb_exp, int nombre, String type, String tome) {
        super(ISBN, titre, auteurs, editeur, ann_edition, nb_exp);
        this.nombre = nombre;
        this.type = type;
        this.tome = tome;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "nombre=" + nombre +
                ", type='" + type + '\'' +
                ", tome='" + tome + '\'' +
                "} " + super.toString();
    }
}
