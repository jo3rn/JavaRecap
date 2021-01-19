/* Hausaufgabe 02 Aufgabe 4
 * Link: https://www.youtube.com/watch?v=icpePOGkyCs
 */

/* Schreiben Sie ein Programm SumOfThreeDice, das alle folgenden Kombinationen für das Würfeln mit drei Würfeln ausgibt:
 * Die Summe der Würfelaugen muss mindestens 7 betragen und
 * für (a, b, c) muss gelten, dass a <= b <= c.
 * Zum Beispiel soll (2,2,3) ausgegeben werden, aber (3,2,2) ebenso wenig wie (1,2,3).
 */

public class SumOfThreeDice {
  public static void main(String[] args) {

    int count = 0;

    /* straight forward */
    for (int a = 1; a < 7; a++) {
      count++;

      for (int b = 1; b < 7; b++) {
        count++;

        for (int c = 1; c < 7; c++) {
          count++;
          if (a + b + c > 6 && a <= b && b <= c) {
            System.out.println("(" + a + ", " + b + ", " + c + ")");
          }
        }
      }
    }

    System.out.println(count);

    count = 0;

    /* optimized */
    for (int a = 1; a < 7; a++) {
      count++;

      for (int b = a; b < 7; b++) {
        count++;

        for (int c = b; c < 7; c++) {
          count++;
          if (a + b + c > 6) {
            System.out.println("(" + a + ", " + b + ", " + c + ")");
          }
        }
      }
    }

    System.out.println(count);
  }
}
