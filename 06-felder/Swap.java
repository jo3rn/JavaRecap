/* Übung 06 Aufgabe 3
 * Link: https://www.youtube.com/watch?v=y8U8EHqfdv8
 */

/* Was ist der Effekt des folgenden Codes?
 *
 *      int[] arr1 = { 1, 2, 3 };
 *      int[] arr2 = { 4, 5, 6, 7 };
 *      int[] helper = arr1;
 *      arr1 = arr2;
 *      arr2 = helper;
 *
 * Schreiben Sie nun eine Methode public static void swap(int[] arr1, int[] arr2),
 * so dass der Aufruf swap(a, b) die Referenzen a und b nicht ändert,
 * aber den Inhalt der referenzierten Arrays vertauscht.
 * Wenn die Arrays unterschiedliche Länge haben, soll nichts passieren.
 * (Dies ist ein weiteres Beispiel einer Methode, die Inhalte der als Referenz im Argument
 * übergebenen Objekte verändert, aber einen void Return-Wert hat).
 */
public class Swap {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 4, 5, 6, 7 };
    int[] helper = arr1; // { 1, 2, 3 }
    arr1 = arr2; // { 4, 5, 6, 7 }
    arr2 = helper; // { 1, 2, 3 }

    int[] swapA = { 1, 2, 3, 4 };
    int[] swapB = { 5, 6, 7, 8 };
    swap(swapA, swapB); // after swap: swapA = { 5, 6, 7, 8 }, swapB = { 1, 2, 3, 4 }
    System.out.println("Testing swap method...");
    for (int i = 0; i < swapA.length; i++) {
      System.out.println(swapA[i] + " should be " + (i + 5));
      System.out.println(swapB[i] + " should be " + (i + 1));
    }

    int[] swapC = { 1, 2 };
    int[] swapD = { 3 };
    System.out.println("Testing swap method with arrays of incompatible length...");
    swap(swapC, swapD); // no swap because length differs
    System.out.println(swapD[0] + " should be 3");
  }

  public static void swap(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
      return;
    }

    for (int i = 0; i < arr1.length; i++) {
      int helper = arr1[i];
      arr1[i] = arr2[i];
      arr2[i] = helper;
    }
  }
}
