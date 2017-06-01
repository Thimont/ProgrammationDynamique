public class ProgrammationDynamique {

    private Instance instance;
    private int utiliteMin;
    private int nbObjets;
    private ListeObjets listeObjets;
    /*
    pour n = 10 objets
    on tire 5 instances avec objets sous la forme numéro, poids, utilité
    pour chaque instance :
    on calcule le temps d'énumération de toutes les solutions d'une instance
    Calculer la solution optimale par énumération
    Calculer la solution optimale par programmation dynamique
    Mesurer son temps de résolution
    Comparer les solutions
    fin.

    Ensuite on fait la moyenne de chacun des temps de résolution
     */

    public ProgrammationDynamique(Instance instance) {
        this.instance = instance;
        this.utiliteMin = instance.getUtiliteMin();
        this.nbObjets = instance.getNbObjets();
        this.listeObjets = instance.getLesObjets();
    }

    // Instance : ensemble d'objets avec poids et utilité minimum
    public int[][] tableau() {
        int[][] matrice = new int[utiliteMin+1][nbObjets+1];

        for (int colonne = 0; colonne<=nbObjets; colonne++) {
            matrice[0][colonne] = 0;
        }

        for (int ligne = 0; ligne <= utiliteMin; ligne ++) {
            matrice[ligne][0] = 0;
        }

        for(int objet = 1; objet <= nbObjets; objet ++) {
            for (int utilite = 1; utilite <= utiliteMin; utilite ++) {
                int index = ((utilite-listeObjets.get(objet-1).getUtil()) < 0) ? 0 : (utilite-listeObjets.get(objet-1).getUtil());
                if (listeObjets.get(objet-1).getUtil() <= utiliteMin) {
                    if (index == 0 && utilite <= listeObjets.get(objet-1).getUtil()) {
                        matrice[utilite][objet] = listeObjets.get(objet-1).getPoids() + matrice[utilite][objet-1];
                    } else {
                        matrice[utilite][objet] = Math.min(matrice[utilite][objet-1],
                                matrice[index][objet-1]+listeObjets.get(objet-1).getPoids());
                    }
                }
            }
        }

        for (int[] rows : matrice) {
            for (int col : rows) {
                System.out.format("%5d", col);
            }
            System.out.println();
        }

        return matrice;
    }
    /*
    prend le tableau remplit er envoie la solution optimale
     */
    /*public void calculSolution(int[][] tableau) {

    }*/
}
