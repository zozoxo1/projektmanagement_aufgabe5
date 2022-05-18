
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * Utility-Klasse zur Primzahlzerlegung.
 * 
 * @author M.Faulstich
 * @version 2.0
 */
public final class PrimeNumbers {
	private PrimeNumbers() {
	}

	/**
	 * Zerlegung einer Zahl a in Primzahlfakoren. Beispiel:
	 * splitPrimeNumberFactors(12) = 2 * 2 * 3
	 * 
	 * @param a
	 *            Zu zerlegende Zahl, gültiger Wertebereich: 1 < a < Integer.MA
	 * 
	 * @return 
	 * a > 1 : Liste der Primzahlfaktoren, aus denen a besteht 
	 * a == 1: leere Liste (1 keine gültige Primzahl)
	 * a < 1 : null
	 */
	public static List<Integer> splitPrimeNumberFactors(int a) {
		if (a < 1) {
			return null;
		}
		List<Integer> result = new Vector<Integer>();

		if (a == 1) {
			return result;
		}

		while ((a % 2) == 0) {
			result.add(2);
			a = a / 2;
		}
		while ((a % 3) == 0) {
			result.add(3);
			a = a / 3;
		}

		int t = 5;
		int diff = 2;
		while (t * t <= a) {
			while ((a % t) == 0) {
				result.add(t);
				a = a / t;
			}
			t = t + diff;
			diff = 6 - diff;
		}
		if (a > 1) {
			result.add(a);
		}

		Collections.sort(result);
		return result;
	}

	/**
	 * Berechnung der in a vorkommenden Primzahlen.
	 * 
	 * In der Ergebnisliste kommt jeder Primzahlfaktor von a
	 * im Gegensatz zur Methode splitPrimeNumberFactors genau einmal vor.
	 * Beispiel: splitUniquePrimeNumbers(12) = 2 * 3
	 * @see PrimeNumbers#splitPrimeNumberFactors(int)
	 * @param a
	 *            Zu zerlegende Zahl, Wertebereich: 1 < a < Integer.MA
	 * 
	 * @return 
	 * a > 1 : Liste der Primzahlen, aus denen a besteht. Jede Primzahl kommt einmal vor. 
	 * a == 1: leere Liste (1 keine gültige Primzahl)
	 * a < 1 : null
	 */
	public static List<Integer> splitUniquePrimeNumbers(int a) {
		if (a < 1) {
			return null;
		}
		List<Integer> allPrimeNumbers = splitPrimeNumberFactors(a);
		Set<Integer> uniqePrimeNumbers = new HashSet<Integer>(allPrimeNumbers);
		List<Integer> result = new Vector<Integer>(uniqePrimeNumbers);
		Collections.sort(result);
		return result;
	}
}
