package gestion;


import com.company.Livre;

public class Personne extends Livre {
    final int code;
    private Livre liv;
    private int nb_liv;

    public Personne(int ISBN, String titre, String[] auteurs, String editeur, int ann_edition, int nb_exp, int nombre, String type, String tome, int code, Livre liv, int nb_liv) {
        super(ISBN, titre, auteurs, editeur, ann_edition, nb_exp, nombre, type, tome);
        this.code = code;
        this.liv = liv;
        this.nb_liv = nb_liv;
    }

    public int getCode() {
        return code;
    }

    public Livre getLiv() {
        return liv;
    }

    public void setLiv(Livre liv) {
        this.liv = liv;
    }

    public int getNb_liv() {
        if(nb_liv==1 || nb_liv==0) {
            return nb_liv;
        }
        return -1;
    }


    public void setNb_liv(int nb_liv) {
        this.nb_liv = nb_liv;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "code=" + code +
                ", liv=" + liv +
                ", nb_liv=" + nb_liv +
                "} " + super.toString();
    }
}
