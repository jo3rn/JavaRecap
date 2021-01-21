/* Hausaufgabe 08 Aufgabe 2
 * Link:
 */

/* Schreiben Sie eine Klasse BrainDice, welche garantiert nur eine Instanz zulässt (Singleton).
 * Diese Instanz repräsentiert einen Würfel, dessen maximale Augenzahl (entspricht Würfelseiten)
 * vor der ersten Nutzung bestimmt werden kann (z.B. durch Aufrufen einer Methode zum Setzen
 * der Augenzahl oder bei Instanziierung).
 * Der Würfel soll eine Methode public int nextThrow() haben, welche eine Augenzahl zwischen 1 und
 * der maximalen Augenzahl (beide inklusive) zurückgibt. Das Besondere am BrainDice ist,
 * dass er/sie sich merkt, welche Zahlen bereits gefallen sind und diese nicht mehr ausgibt,
 * bis alle möglichen Würfelaugen einmal gefallen sind; dann setzt der Würfel sich selbst zurück
 * und liefert erneut die Zahlen aus (in neuer zufälliger Reihenfolge).
 * Nutzen Sie für Zufallszahlen new java.util.Random().nextInt(3)
 * Beispiel: Ein BrainDice mit max. 6 Augen liefert bei mehrmaligem Aufruf von nextThrow() zunächst
 * die 2, dann 4, dann 1, dann 5. Beim nächsten Aufruf von nextThrow() kann nur 3 oder 6
 * als Rückgabewert kommen. Nach sechs Aufrufen von nextThrow() sind also alle Zahlen genau einmal
 * zurückgegeben worden und der Würfel liefert anschließend beim siebten Aufruf von nextThrow()
 * wieder eine der Zahlen von 1 bis 6, usw.
 *
 * Schreiben Sie eine Methode public static void main(String[] args) in der Klasse BrainDice,
 * welche mindestens zwei Instanzen von BrainDice anlegt mit unterschiedlichen Augenzahlen
 * (z.B. 6 und 9) und jeweils für die doppelte Anzahl an Augen (z.B. 12 und 18 mal) die Methode
 * nextThrow() aufruft und die Zahlen auf die Konsole ausgibt.
 */
public class BrainDice {

}
