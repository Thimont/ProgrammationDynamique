/**
 * Classe qui permet de generer une instance
 * @version 2016-2017
 * @author Charge de TD 
 */


public class Generator {
   /**
   * ordre de poids des instances à creer
   */
   public int op;
   /**
   *  ordre des utilites des instance a creer
   */
   public int ou;
   /**
   * taille de l'instance
   */
   public int t;
   
/**
 * Constructeur
 * @param t
 * @param op
 * @param ou 
 */
public Generator(int t,int op, int ou){
   this.op = op;
   this.t=t;
   this.ou = ou;
}


/**
* methode qui cree une instance en fonction des attributs
* @return une instance
*/

public Instance makeInstance(){
   Instance pb; 
   int poids;
   int util;

   int poidsExemple[] = {3, 5, 2, 6, 4};
   int utilExemple[] = {3, 4, 1, 4, 5};
   int nbObjet = 5;
   ListeObjets x;

   /*x=new ListeObjets();
   for(int i = 0; i<t; i++) {
       poids=(int)(Math.random()*this.op)+1;
       util=(int)(Math.random()*this.ou)+1;
       x.ajoute(new Objet(i+1,poids, util));
   }
   util=(int)(Math.random()*x.getUtilTotale()*0.8);
   if (util <0) util=0;*/

   x = new ListeObjets();
   for (int i  = 0; i < nbObjet; i++){
      x.ajoute(new Objet(i+1, poidsExemple[i], utilExemple[i]));
   }

   util = 11;

   pb=new Instance(5,x,util);
   return pb;
}


}
