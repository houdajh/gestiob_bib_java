package com.company;

import java.util.Arrays;

public class Documents {
    final int  ISBN;
    private String titre;
    private String[] auteurs;
    private String editeur;
    private int ann_edition;
    private int nb_exp;
    private static int counter = 0;
    final int numero;

    public Documents(int ISBN, String titre, String[] auteurs, String editeur, int ann_edition, int nb_exp) {
        numero = counter;
        counter++;
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteurs = auteurs;
        this.editeur = editeur;
        this.ann_edition = ann_edition;
        this.nb_exp = nb_exp;
    }

    public int getISBN() {
        return ISBN;
    }
    public void incrementer() {
        this.nb_exp++;
    }

    public void decrementer() {
        if (nb_exp > 0)
            this.nb_exp--;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String[] getTab_aut() {
        return auteurs;
    }

    public void setTab_aut(String[] tab_aut) {
        this.auteurs = tab_aut;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getAnn_edition() {
        return ann_edition;
    }

    public void setAnn_edition(int ann_edition) {
        this.ann_edition = ann_edition;
    }

    public int getNb_exp() {
        return nb_exp;
    }

    public void setNb_exp(int nb_exp) {
        this.nb_exp = nb_exp;
    }

    @Override
    public String toString() {
        return "Document{" +
                "ISBN=" + ISBN +
                ", titre='" + titre + '\'' +
                ", tab_aut=" + Arrays.toString(auteurs) +
                ", editeur='" + editeur + '\'' +
                ", ann_edition=" + ann_edition +
                ", nb_exp=" + nb_exp +
                ", numero=" + numero +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Document supprime !");
    }

}
