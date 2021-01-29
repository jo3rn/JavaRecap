/* Hausaufgabe 09 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=oNY1aLUz6nw
 */

/* Eine verschärfte Variante der Türme von Hanoi erlaubt keine direkten Züge
 * zwischen Säule 1 und 3. Stattdessen muss eine Scheibe zunächst nach Säule 2
 * und dann weitergezogen werden. Man braucht also zwei Züge. Alle anderen Regeln bleiben gleich.
 *
 * Implementieren Sie die Methode public static String hanoi3(int n, int from, int to),
 * welche die kürzeste Zugfolge als String zurückgibt (pro Zug eine Zeile),
 * um in dieser Variante n Scheiben von der Säule "from" zur Säule "to" zu ziehen.
 *
 *         --|--              |               |
 *           |                |               |
 *        ---|---             |               |
 *           |                |               |
 *       ----|----            |               |
 */
public class Hanoi {

  private static final int MIDDLE = 2;
  private static long steps = 0L;

  public static String hanoi3(int n, int from, int to) {
    if (n == 1) {
      steps += 2;
      System.out.printf("\nfrom %d to %d\nfrom %d to %d", from, MIDDLE, MIDDLE, to);
      return "";
    }

    hanoi3(n - 1, from, to);
    steps++;
    System.out.printf("\nfrom %d to %d", from, MIDDLE);
    hanoi3(n - 1, to, from);
    steps++;
    System.out.printf("\nfrom %d to %d", MIDDLE, to);
    hanoi3(n - 1, from, to);

    return "\n" + steps;
  }

  public static void main(String[] args) {
    System.out.println("Hanoi3 needs " + hanoi3(5, 1, 3) + " steps for 5 pieces.");
  }
}
