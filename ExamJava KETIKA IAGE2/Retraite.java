public class Retraite extends Employe  {
    int dEmbauche;
    int duree;

    public Retraite(){


    }
    public Retraite(String nomComplet, int dEmbauche,int duree){
        super(nomComplet);
        this.dEmbauche=dEmbauche;
        this.duree=duree;
        

    }
     public int getdEmbauche() {
        return dEmbauche;
    }
    public void setdEmbauche(int forfait) {
        this.dEmbauche = dEmbauche;
        
    public int getDuree() {
        return duree;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }
   
    }
    @Override
    
    public affiche(){
        super.affiche();
        System.out.println(" dEmbauche= "  +dEmbauche   "duree= " + duree+  );


    }
}