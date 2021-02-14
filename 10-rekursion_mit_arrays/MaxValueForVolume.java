/* Hausaufgabe 10 Aufgabe 0
 * Link: https://www.youtube.com/watch?v=uDn76e8jtNE
 */

/* Diese Aufgabe behandelt das sogenannte "bin packing problem" der Informatik.
 * Es ist in Anlehnung an die Teilsummen-Lösung aus dem Unterricht leicht zu lösen
 * (für wenige Eingabewerte) mit Rekursion. Es lautet wie folgt:
 *
 * Sie haben z.B. einen LKW, der ein Ladevolumen von maximal 120m² hat.
 * Außerdem haben Sie eine Menge Waren, die jeweils ein Volumen in m² haben und einen Wert in Euro.
 * Nun geht es darum eine Kombination der Waren zu finden, die gerade noch in den LKW passen,
 * so dass der Gesamtwarenwert maximiert wird. Sie wollen also möglichst in Summe wertvolle Ware
 * transportieren solange die eben noch in den LKW passen. Zur Vereinfachung wird angenommen,
 * dass sich die Waren so stapeln lassen, dass der gesamte Platz perfekt ausgenutzt werden kann.
 *
 *                             _____________________________________________________
 *                            |                                                     |
 *                   _______  |                                                     |
 *                  / _____ | |                       120m²                         |
 *                 / /     || |                                                     |
 *        ________/ /      || |                                                     |
 *       |         |-------|| |                                                     |
 *      (|         |     -.|| |_______________________                              |
 *       |  ____   \       ||_________||____________  |             ____      ____  |
 *      /| / __ \   |______||     / __ \   / __ \   | |            / __ \    / __ \ |\
 *      \|| /  \ |_______________| /  \ |_| /  \ |__| |___________| /  \ |__| /  \|_|/
 *         | () |                 | () |   | () |                  | () |    | () |
 *          \__/                   \__/     \__/                    \__/      \__/
 *
 *   _____      ________      _____________      ______      __________________       _________
 *  |7.7m²|    |  10m²  |    |             |    | 8.5m²|    |                  |     |         |
 *  |7.77€|    |  10€   |    |   30.3m²    |    | 8.00€|    |     100m²        |     |  20.2m² |
 *  |_____|    |________|    |   30.33€    |    |______|    |     200.01€      |     |  20.22€ |
 *                           |_____________|                |                  |     |_________|
 *                                                          |__________________|
 *
 * Implementieren Sie die Klasse MaxValueForVolume mit der main-Methode und
 * der rekursiven Methode maxValueForVolume (Parameter und Rückgabewert nicht vorgegeben).
 * Ihre Rekursion soll nicht die einzelnen Waren oder Werte ausgeben,
 * sondern nur den Gesamtwert der mitgenommen werden kann.
 * Der Rückgabewert Ihrer Rekursion ist also der aufsummierte Wert der eingepackten Waren.
 *
 * Tipps:
 * Auch diese Aufgabe lässt sich mit wenigen Zeilen (z.B. 9 Zeilen) in der rekursiven Methode lösen.
 * Erstellen Sie eine main-Methode, mit der Sie die Korrektheit Ihrer rekursiven Lösung testen.
 * Die Rekursion selbst entscheidet anhand des Volumens ob eine Ware noch reinpasst oder nicht.
 * Je nachdem welcher Pfad (diese Ware einpacken oder diese Ware nicht einpacken)
 * zu einem höheren Wert führt, wird zurückgegeben.
 */

public class MaxValueForVolume {

  public static double maxValueForVolume(
      double load, int index, double[] volumes, double[] values) {

    boolean isFitting = volumes[index] <= load;
    if (volumes.length - 1 == index) {
      return isFitting ? values[index] : 0;
    }

    double withCurrent = 0;
    if (isFitting) {
      withCurrent = values[index]
          + maxValueForVolume(load - volumes[index], index + 1, volumes, values);
    }
    double withoutCurrent = maxValueForVolume(load, index + 1, volumes, values);

    return Math.max(withoutCurrent, withCurrent);
  }

  public static void main(String[] args) {
    double[] volumes = { 20.2, 30.3, 8.5, 10, 100, 7.7 };
    double[] values = { 20.22, 30.33, 8.00, 10.00, 200.01, 7.77 };

    double load = 120;
    double maxValue = 0;
    maxValue = maxValueForVolume(load, 0, volumes, values);
    System.out.printf("Best result for maxVolume of %.1fm² is value sum of %.2f€\n",
        load, maxValue);
  }
}