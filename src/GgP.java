

import java.util.List;

/**
 * Class for calculate the greatest common prime number.
 * 
 * @author M. Faulstich
 * @version 3.3
 */
public final class GgP
{

   private GgP()
   {
   }

   /**
    * Method calculates the greatest common prime number of a and b.
    * 
    * @param a
    *           First parameter, defined for a >= 1.
    * @param b
    *           Second parameter, defined for b >= 1.
    * @return a > 1 and b > 1: ggP(a,b) a = 1 -> b b = 1 -> a a = prime
    *         number, b = prime number, a!= b -> 1
    * 
    */
   public static int ggp(int a, int b)
   {

      if (a <= 1)
      {
         throw new IllegalArgumentException("Illegal argument: " + a);
      }
      if (b <= 1)
      {
         throw new IllegalArgumentException("Illegal argument: " + b);
      }
      if (a == 1 || b == 1)
      {
         return 1;
      }

      List<Integer> listA = PrimeNumbers.splitPrimeNumberFactors(a);
      List<Integer> listB = PrimeNumbers.splitPrimeNumberFactors(b);

      Integer result = 0;
      for (Integer integer : listA)
      {
         if (!listB.contains(integer))
         {
            result = integer;
         }
      }
      return result;
   }

}
