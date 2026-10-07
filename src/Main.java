public class Main {
    public static void main(String[] args) {
        Ecole ecole = new Ecole();

        Etudiant e1 = new Etudiant("Dupont", "Jean", 20, "jean.dupont@email.fr");
        e1.ajouterCours("Java");
        e1.ajouterCours("SQL");

        Etudiant e2 = new Etudiant("Durand", "Sophie", 22, "sophie.durand@email.fr");
        e2.ajouterCours("PHP");
        e2.ajouterCours("Web");

        ecole.ajouterPersonne(e1);
        ecole.ajouterPersonne(e2);

        System.out.println("--- Liste des personnes dans l'école ---");
        ecole.listerPersonne();

    }
}