package gestion;


import com.company.Livre;

public class Etudiant extends Personne {
    private int nb_liv_Etud;

    public Etudiant(int code, Livre liv, int nb_liv_Etud) {
        super(code, liv);
        this.nb_liv_Etud = nb_liv_Etud;
    }

    @Override
    public int getCode() {
        return super.getCode();
    }

    @Override
    public Livre getLiv() {
        return super.getLiv();
    }

    @Override
    public void setLiv(Livre liv) {
        super.setLiv(liv);
    }

    public int getNb_liv_Etud() {
        if(nb_liv_Etud<=3 && nb_liv_Etud>=0) {
            return nb_liv_Etud;
        }
        return -1;
    }

    public void setNb_liv_Etud(int nb_liv_Etud) {
        this.nb_liv_Etud = nb_liv_Etud;
    }
}
