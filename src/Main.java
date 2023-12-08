import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();
        ArrayList<Integer> listnote=new ArrayList<>();
        ArrayList<Matiere> lmatieres=new ArrayList<>();



        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("welcomme");
            System.out.println("1. Saisie des notes d'un étudiant");
            System.out.println("2.recuper tout les etudiants");
            System.out.println("3. Calcul de la moyenne");
            System.out.println("0. Quitter");
            System.out.print("votre choix:");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("entrer votre name");
                    String name = scanner.next();
                    boolean resultat = service.verification(name);
                    if (resultat)
                        System.out.println("exist");
                    System.out.println("combien de matiere");
                    int nbrmat = scanner.nextInt();
                    for (int i=0;i<nbrmat;i++) {
                        System.out.println("le nom de la matiere" + (i + 1));
                        String name1 = scanner.next();

                        System.out.println("combien de note");
                        int nbrnote = scanner.nextInt();

                        for (int j = 0; j < nbrnote; j++) {
                            System.out.println("la note " + (j+ 1));
                            int note1 = scanner.nextInt();
                            listnote.add(note1);
                        }
                       Matiere matiere=new Matiere(name1,listnote);
                        lmatieres.add(matiere);
                    }
                    Etudiant etudiant=new Etudiant(name,lmatieres);
                    service.ajouterEtudiant(etudiant);

                    break;
                case 2:
                    ArrayList<Etudiant> recp = service.recuperation();
                    for (Etudiant etudian : recp) {
                        System.out.println(etudian);
                    }
                    break;
                case 3:
                    System.out.println("Entrer votre nom");
                    String nom = scanner.next();
                    // Demander à l'utilisateur de choisir entre deux options
                    System.out.println("1. Calculer la moyenne des matières");
                    System.out.println("2. Calculer la moyenne générale");
                    int choixMoyenne = scanner.nextInt();

                    switch (choixMoyenne) {
                        case 1:
                            // Logique pour calculer la moyenne des matières
                            System.out.println("Calcul de la moyenne des matières...");
                            System.out.println("entrer le de la matiere");
                            String namematiere=scanner.next();
                            service.calculerMoyenne(nom,namematiere);
                            break;
                        case 2:
                            // Logique pour calculer la moyenne générale
                            System.out.println("Calcul de la moyenne générale...");
                                   service.calculerMoyennegeneral(nom,namematiere);
                            break;
                         }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("votre choix invalide");

            }

        }

    }
}