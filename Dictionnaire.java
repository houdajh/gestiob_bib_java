package com.company;

public class Dictionnaire extends Documents{
    private int langue;
    private int nb_tomes;



    public Dictionnaire(int ISBN, String titre, String[] auteurs, String editeur, int ann_edition, int nb_exp, int langue, int nb_tomes) {
        super(ISBN, titre, auteurs, editeur, ann_edition, nb_exp);
        this.langue = langue;
        this.nb_tomes = nb_tomes;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue=" + langue +
                ", nb_tomes=" + nb_tomes +
                "} " + super.toString();
    }
}
