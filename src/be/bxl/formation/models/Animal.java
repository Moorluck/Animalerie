package be.bxl.formation.models;

public class Animal {
    private String nom;
    private int poids;
    private int taille;
    private boolean sexe;
    private int age;
    private String dateArrivee;
    private double probabiliteDeces;

    // Getter

    public String getNom() {
        return nom;
    }

    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }

    public boolean isSexe() {
        return sexe;
    }

    public int getAge() {
        return age;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public double getProbabiliteDeces() {
        return probabiliteDeces;
    }

    public String getSexe() {
        if (this.isSexe()) {
            return "Male";
        }
        else {
            return "Femelle";
        }
    }

    // Setter

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public void setProbabiliteDeces(double probabiliteDeces) {
        this.probabiliteDeces = probabiliteDeces;
    }

    // Constructeur

    public Animal (String nom, int poids, int taille, boolean sexe, int age, String dateArrivee) {
        this.setNom(nom);
        this.setPoids(poids);
        this.setTaille(taille);
        this.setSexe(sexe);
        this.setAge(age);
        this.setDateArrivee(dateArrivee);
        this.setProbabiliteDeces(0.0);
    }

    // Méthode

    public String getCaracteristiques() {
        return String.format("Nom : %s \n" +
                        "Poids : %s \n" +
                        "Taille : %s \n" +
                        "Sexe : %s \n" +
                        "Age : %s \n" +
                        "Date d'arrivée : %s \n",
                this.getNom(), this.getPoids(), this.getTaille(), this.getSexe(), this.getAge(), this.getDateArrivee());
    }

    public String cri() {
        return "";
    }
}
