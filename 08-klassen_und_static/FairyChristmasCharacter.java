/* Hausaufgabe 08 Aufgabe 0
 * Link: https://www.youtube.com/watch?v=jFPvrtt6MSg
 */

/* Seien santaClause und christChild die einzigen zwei möglichen Instanzen der
 * Klasse FairyChristmasCharacter. Beide sind überzeugt, jeweils mehr Menschen zu erreichen.
 * Um endgültig Klarheit zu schaffen teilen Sie sich nun ein Attribut in Ihrer Klasse.
 * Darin zählen Sie
 *    +1 rauf, wenn jemand sagt, er warte an Weihnachten auf den Weihnachtsmann (santaClause) und
 *    -1, wenn jemand überzeugt ist, das Christkind kommt zu ihm/ihr.
 *
 * Fazit: Ist der Endstand positiv, geht die Zählung für den Weihnachtsmann aus;
 * ist der Endstand negativ geht die Zählung für das Christkind aus.
 * 1. Implementieren Sie die Klasse FairyChristmasCharacter so, dass diese garantiert
 *    nur zwei Instanzen zulässt (Es gibt mehrere Möglichkeiten, das zu erreichen, siehe SU).
 * 2. Implementieren Sie das Klassenattribut zum gemeinsamen Zählen und eine Objektmethode
 *    public void waitingForYou(), welche sich für die Instanz des Weihnachtsmanns so verhält,
 *    dass das Klassenattribut um ein erhöht wird (+1),
 *    bei der Instanz des Christkinds um ein verringert wird (-1).
 * 3. Schreiben Sie eine main-Methode in einer neuen Klasse FairyChristmasContest,
 *    welche die beiden Instanzen der Klasse FairyChristmasCharacter in lokalen Variablen
 *    referenziert und in einer Schleife für alle 7,8 Milliarden Menschen zufällig entweder auf
 *    der Instanz des Weihnachtsmanns oder auf der Instanz des Christkinds die Methode
 *    waitingForYou() aufruft oder bei keiner von beiden.
 *    Zufallszahlen 0,1, oder 2 erhalten Sie durch Aufruf von new java.util.Random().nextInt(3).
 *    Geben Sie den Endstand des Zählerattributes aus.
 *
 * Denkanstoß: Wieso ist das Ergebnis wenig erstaunlich? (Die Antwort ist nicht abzugeben)
 * (Hinweis: Eine Schleife für 7,8 Milliarden Iterationen dauert ca. 5 Minuten je nach CPU.
 * Wenn es Ihnen zu lange dauert, rechnen sie nur für alle Deutschen,
 * das sind ca. 83 Millionen, in ca. 0.5 Sekunden).
 */
public class FairyChristmasCharacter {

  private int waitingWeight;

  private static long waitingCount = 0;

  private static FairyChristmasCharacter santaClause = new FairyChristmasCharacter(1);
  private static FairyChristmasCharacter christChild = new FairyChristmasCharacter(-1);

  private FairyChristmasCharacter(int waitingWeight) {
    this.waitingWeight = waitingWeight;
  }

  public void waitingForYou() {
    waitingCount += waitingWeight;
  }

  public static FairyChristmasCharacter getSantaClause() {
    return santaClause;
  }

  public static FairyChristmasCharacter getChristChild() {
    return christChild;
  }

  public static void printWaitingCount() {
    System.out.println("Result: " + waitingCount);
  }
}
