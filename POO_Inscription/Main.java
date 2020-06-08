public static void main(String args[]){
Scanner clavier=new Scanner(System.in);
Service service=new Service ();
String choix;
do{
   System.out.println("1-Ajouter Classe");
   System.out.println("2-Lister Classe");
   System.out.println("3-Inscrire Etudiant");
   System.out.println("4-Lister Etudiant");
   System.out.println("5-Affecter Professeur");
   System.out.println("6-Lister Professeur");
   System.out.println("7-Quitter");
   System.out.println("Faites votre choix");
   choix=Integer.parseInt(clavier.nextLine());

switch(choix){
      case "1":
         System.out.println("Entrer le Libelle d'une Classe");
         String libelle=clavier.nextline();
         Classe cl=new Classe(libelle);
        /*cl.setLibelle(libelle);*/
         service.ajouterClasse(cl);
     break;
     case 2:
        Sytem.out.println("------------------")
        service.listerClasse();
        System.out.println("-----------------")
        break;
    case 3:
        Sytem.out.println("------------------")
        service.inscrireEtudiant();
        System.out.println("-----------------")
        break;
    case 4:
        Sytem.out.println("------------------")
        service.listerEtudiant();
        System.out.println("-----------------")
        break;
    
    case 5:
        Sytem.out.println("------------------")
        service.affecterProfesseur();
        System.out.println("-----------------")
        break;
   
    case 6:
        Sytem.out.println("------------------")
        service.listerProfesseur();
        System.out.println("-----------------")
        break;
}}
}
