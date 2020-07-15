public class Commandes {

     final int TAILLE=50;
     private int nbreClasse=0;
     private int nbrePersonne=0;
   private Classe tabclasse[];
   private Employe [] tabEmploye;

   public Commande(){
       tabService=new Service[TAILLE];
       tabEmploye=new Employe[TAILLE];

   }


   public void creerService(Service service){
    if(nbreService<TAILLE){
       
        Service.setId(nbreService+1);
        tabService[nbreService]=service;
        nbreService++;
    }else{
        System.out.println("Tableau Rempli");
    }
    
}
   public void listerService(){
       for(int i=0;i<nbreService;i++){
           System.out.println(tabService[i].affiche());
       }
       
   }

   
   public void  ajouterEmploye(Employe pers){
         tabEmploye[nbreEmploye]=pers;
          nbreEmploye++;

   }

   public void listerEmloyeParService(Service service){
       for(int i=0;i<nbreEmploye;i++){
           if(tabEmploye[i] instanceof Employe){
                  if(((Employe)tabEmploye[i]).getService().getId()==service.getId()){
                      System.out.println(tabEmploye[i].affiche());
                  }
           }
          
       }
       
   }

    



   
}