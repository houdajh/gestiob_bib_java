package gestion;


import com.company.Livre;

public class Professeur extends Personne {

    private int  nb_liv_prof;

    public Professeur(int code, Livre liv, int nb_liv_prof) {
        super(code, liv);
        this.nb_liv_prof = nb_liv_prof;
    }

    public int getNb_liv_prof() {
        if(nb_liv_prof<=5 && nb_liv_prof>=0) {
            return nb_liv_prof;
        }
        return -1;
    }

    public void setNb_liv_prof(int nb_liv_prof) {
        this.nb_liv_prof = nb_liv_prof;
    }

}
