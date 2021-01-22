/* Hausaufgabe 07 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=z6mC4AXe8Mc
 */

/*
 * Aufgabenstellung siehe Clock.java
 */

public class ClockTest {
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
}
