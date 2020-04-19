/** Une classe. **/
public class Calcul {
/**
* Constante pour representer le nombre 10.
*/
static final int LIMIT = 10;
  /**
  *Calcul la somme de deux nombres.
  *@param a premier nombre entier
  *@param b second nombre entier
  *@return somme des valeurs passees en parametre.
  **/
  public static int somme(final int a, final int b) {
    return a + b;
  }
  /**
  *Fonction maFonction.
  *@param a premier nombre entier
  *@param b second nombre entier
  *@return retourne b si supérieur à la limite sinon retourne le produit a/b.
  **/
  public static int maFonction(final int a, final int b) {
   if (b >= LIMIT) {
    return a / b;
   }
   return b;
  }
  /**
  *divise le premier nombre par le second.
  *@param a premier nombre entier
  *@param b second nombre entier
    * @return a / b si b != 0
    * @throw IllegalArgumentException si b == 0
    */
  public static int division(final int a, final int b) {
   if (b == 0) {
     throw new IllegalArgumentException("b ne doit pas etre 0");
   }
   return a / b;
  }
}
