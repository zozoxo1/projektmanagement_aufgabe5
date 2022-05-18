

import java.util.List;

/**
 * Class for calculation of the lowest common prime number.
 * 
 * @author M. Faulstich
 * @version 3.3
 */
public final class KgP
{
   private KgP()
   {
   }

   /**
    * Method calculates the lowest common prime number of a and b.
    * 
    * @param a
    *           First parameter, defined for a >= 1.
    * @param b
    *           Second parameter, defined for b >= 1.
    * @return a > 1 and b > 1: kgP(a,b) a = 1 -> 1 b = 1 -> 1 a = prime
    *         number, b = prime number, a!= b -> 1
    * 
    */
   public static int kgp(int a, int b)
   {

      if (a < 0)
      {
         throw new IllegalArgumentException("Illegal argument: " + a);
      }
      if (b < 0)
      {
         throw new IllegalArgumentException("Illegal argument: " + b);
      }

      if (a == 0 || b == 0)
      {
         return 1;
      }

      List<Integer> listA = PrimeNumbers.splitPrimeNumberFactors(a);
      List<Integer> listB = PrimeNumbers.splitPrimeNumberFactors(b);

      Integer result = null;
      for (Integer integer : listA)
      {
         if (!listB.contains(integer))
         {
            result = integer;
            return result;
         }
      }
      return result;
   }

}
