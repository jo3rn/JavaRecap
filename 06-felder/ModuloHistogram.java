/* Übung 06 Knobelaufgabe
 * Link: https://www.youtube.com/watch?v=pXbbS3Njxas
 */

/* Das folgende Programm soll ein Histogramm aller Integer modulo 3 ausgeben,
 * also die Verteilung aller Integer auf die Divisionsreste 0, 1 und 2.
 * Dies sind nicht genau gleich viele, da 2^32 nicht durch 3 teilbar ist.
 * Bevor Sie es abtippen und direkt laufen lassen, bitte erst durchsprechen und überlegen,
 * was wo (anscheinend) passiert oder passieren soll. Erst dann starten und sich ggf. wundern.
 * Das Programm enthält nämlich Fehler, die gerne übersehen werden bzw. "nicht gewusst" wurden.
 * Welche sind das? Erklären Sie sich (gegenseitig) warum das zum Fehler führt! Behebt die Fehler!
 * Man lernt einiges über % und Math.abs dabei.
 *
 *    public class ModuloHistogram {
 *      public static void main(String[] args) {
 *        int mod = 3;
 *        int[] histogram = new int[mod];
 *        int i = Integer.MIN_VALUE;
 *        do {
 *          histogram[Math.abs(i) % mod]++;
 *        } while (i++ != Integer.MAX_VALUE);
 *        for (int j= 0; j < mod; j++) {
 *          System.out.print(histogram[j] + " ");
 *        }
 *      }
 *    }
 */
public class ModuloHistogram {
  public static void main(String[] args) {
    int mod = 3;
    int[] histogram = new int[mod]; // { 2, 2, 1 }
    int i = Integer.MIN_VALUE;

    do {
      histogram[Math.abs(i % mod)]++;
    } while (i++ != Integer.MAX_VALUE);
    for (int j = 0; j < mod; j++) {
      System.out.print(histogram[j] + " ");
    }
  }
}
