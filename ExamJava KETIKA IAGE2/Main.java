import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choix;
        int nombreService = 10;
        Service[] tabService;
        tabService = new Service[nombreService];
        int serviceActuelle = 0;
      
        do {

            System.out.println("Menu");
            System.out.println("1-Ajout service (id libelle)");
            System.out.println("2- Lister services");
            System.out.println("3-Affecter Employe");
            System.out.println("4-Lister Employe d'un service ");
            System.out.println("5-lister Employe retraite");
            System.out.println("6-Quitter");
            System.out.println("Faites un choix");

            Scanner clavier = new Scanner(System.in);
            choix = clavier.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("Donnner le libele du service");
                    String libelle = clavier.nextLine();
                    Service service = new Service(libelle);
                    tabService[classactuelle] = service1;
                    serviceactuelle++;

                    break;
                case "2":
                System.out.println("Entrer les informations de l'employe");
                System.out.println("Entrer le nom complet de l'employe");
                String fullname=clavier.nextLine();
                System.out.println("Entrer la date d'embauche de l'employe");
                int date=clavier.nextInt();
                System.out.println("Entrer l'Id de l'employe");
                int date=clavier.nextInt();
                Etudiant employe1=new Etudiant(fullname, date, Id);
                System.out.println("afficher les employes qui partent en retraite");
                String employe=clavier.nextLine();
                
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    for (class El : tabclasse) {
                        if (El != null) {

                            El.affiche();

                        }

                    }

                    break;
                case "7":
                    break;

            }

        } while (choix != "7");


    }
}
      
