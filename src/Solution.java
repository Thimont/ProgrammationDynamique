/*
import java.util.*;

*/
/**
 * Cette classe pour manipuler les solutions
 *
 *
 * c est une classe a completer
 *
 * @author charge TD
 * @version 2016-2017 
 *//*

 
 public class Solution{
 	boolean[] tableau;
 	Instance instance;
    ListeObjets choisis;
    int utiliteMinimale;
 
        
    public Solution(Instance instanceATrier){
        instance = instanceATrier;
        utiliteMinimale = this.instance.getUtiliteMin();
        choisis = new ListeObjets();
    }

    public void construitListe(){
        ListeObjets lo = instance.getLesObjets();
        lo.trie();
        for(int i = 0; i < lo.taille(); i++) {
            if(i == 0) {
                choisis.ajoute(lo.get(0));
            }
            else if (choisis.getUtilTotale() < utiliteMinimale) {
                choisis.ajoute(lo.get(i));
            }
        }
    }

    public ListeObjets getChoisis() {
        return choisis;
    }

    public boolean[] getTableau() {
        return tableau;
    }

    public Instance getInstance() {
        return instance;
    }
}*/
