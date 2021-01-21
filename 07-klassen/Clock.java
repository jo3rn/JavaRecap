/* Hausaufgabe 07 Aufgabe 1
 * Link:
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
  public static void main(String[] args) {
    Clock basicClock = new Clock();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 0 Uhr
    basicClock.tick();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 1 Uhr
    for (int i = 1; i <= 12; i++) {
      basicClock.tick();
    }
    basicClock.printStatus(); // Aktuelle Uhrzeit: 13 Uhr
    basicClock.switchMode();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 1 pm
    for (int i = 1; i <= 10; i++) {
      basicClock.tick();
    }
    basicClock.printStatus(); // Aktuelle Uhrzeit: 11 pm
    basicClock.switchMode();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 23 Uhr
    basicClock.switchToSummerTime();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 0 Uhr
    basicClock.tick();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 1 Uhr
    basicClock.switchToWinterTime();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 0 Uhr
    basicClock.switchMode();
    basicClock.printStatus(); // Aktuelle Uhrzeit: 12 am
  }

  public void tick() {

  }

  public void printStatus() {

  }

  public void switchMode() {

  }

  public void switchToSummerTime() {

  }

  public void switchToWinterTime() {

  }


}
