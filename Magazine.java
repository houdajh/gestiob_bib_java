package com.company;

public class Magazine extends Documents{
    private String periodicite;
    private int mois;
    private int jour;


    public Magazine(int ISBN, String titre, String[] auteurs, String editeur, int ann_edition, int nb_exp, String periodicite, int mois, int jour) {
        super(ISBN, titre, auteurs, editeur, ann_edition, nb_exp);
        this.periodicite = periodicite;
        this.mois = mois;
        this.jour = jour;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "periodicite='" + periodicite + '\'' +
                ", mois=" + mois +
                ", jour=" + jour +
                "} " + super.toString();
    }
}
