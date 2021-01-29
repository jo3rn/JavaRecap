/* Übung 09 Knobelaufgabe
 * Link: https://www.youtube.com/watch?v=OQnCRBbbZus
 */

/* Die folgende Aufgabe lehrt Sie einiges über die Gefahren der zusammengesetzen
 * Zuweisungsoperatoren (hier >>>=).
 * Zur Erinnerung: >>>= ist ein bitweiser shift nach rechts ohne Beachtung des Vorzeichens,
 * d.h. es wird mit 0 aufgefüllt.
 *
 *
 * Ergänzen Sie in der Zeile über dieser Schleife eine Deklaration für i,
 * so dass die Schleife niemals endet:
 *       while (i != 0) {
 *         i >>>= 1;
 *       }
 */

public class PuzzleTask {
  public static void main(String[] args) {
    /* Zweierkomplement (two's complement)
     * DEZIMAL  BINÄR
     * -128     1000 0000
     * ...
     * -2       1111 1110
     * -1       1111 1111
     * 0        0000 0000
     * 1        0000 0001
     * 2        0000 0010
     * ....
     * 127      0111 1111
     */

    /* Wenn wir ein int mit dem Wert -1 nach rechts verschieben, ändert sich der Wert
     * 1111 1111 1111 1111 1111 1111 1111 1111    ---> -1
     * 0111 1111 1111 1111 1111 1111 1111 1111    ---> 2147483647 (neuer Wert)
     */
    int j = -1;
    System.out.println("j vor der Verschiebung: " + j);
    j >>>= 1;
    System.out.println("j nach der Verschiebung: " + j);


    /* Wenn wir ein byte mit dem Wert -1 nach rechts verschieben, bleibt der Wert bei -1
     * 1111 1111                                  ---> -1 als byte
     * 1111 1111 1111 1111 1111 1111 1111 1111    ---> -1 als int
     * 0111 1111 1111 1111 1111 1111 1111 1111    ---> nach Verschiebung als int (2147483647)
     *                               1111 1111    ---> nach Verschiebung als byte (wieder -1)
     */
    byte i = -1;
    while (i != 0) { // Achtung: Endlosschleife
      i >>>= 1;
    }
  }
}
