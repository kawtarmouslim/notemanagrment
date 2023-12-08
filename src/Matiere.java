import java.util.ArrayList;

public class Matiere {
    private String name;
   private   ArrayList<Integer> notes;

    public Matiere(String name, ArrayList<Integer> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }
}
