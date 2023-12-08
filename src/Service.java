import java.util.ArrayList;

public class Service implements Inote {
    private ArrayList<Etudiant> etudiants;

    public Service() {
        this.etudiants = new ArrayList<>();
    }

    @Override
    public Etudiant ajouterEtudiant(Etudiant e) {
        if (etudiants.contains(e)) {
            System.out.println("exist");
        } else {
            etudiants.add(e);
        }
        return e;
    }

    @Override
    public double calculerMoyenne(String nomEtudiants, String nomMatiere) {
        for (Etudiant et : etudiants)
            if (et.getName().equals(nomEtudiants)) {
                ArrayList<Matiere> matiere = et.getMatieres();
                for (Matiere m : matiere) {
                    if (m.getName().equals(nomMatiere)) {
                        ArrayList<Integer> note = m.getNotes();
                        if (!note.isEmpty()) {
                            double s = 0;
                            for (int n : note) {
                                s += n;
                            }

                            return s / note.size();
                        }

                    }

                }
            }
        return -1;
    }

    @Override
    public double calculerMoyennegeneral(String nomEtudiant, String nomMatiere) {
        for (Etudiant et : etudiants)
            if (et.getName().equals(nomEtudiant)) {
                ArrayList<Matiere> matiere = et.getMatieres();
                if (!matiere.isEmpty()) {
                    double sum = 0;
                    int totnote = 0;

                    for (Matiere m : matiere) {
                        ArrayList<Integer> note = m.getNotes();
                        for (int not : note) {
                            sum += not;
                            totnote++;
                        }

                    }
                    if (totnote > 0) {
                        return sum / totnote;
                    }
                }
            }

               return-1;
}
      boolean verification(String name) {
          for (Etudiant e : etudiants) {
              if (e.getName().equals(name))
                  return true;
          }

          return false;
      }
   public ArrayList<Etudiant> recuperation(){
        return etudiants;
    }
}

