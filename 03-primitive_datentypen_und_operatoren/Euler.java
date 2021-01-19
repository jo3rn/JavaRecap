/* Hausaufgabe 03 Aufgabe 3
 * Link: https://www.youtube.com/watch?v=ibxySsKfpSQ
 */

/* Programmieren Sie eine Klasse Euler, die die ersten 101 Summanden der folgenden Reihenentwicklung
 * der Eulerzahl e berechnet und auf der Konsole ausgibt:
 *
 * e = 1 + (1 / 1) + (1 / (1 * 2)) + (1 / (1 * 2 * 3)) + ...
 * e = 1/0! + 1/1! + 1/2! + 1/3! + ...
 */

public class Euler {
  public static void main(String[] args) {
    double e = 0;
    double summand = 1;

    for (int i = 0; i < 101; i++) {
      e += summand;
      System.out.println("Summand: " + summand);
      summand /= i + 1;
    }

    System.out.println("Eulersche Zahl (approx.): " + e);
  }
}
