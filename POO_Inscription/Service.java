public class Service {

     //Taille Reservation :nbre Cellule du Tableau
      final int TAILLE=10;
    //Taille Réélle :nbre element du Tableau
      private int nbreClasse=0;//nbre Classe dans le tableau ,
                               //mais aussi la position d'insertion
      private int nbrePersonne=0;
    //Declaration des Tableaux
    private Classe tabclasse[];
    private Personne [] tabPersonne;

    public Service(){
        //Creation du Tableau
        tabclasse=new Classe[TAILLE];
        tabPersonne=new Personne[TAILLE];
        

    }


    public void ajouterClasse(Classe classe){
        
            tabclasse[nbreDeClasse]=classe;
            nbreDeClasse++;
        
        
    }

    public void listerClasse(){
        for(int i=0;i<nbreDeClasse;i++){
            System.out.println(tabclasse[i].affiche());
        }
        
    }
    public void inscrireEtudiant(Etudiant et){
        
            tabPersonnes[nbreDePersonne]=et;
            nbreDePersonnes++;
        
        
    }
    public void listerEtudiant(){
        for(int i=0;i<nbreDePersonne;i++){
            System.out.println(tabPersonnes[i]et.affiche());
        }
        
    }

    public void  ajouterPersonne(Personne pers){

    }

    public void listerEtudiantParClasse(){
       
        for(int i=0;i<nbreEtudiant;i++){
            System.out.println(tabclasse[i].affiche());
        }
        
        
    }

    public void affecterProfesseur(Professeur prof){
        
            tabPersonne[nbreDePersonne]=Personne;
            nbreDePersonne++;
        
        
    }

    public void listerProfesseur(Professeur prof){
        
        for(int i=0;i<nbreDePersonne;i++){
            System.out.println(tabPersonnes[i]prof.affiche());
        }
        
        
        
    }



    //Uc 



    
}
