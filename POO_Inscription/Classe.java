public class Classe implements IInscription{

    private int id;
    private String nom;

   


    @Override
    public String affiche(){
       return "Id: "+id+" Nom : "+nom;
    }

}