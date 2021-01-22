/* Hausaufgabe 07 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=z6mC4AXe8Mc
 */

/* In dieser Aufgabe sollen Sie eine Klasse Clock erstellen (welche eine simple Uhr repräsentiert).
 * Eine Uhr zählt stundenweise und beginnt bei Stunde 0.
 * Durch einen tick() rückt die Uhr eine Stunde vor.
 * Die Uhr zeigt bei einem Aufruf von printStatus() die aktuelle Tageszeit an.
 * Durch switchMode() kann die Uhr zwischen einer 12h Anzeige und einer 24h Anzeige
 * hin und her wechseln.
 * Im 12h Modus zeigt die Uhr Tageszeiten zwischen 1 und 12 mit dem Zusatz am (für vormittags)
 * oder pm (für nachmittags), im 24h Modus zwischen 0 und 23 Uhr mit dem Zusatz Uhr.
 * 12 Uhr ist im 12h Modus 12 pm, im 24h Modus 12 Uhr.
 * Durch einen Aufruf von switchToSummerTime() schaltet die Uhr auf Sommerzeit um (immer 1h mehr).
 * Ein Aufruf von switchToWinterTime() setzt dies wieder zurück.
 * Ist die Uhr bereits in einem der Zustände (Sommer/Winter) bei Aufruf der Methoden,
 * bleibt dieser Zustand einfach.
 *
 * Die main Methode zeigt möglichen Code und die davon erzeugte Konsolenausgabe als Kommentar.
 */
public class Clock {
  private int hours = 0;
  private boolean isTwelveHourMode = false;
  private boolean isSummerTime = false;

  public void tick() {
    if (++hours == 24) {
      hours = 0;
    }
  }

  public void printStatus() {
    System.out.print("Aktuelle Uhrzeit: ");
    if (isTwelveHourMode) {
      if (hours == 0) {
        System.out.print(12); // 12 am
      } else {
        System.out.print(hours % 12);
      }

      if (hours >= 12) {
        System.out.println(" pm");
      } else {
        System.out.println(" am");
      }
    } else {
      System.out.println(hours + " Uhr");
    }
  }

  public void switchMode() {
    isTwelveHourMode = !isTwelveHourMode;
  }

  public void switchToSummerTime() {
    if (!isSummerTime && ++hours == 24) {
      hours = 0;
    }
    isSummerTime = true;
  }

  public void switchToWinterTime() {
    if (isSummerTime && --hours == -1) {
      hours = 23;
    }
    isSummerTime = false;
  }
}
