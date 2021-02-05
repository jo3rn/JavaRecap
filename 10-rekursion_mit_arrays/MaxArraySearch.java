/* Übung 10 Aufgabe 0
 * Link: https://www.youtube.com/watch?v=AQFa6V7SVSc
 */

/* 1. Ändern Sie das Beispiel aus dem Unterricht so ab, dass von einem unsortierten double[] Array
 *    der höchste Wert rekursiv gefunden und zurückgegeben wird.
 * 2. Schreiben Sie nun die iterative Variante davon (Lösung mit Schleife(n)) ohne Rekursion.
 * 3. Diskutieren Sie welche Variante Ihnen leichter fällt und warum.
 */
public class MaxArraySearch {
  public static void main(String[] args) {
    double[] arrUnsorted = { 17.3, 0.99, 13.33, 18.99, 9.47, 8.0, 2.0 };
    System.out.println(maxOfArr(arrUnsorted, 4));
    System.out.println(maxOfArrLoop(arrUnsorted, 4));
  }

  public static double maxOfArr(double[] arr, int startPos) {
    // base
    if (startPos == arr.length - 1) {
      return arr[startPos];
    }

    // recursion
    double maxOfRest = maxOfArr(arr, startPos + 1);
    if (arr[startPos] > maxOfRest) {
      return arr[startPos];
    } else {
      return maxOfRest;
    }
  }

  public static double maxOfArrLoop(double[] arr, int startPos) {
    double max = Double.MIN_VALUE;
    for (int i = startPos; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }
}
