/* Übung 04 Aufgabe 2
 * Link: https://www.youtube.com/watch?v=j9HchBcfsv0
 */

/* Betrachten Sie folgende Notentabellen im Leistungskurs Sport für Schülerinnen (links)
 * und Schüler (rechts).
 *
 *  ----- Schülerinnen -----    -------- Schüler -------
 *  Note  100m  200m  400m      Note  100m  200m  400m
 *  1+    13.4  28.4  1:06.0    1+    12.0  24.7  56.7
 *  1     13.6  28.6  1:07.0    1     12.1  25.0  57.2
 *  ...
 *  4+    15.6  32.2  1:19.0    4+    13.6  28.1  1:03.8
 *  4     15.9  32.7  1:21.0    4     13.9  28.6  1:05.0
 *  4-    16.2  33.2  1:24.0    4-    14.2  29.1  1:06.2
 *  ...
 *
 * Die Methode public static double luckyPass(boolean isFemale, int distance) soll die Mindestzeit
 * in Sekunden zurückliefern, die gebraucht wird um eine glatte 4 als Bewertung zu erreichen
 * (z.B. 32.7 für Schülerinnen über 200m).
 * Der formale Parameter isFemale wird als true übergeben für Schülerinnen, als false für Schüler.
 * Der Parameter distance soll nur die Werte 100, 200 oder 400 annehmen.
 * Wird ein anderer Wert für distance übergeben, soll die Methode -1 zurückgeben.
 *
 * Schreiben Sie ein Programm, welches die Methode luckyPass enthält und aufruft.
 */

public class LuckySport {

  public static void main(String[] args) {
    System.out.println(luckyPass(true, 100));
    System.out.println(luckyPass(true, 200));
    System.out.println(luckyPass(true, 400));
    System.out.println(luckyPass(false, 100));
    System.out.println(luckyPass(false, 200));
    System.out.println(luckyPass(false, 400));
    System.out.println(luckyPass(true, -400));
    System.out.println(luckyPass(false, 300));
  }

  public static double luckyPass(boolean isFemale, int distance) {
    if (isFemale) {
      if (distance == 100) {
        return 15.9;
      } else if (distance == 200) {
        return 32.7;
      } else if (distance == 400) {
        return 81;
      }
    } else {
      if (distance == 100) {
        return 13.9;
      } else if (distance == 200) {
        return 28.6;
      } else if (distance == 400) {
        return 65;
      }
    }

    return -1;
  }
}
