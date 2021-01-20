/* Hausaufgabe 04 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=S3IZbusBxWg
 */

/* Auf einem Tombola-Los stehen drei Ganzzahlen a, b und c.
 * Der Gewinn beträgt 10 EUR, wenn alle drei Zahlen gleich 3 sind.
 * Wenn nicht, gewinnt man 5 EUR, falls alle drei Zahlen gleich sind.
 * Falls das auch nicht der Fall ist, gewinnt man zumindest 1 EUR,
 * wenn alle drei Zahlen unterschiedlich sind.
 * In allen anderen Fällen beträgt der Gewinn 0 EUR.
 * Schreiben Sie die Methode public static int tombola(int a, int b, int c),
 * welche den Gewinn für eine gegebene Ziffernfolge eines Loses zurückliefert.
 *
 * Beispiele:
 * tombola(3, 3, 3) -> 10
 * tombola(9, 9, 9) -> 5
 * tombola(1, 2, 3) -> 1
 * tombola(1, 2, 2) -> 0
 */

public class Tombola {

  public static void main(String[] args) {
    System.out.println("Testing tombola method... works if all true:");
    System.out.println(tombola(3, 3, 3) == 10);
    System.out.println(tombola(9, 9, 9) == 5);
    System.out.println(tombola(1, 2, 3) == 1);
    System.out.println(tombola(1, 3, 3) == 0);
  }

  public static int tombola(int a, int b, int c) {
    if (a == b && b == c) {
      if (a == 3) {
        return 10;
      }
      return 5;
    } else if (a != b && a != c && b != c) {
      return 1;
    }

    return 0;
  }
}
