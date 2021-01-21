/* Übung 08 Knobelaufgabe
 * Link:
 */

/* Gehen Sie das folgende Programm in Gedanken durch, auch wenn es etwas merkwürdig aussieht
 * und auch die üblichen Namenskonventionen nicht beachtet.
 * Beantworten Sie die folgende Frage: Gibt es Hinz oder Kunz auf der Konsole aus?
 * Soviel sei verraten, das Programm kompiliert und läuft und die Antwort ist eindeutig.
 * Warum ist das so?
 *
 * Dieser Quellcode vermittelt nicht nur tieferes Verständnis für die Verwendung von
 * Klassen in Klassen (ja auch das geht), sondern auch über die Präzedenzregeln von Klassen
 * und lokalen Variablen. Um es für alle Programmierenden immer leicht zu machen beim Quellcodelesen
 * schreiben wir auch deshalb Klassen am Anfang groß und Variablen klein, so entsteht keine
 * Zweideutigkeit beim Lesen des Quellcodes für den Menschen.
 */
public class HinzOrKunz {
  public static void main(String[] args) {
    System.out.println(Outer.Inner.Name);
  }
}

class Outer {
  static class Inner {
    static String Name = "Hinz";
  }
  static Helper Inner = new Helper();
}

class Helper {
  String Name = "Kunz";
}
