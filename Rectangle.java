import java.lang.Math;
public class Rectangle extends Figure{

//@Override => methode Redefinie
   
  //Constructeur par défaut
   //Surcharge
    //Deux methodes sont surchargées lorsqu'elles:
     //1-Ont le meme nom et le meme type retour
    //Mais elles doivent pas avoir le meme nombre Arguments
     //Ou si elles le meme nombre Arguments alors les arguments
    //ne doivent pas etre du meme type
   public Carre (){
   }

   //Surchage
    public Rectangle (double longueur,double Largeur){
       this.longueur=longueur;
       this.Largeur=Largeur;
   }


   @Override
   public double demiPerimetre() {
      return this.longueur + this.Largeur;
   } 
   public double perimetre() {
      return demiPerimetre()*2;
   }   

  @Override
   public double surface() {
     return this.longueur*this.Largeur;
} 


  @Override
   public double diagonale(){
     return Math.sqrt(Math.pow(this.longueur,2)+Math.pow(this.Largeur,2));
     
   }   

}






