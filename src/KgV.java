

import java.util.HashMap;
import java.util.List;



/**
 * Class to calculate the lowest common multiple of two numbers.
 * 
 * @author M. Faulstich
 * @version 3.0
 */
public final class KgV
{

   private KgV() 
   {
   }

   /**
    * Calculate the lowest common multiple of two numbers by Euklid's method.
    * http://de.wikipedia.org/wiki/Euklidischer_Algorithmus Iterative variant.
    * 
    * @param a
    *           First Number.
    * @param b
    *           Second Number.
    * @return Lowest common multiple of tmpA and tmpB or null, if there is
    *         none.
    */
   public static long kgv(int a, int b)
   {
      if (a <= 0)
      {
         throw new IllegalArgumentException("Argument a is smaller than 1: " + a);
      }
      if (b <= 0)
      {
         throw new IllegalArgumentException("Argument b is smaller than 1: " + b);
      }
      
      long max = a < b ? b : a ;
      long min = a < b ? a : b ;
      long i;

      for(i=1; (i*max)%min != 0; i++);
      
      return i*max;
   }

   /**
    * Konvertieren einer Liste von Zahlen (hier Primzahlen) in einen Hash mit Primzahl und Anzahl.
    *
    * @param list Liste der (Primzahlen)
    * @return Hash von Primzahlen (als key) und deren Anzahl (als value).
    */
   private static HashMap<Integer, Integer> createHash(List<Integer> list)
   {
      HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
      for (Integer integer : list)
      {
         Integer act = result.get(integer);
         if (act == null)
         {
            act = Integer.valueOf(0);
         }
         result.put(integer, Integer.valueOf(act.intValue()+1));
      }
      return result;
   }

}
