

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
      
   // Primzahlen und deren Anzahl aus denen a besteht
      HashMap<Integer, Integer> hashA =createHash(PrimeNumbers.splitPrimeNumberFactors(a));
      
      // Primzahlen und deren Anzahl aus denen b besteht
      HashMap<Integer, Integer> hashB =createHash(PrimeNumbers.splitPrimeNumberFactors(b));
      
      // Liste aller Primzahlen, aus denen a und b besteht mit dem jeweils höchsten Vorkommen in a oder b
      HashMap<Integer, Integer> resultHash = new HashMap<Integer, Integer>();
      
      // Liste der Primzahlen, aus denen a besteht, dem Ergebnishash zufügen.
      // Falls Primzahl auch in b enthalten ist, jeweils höheres Vorkommen zufügen.
      for (Integer key : hashA.keySet())
      {
         if (!hashB.containsKey(key))
         {
            // Primzahl kommt nur in a vor: Primzahl mir Anzahl der Vorkommen in a der Ergebnisliste zufügen
            resultHash.put(key, hashA.get(key));
         }
         else
         {
            // Primzahl kommt a und b vor: 
            // Höhere Anzahl der Vorkommen in a oder b der Ergebnisliste zufügen
            // und Primzahl aus der Liste der Primzahlen aus b entfernen
            resultHash.put(key, hashA.get(key) > hashB.get(key) ? hashA.get(key) : hashB.get(key));
            hashB.remove(key);
         }
      }
      
      // Nach dem Entfernen aller Primzahlen aus b, die auch in a vorkommen, enthält der Hash von b nur
      // noch Primzahlen, die NICHT in a enthalten sind. 
      for (Integer key : hashB.keySet())
      {
            resultHash.put(key, hashB.get(key));
      }
      
      long lcM = 1;
      for (Integer key : resultHash.keySet())
      {
            
         long pow = 1;
         
         // Folgendes berechnet Math.pow(key, resultHash.get(key))
         // Bibliotheksmethode weicht für große Werte durch Ungenauigkeit ab!
         for(int cnt=0; cnt<resultHash.get(key); cnt++){
            pow *= key;
         }
         lcM *= pow;
      }
      return lcM;
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
