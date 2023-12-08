import java.util.ArrayList;

public class Etudiant {
    private String name;
  private ArrayList<Matiere> matieres;

    public Etudiant(String name, ArrayList<Matiere> matieres) {
        this.name = name;
        this.matieres = matieres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(ArrayList<Matiere> matieres) {
        this.matieres = matieres;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "name='" + name + '\'' +
                ", matieres=" + matieres +
                '}';
    }
}


