/* Hausaufgabe 09 Aufgabe 0
 * Link: https://www.youtube.com/watch?v=PPFUPW7jm1U
 */

/* Rentier Rudolph hat nach getaner Weihnachtsarbeit einen über den Durst getrunken und wankt
 * nun nach Hause. Er ist fast zu Hause und muss nur noch 22 Meter an einer Wand entlang gehen.
 * Er braucht 22 Schritte, da er mit jedem Schritt 1 Meter vorwärtskommt.
 * Wegen des getrunkenen Glühweins schwankt er allerdings stets zusätzlich 1 Meter
 * nach links (von der Wand weg) oder nach rechts (zur Wand hin).
 * Er kann nur nach rechts schwanken, wenn er nicht schon an der Wand ist.
 * Wie viele mögliche Wege kann Rudolph gehen, um nach 22 Metern am Ende der Wand zu sein?
 * Beispiel: Bei einer 4 Meter langen wand hätte er genau diese zwei Möglichkeiten:
 *
 *   1. Möglichkeit     2. Möglichkeit
 *
 *                 y                  y         Legende:
 *               |                  |
 *               | 2           R    | 2         R Rudolph
 *               |            / \   |           \ torkeln
 *        R   R  | 1         R   R  | 1         / torkeln
 *       / \ / \ |          /     \ |           | Wand
 *      R___R___RT 0       R_______RT 0         _ Wand
 *   x  0 1 2 3 4       x  0 1 2 3 4            T Haustür
 *
 * Implementieren Sie die Methode public static long waysHome(int length, int x, int y),
 * die für eine Wand der Länge length, eine horizontale Position x und eine vertikale Position y
 * die Anzahl möglicher Torkelwege liefert.
 * Die Startposition sei mit x = 0 und y = 0 kodiert.
 * Die Endposition ist x = length und y = 0.
 * Der Aufruf waysHome(22,0,0) liefert also das gesuchte Ergebnis.
 * Für Ihre Rekursion gilt folgendes:
 * 1.   Falls y < 0: Es gibt keine Möglichkeiten, da Rudolph nicht durch die Wand kann
 * 2.   Ebenfalls gibt es keine Möglichkeiten, wenn Rudolph zu weit von der Wand weg ist.
 *      Bei 22 Metern kann er bei x = 11 höchstens auch y = 11 sein
 *      (dann muss er danach nur noch nach rechts torkeln).
 *      Finden Sie also jeweils das passende y-Limit für das gegebene x und length.
 *      Zur Illustration:
 *      Im Beispiel gibt es von der Position (x,y) = (21,1) nur noch eine Möglichkeit
 *      und von (21,y) für y != 1 keine Möglichkeit.
 */
public class DrunkenReindeer {

  public static long waysHome(int length, int x, int y) {
    if (x == length - 1) {
      return y == 1 ? 1 : 0;
    }

    if (y < 0 || y > length - x) {
      return 0;
    }

    x++;
    return waysHome(length, x, y + 1) + waysHome(length, x, y - 1);
  }

  public static void main(String[] args) {
    System.out.println("Rudolph has " + waysHome(22, 0, 0) + " ways to come home.");
  }
}
