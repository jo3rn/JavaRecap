/* Übung 07 Aufgabe 2
 * Link: https://www.youtube.com/watch?v=pIvUQu9i8ww
 */

/* Schreibt eine Klasse namens FruitBasket (ein Obstkorb).
 * Ein Obstkorb kann in der ersten Version maximal 10 Äpfel enthalten, kein anderes Obst.
 * Ein Apfel kann zwischen 100 und 200 Gramm wiegen.
 * Die Klasse muss genau diese Methoden besitzen:
 * • addApple: Reinlegen eines Apfels mit Gewicht x, wobei 100 ≤ x ≤ 200.
 * • getTotalFruits: Gibt die Anzahl der rein gelegten Äpfel zurück (max. 10).
 * • getTotalWeight: Gibt das Gesamtgewicht der rein gelegten Äpfel zurück.
 * Es gibt einen Konstruktor ohne Argumente, der einen leeren Obstkorb erzeugt.
 * Die Signaturen der Methoden müssen zur Vorgabe unten passen!
 * Schreiben Sie die Klasse so,
 * dass die Verwendung in der main Methode von FruitBasketTest.java möglich ist,
 * und das Verhalten wie in den Kommentaren angegeben erzeugt wird.
 * Deklarieren Sie alle Attribute als private, um Datenkonsistenz Ihrer Objekte zu erhalten!
 */

public class FruitBasket {
  private int apples = 0;
  private int weight = 0;

  public void addApple(int weight) {
    if (weight < 100) {
      System.out.println("zu leicht");
    } else if (weight > 200) {
      System.out.println("zu schwer");
    } else {
      if (apples < 10) {
        apples++;
        this.weight += weight;
      } else {
        System.out.println("zu viele Aepfel");
      }
    }
  }

  public int getTotalFruits() {
    return apples;
  }

  public int getTotalWeight() {
    return weight;
  }
}
