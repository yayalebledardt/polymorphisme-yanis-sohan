public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int age;
    protected String email;

    public Personne(String nom, String prenom, int age, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.email = email;
    }

    public String getDescription() {
        return nom + " " + prenom + ", " + age + " ans, " + email;
    }


}
