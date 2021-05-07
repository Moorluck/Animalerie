package be.bxl.formation.models;

public class Chat extends Animal{
    private String caractere;
    private boolean griffeCoupee;
    private boolean longPoil;

    // Getter

    public String getCaractere() {
        return caractere;
    }

    public boolean isGriffeCoupee() {
        return griffeCoupee;
    }

    public boolean isLongPoil() {
        return longPoil;
    }

    // Setter

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public void setGriffeCoupee(boolean griffeCoupee) {
        this.griffeCoupee = griffeCoupee;
    }

    public void setLongPoil(boolean longPoil) {
        this.longPoil = longPoil;
    }

    // Constructeur

    public Chat(String nom, int poids, int taille, boolean sexe, int age, String dateArrivee,
                String caractere, boolean griffeCoupee, boolean longPoil) {
        super(nom, poids, taille, sexe, age, dateArrivee);
        this.setCaractere(caractere);
        this.setGriffeCoupee(griffeCoupee);
        this.setLongPoil(longPoil);
        this.setProbabiliteDeces(0.005);
    }

    // Méthode

    public String getGriffe() {
        if (this.isGriffeCoupee()) {
            return "Coupées";
        }
        else {
            return "Non-coupées";
        }
    }

    public String getPoil() {
        if (this.isLongPoil()) {
            return "Longs";
        }
        else {
            return "Courts";
        }
    }

    @Override
    public String getCaracteristiques() {
        String catCaracteristic = String.format("Caractère : %s \n" +
                "Griffe : %s \n" +
                "Poil : %s \n", this.getCaractere(), this.getGriffe(), this.getPoil());
        return super.getCaracteristiques() + catCaracteristic;
    }

    @Override
    public String cri() {
        return "Miaou";
    }
}
