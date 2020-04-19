import org.junit.Assert;
import org.junit.Test;

/** Tests unitaire pour la classe Calcul. **/
public class CalculTest {
/**
* Constante pour representer le chiffre 5.
*/
static final int VAL_5 = 5;
/**
* Constante pour representer le chiffre 3.
*/
static final int VAL_3 = 3;
/**
* Constante pour representer le chiffre 4.
*/
static final int VAL_4 = 4;
/**
* Constante pour representer le chiffre 8.
*/
static final int VAL_8 = 8;
/**
*  Test du constuction de la classe Calcul.
*/
 @Test
 public void testConstructeur() {
  new Calcul();
 }
 /**
*  Test de la function somme().
*/
 @Test
 public void testSomme() {
  Assert.assertEquals(VAL_5, Calcul.somme(2, VAL_3));
 }
 /**
*  Test de la function division().
*/
 @Test
 public void testDivision() {
  Assert.assertEquals(VAL_4, Calcul.division(VAL_8, 2));
  double resultDiv = Calcul.division(3, 0);
  Assert.assertEquals("Divide by zero gives infinity as result", true, Double.isInfinite(resultDiv));
 }
}
