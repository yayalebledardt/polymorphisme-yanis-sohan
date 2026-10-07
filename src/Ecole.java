import java.util.ArrayList;

public class Ecole {
    private ArrayList<Personne> ListP;

    public Ecole(){
        this.ListP = new ArrayList<Personne>();
    }

    public void ajouterPersonne(Personne unePersonne){
        this.ListP.add(unePersonne);
    }

    public void listerPersonne(){
        for(Personne unePersonne : this.ListP) {
            System.out.println(unePersonne.getDescription());
        }
    }
}