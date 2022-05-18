import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class KgVTest
{
   
   /**
    * Fehler: Alles wurde falsch berechnet
    * Fehlerbehebung: KgV neu geschrieben, Fehlermeldungen überarbeitet
    */
   
   @Test
   void intMinValueAndOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE, 1);
         }
      });
   }
   
   @Test
   void intMinValueAndZero() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE, 0);
         }
      });
   }
   
   @Test
   void intMinValueAndMinusOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE, -1);
         }
      });
   }
   
   @Test
   void intMinValuePlusOneAndOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE+1, 1);
         }
      });
   }

   @Test
   void intMinValuePlusTwoAndOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE+2, 1);
         }
      });
   }
   
   @Test
   void bothIntMinValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE, Integer.MIN_VALUE);
         }
      });
   }
   
   @Test
   void intMinValueAndMaxValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MIN_VALUE, Integer.MAX_VALUE);
         }
      });
   }
   
   @Test
   void intMaxValueAndZero() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MAX_VALUE, 0);
         }
      });
   }
   
   @Test
   void intMaxValueAndMinValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MAX_VALUE, Integer.MIN_VALUE);
         }
      });
   }
   
   @Test
   void intMaxValueAndMinusOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(Integer.MAX_VALUE, -1);
         }
      });
   }
   
   @Test
   void oneAndIntMinValuePlusOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(1, Integer.MIN_VALUE+1);
         }
      });
   }
   
   @Test
   void oneAndIntMinValuePlusTwo() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(1, Integer.MIN_VALUE+2);
         }
      });
   }
   
   @Test
   void oneAndIntMinValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(1, Integer.MIN_VALUE);
         }
      });
   }
   
   @Test
   void zeroAndIntMinValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(0, Integer.MIN_VALUE);
         }
      });
   }
   
   @Test
   void minusOneAndIntMinValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(-1, Integer.MIN_VALUE);
         }
      });
   }
   
   @Test
   void zeroAndIntMaxValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(0, Integer.MAX_VALUE);
         }
      });
   }
   
   @Test
   void minusOneAndIntMaxValue() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(-1, Integer.MAX_VALUE);
         }
      });
   }
   
   @Test
   void bothZero() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(0, 0);
         }
      });
   }
   
   @Test
   void zeroAndOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(0, 1);
         }
      });
   }
   
   @Test
   void oneAndZero() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(1, 0);
         }
      });
   }
   
   @Test
   void zeroAndMinusOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(0, -1);
         }
      });
   }
   
   @Test
   void minusOneAndZero() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(-1, 0);
         }
      });
   }
   
   @Test
   void minusOneAndOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(-1, 1);
         }
      });
   }
   
   @Test
   void oneAndMinusOne() {
      assertThrows(IllegalArgumentException.class, new Executable()
      {
         @Override
         public void execute() throws Throwable
         {
            KgV.kgv(1, -1);
         }
      });
   }
   
   @Test
   void smallestPrimeTwoTimes() {
      assertEquals(20, KgV.kgv(20, 4));
   }
   
   @Test
   void smallestPrimeThreeTimes() {
      assertEquals(24, KgV.kgv(6, 8));
   }
   
   @Test
   void smallestPrimeFourTimesBig() {
      assertEquals(2735000, KgV.kgv(341875, 8));
   }
   
   @Test
   void smallestPrimeFourTimesSmall() {
      assertEquals(816, KgV.kgv(136, 48));
   }
   
   @Test
   void smallestAndBiggestPrimeTwoTimes() {
      assertEquals(100, KgV.kgv(100, 50));
   }
   
   @Test
   void solutionBiggerThenInt() {
      assertEquals(3569094498L, KgV.kgv(1784547249, 6));
   }
   
   @Test
   void bigSolution() {
      assertEquals(3184608882128920752L, KgV.kgv(1784547249, 1784547248));
   }
   
   @Test
   void biggestPrimeTwoTimes() {
      assertEquals(4332, KgV.kgv(76, 1083));
   }
   
   @Test
   void biggestPrimeThreeTimes() {
      assertEquals(1786524, KgV.kgv(12, 297754));
   }
   
   @Test
   void biggestPrimeFourTimesBig() {
      assertEquals(47863214, KgV.kgv(14, 6837602));
   }
   
   @Test
   void biggestPrimeFourTimesSmall() {
      assertEquals(4455, KgV.kgv(55, 81));
   }
   
   @Test
   void oneIsPrime() {
      assertEquals(8556, KgV.kgv(372, 23));
   }
   
   @Test
   void bothArePrime() {
      assertEquals(358871, KgV.kgv(383, 937));
   }
   
   @Test
   void minimum() {
      assertEquals(4, KgV.kgv(1, 4));
   }
   
   @Test
   void minimumSecond() {
      assertEquals(1, KgV.kgv(1, 1));
   }
   
   @Test
   void maximum() {
      assertEquals(8589934584L, KgV.kgv(8, Integer.MAX_VALUE-1));
   }
   
   @Test
   void maximumSecond() {
      assertEquals(17179869160L, KgV.kgv(8, Integer.MAX_VALUE-2));
   }
   
}
