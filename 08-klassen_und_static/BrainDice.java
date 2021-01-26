/* Hausaufgabe 08 Aufgabe 2
 * Link: https://www.youtube.com/watch?v=GQuHUtw_OMc
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
 * welche zwei Mal eine Instanz von BrainDice abruft (und natürlich in beiden Fällen das gleiche
 * Objekt erhält). Dies geht, indem Sie z.B. zwei Mal .getInstance() aufrufen.
 * Speichern Sie beide Referenzen in verschiedenen Variablen.
 * Nehmen Sie als Augenzahl z.B. 9 und rufen Sie anschließend doppelt so oft (z.B. 18 mal)
 * die Methode nextThrow() auf und geben Sie die Zahlen auf die Konsole aus.
 * Verwenden Sie dabei beide Referenzvariablen (z.B. im Wechsel).
 * Das Verhalten sollte identisch sein, egal ob Sie nur eine oder beide Referenzvariablen verwenden,
 * da die gleiche Instanz des Objektes referenziert wird (Singleton).
 */

import java.util.Random;

public class BrainDice {

  private int numberOfEyes;
  private int[] eyesSequence;
  private int eyesSequenceIndex = 0;

  private static BrainDice instance = new BrainDice(9);

  private BrainDice(int numberOfEyes) {
    this.numberOfEyes = numberOfEyes;
    generateEyesSequence();
  }

  public int nextThrow() {
    if (eyesSequenceIndex == numberOfEyes) {
      eyesSequenceIndex = 0;
      generateEyesSequence();
    }
    return eyesSequence[eyesSequenceIndex++];
  }

  private void generateEyesSequence() {
    eyesSequence = new int[numberOfEyes];
    int eyes = 1;
    Random random = new Random();
    while (eyes <= numberOfEyes) {
      int randomIndex = random.nextInt(numberOfEyes);
      if (eyesSequence[randomIndex] == 0) {
        eyesSequence[randomIndex] = eyes;
        eyes++;
      }
    }
  }

  public static void main(String[] args) {
    BrainDice brainDiceOne = getInstance();
    BrainDice brainDiceTwo = getInstance();

    for (int i = 0; i < brainDiceOne.numberOfEyes * 3; i++) {
      System.out.println(brainDiceOne.nextThrow());
      System.out.println(brainDiceTwo.nextThrow());
    }
  }

  public static BrainDice getInstance() {
    return instance;
  }
}
