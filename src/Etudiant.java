import java.util.ArrayList;

public class Etudiant extends Personne {
    public ArrayList<Personne> cours;

    public Etudiant(String nom, String prenom, int age, String email) {
        super(nom, prenom, age, email);
    }
}
