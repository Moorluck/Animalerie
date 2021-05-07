package be.bxl.formation.models;

public class Chien extends Animal{

    private String couleurCollier;
    private boolean dresser;
    private String race;



    // Getter

    public String getCouleurCollier() {
        return couleurCollier;
    }

    public boolean isDresser() {
        return dresser;
    }

    public String getRace() {
        return race;
    }

    // Setter

    public void setCouleurCollier(String couleurCollier) {
        this.couleurCollier = couleurCollier;
    }

    public void setDresser(boolean dresser) {
        this.dresser = dresser;
    }

    public void setRace(String race) {
        this.race = race;
    }

    // Constructeur

    public Chien(String nom, int poids, int taille, boolean sexe, int age, String dateArrivee,
                 String couleurCollier, boolean dresser, String race) {
        super(nom, poids, taille, sexe, age, dateArrivee);
        this.setCouleurCollier(couleurCollier);
        this.setDresser(dresser);
        this.setRace(race);
        this.setProbabiliteDeces(0.01);
    }

    // Méthode



    public String getDresser() {
        if (this.isDresser()) {
            return "Oui";
        }
        else {
            return "Non";
        }
    }

    public String getCaracteristiques() {
        String catCaracteristic = String.format("Couleur du collier : %s \n" +
                "Dressage : %s \n" +
                "Race : %s \n", this.getCouleurCollier(), this.getDresser(), this.getRace());
        return super.getCaracteristiques() + catCaracteristic;
    }

    @Override
    public String cri() {
        return "Woof";
    }
}
