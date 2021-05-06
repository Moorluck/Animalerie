package be.bxl.formation.models;

public class Oiseau extends Animal{
    private String couleur;
    private boolean voliere;



    // Getter

    public String getCouleur() {
        return couleur;
    }

    public boolean isVoliere() {
        return voliere;
    }

    // Setter

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setVoliere(boolean voliere) {
        this.voliere = voliere;
    }

    // Constructeur

    public Oiseau(String nom, int poids, int taille, boolean sexe, int age, String dateArrivee,
                  String couleur, boolean voliere) {
        super(nom, poids, taille, sexe, age, dateArrivee);
        this.setCouleur(couleur);
        this.setVoliere(voliere);
        this.setProbabiliteDeces(0.3);
    }

    // Méthode

    public String getVoliere() {
        if (isVoliere()) {
            return "En volière";
        }
        else {
            return "En cage";
        }
    }

    public String getCaracteristiques() {
        String catCaracteristic = String.format("Couleur : %s \n" +
                "Vie : %s \n",
                this.getCouleur(), this.getVoliere());
        return super.getCaracteristiques() + catCaracteristic;
    }


}
