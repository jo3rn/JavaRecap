/* Übung 01 Aufgabe 3
 * Link: https://www.youtube.com/watch?v=4kee9yI9FG8
 */

/* Die Datei WeekDay.java enthält ein Programm zur Berechnung des Wochentags und verwendet
 * ausschließlich Programmkonstrukte, wie im seminaristischen Unterricht erläutert.
 * Lesen Sie den Quellcode langsam durch, so dass Sie nachvollziehen können, was Zeile für Zeile
 * bei Ausführung passiert. (Das dauert eine Weile). Wechseln Sie in der Lerngruppe spätestens
 * alle 20 Zeilen die Rolle desjenigen, der den Code „laut denkend“ durchgeht.
 * Stellen Sie sich gegenseitig Rückfragen zu einzelnen Teilen,
 * wie z.B. den if-Anweisungen oder warum eine Teilberechnung gebraucht wird.
 * Bei allen unklaren Programmteilen fragen Sie Ihre Tutor*innen!
 * Und gibt es wirklich nichts, was Ihnen unklar ist, dann erklären Sie doch mal einer Tutor*in,
 * wie das mit den Schaltjahren funktioniert, so dass trotzdem der richtige Wochentag rauskommt). */

import java.util.Scanner;

public class WeekDay {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int day = in.nextInt();
    int month = in.nextInt();
    int year = in.nextInt();
    int shift = 0;
    int result = 0;

    // 1. January 1900 was a Monday

    shift = (year - 1900) + (year - 1900) / 4 + (day - 1);

    if (month > 1) {
      shift = shift + 31;
    }
    if (month > 2) {
      shift = shift + 28;
    }
    if (month > 3) {
      shift = shift + 31;
    }
    if (month > 4) {
      shift = shift + 30;
    }
    if (month > 5) {
      shift = shift + 31;
    }
    if (month > 6) {
      shift = shift + 30;
    }
    if (month > 7) {
      shift = shift + 31;
    }
    if (month > 8) {
      shift = shift + 31;
    }
    if (month > 9) {
      shift = shift + 30;
    }
    if (month > 10) {
      shift = shift + 31;
    }
    if (month > 11) {
      shift = shift + 30;
    }

    /* In case of January or February of a "Schaltjahr" remove 1 from shift */

    if  (((month == 1) || (month == 2)) && (year % 4 == 0)) {
      shift = shift - 1;
    }

    result = shift % 7;

    if (result == 0) {
      System.out.println("Montag");
    }
    if (result == 1) {
      System.out.println("Dienstag");
    }
    if (result == 2) {
      System.out.println("Mittwoch");
    }
    if (result == 3) {
      System.out.println("Donnerstag");
    }
    if (result == 4) {
      System.out.println("Freitag");
    }
    if (result == 5) {
      System.out.println("Samstag");
    }
    if (result == 6) {
      System.out.println("Sonntag");
    }
  }
}
