import java.util.ArrayList;

public class Etudiant extends Personne {
    private ArrayList<String> cours;

    public Etudiant(String nom, String prenom, int age, String email) {
        super(nom, prenom, age, email);
        this.cours = new ArrayList<String>();
    }

    public void ajouterCours(String unCours) {
        this.cours.add(unCours);
    }

    public String afficherCours() {
        return String.join(", ", this.cours);
    }

    @Override
    public String getRole() {
        return "Étudiant inscrit aux cours : " + afficherCours();
    }
}