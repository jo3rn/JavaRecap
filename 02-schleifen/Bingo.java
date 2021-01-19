/* Übung 02 Aufgabe 4
 * Link: https://www.youtube.com/watch?v=mgdoiBYMXXQ
 */

/* Schreiben Sie ein Programm, welches ein simples Bingo-Spiel simuliert (für nur eine Spieler*in).
 * Denken Sie sich 4 verschiedene Ganzzahlen zwischen 0 und 20 (einschließlich) aus und legen Sie diese Zahlen als
 * Variablen an. Lassen Sie die Spieler*in so lange Zahlen eingeben, bis sie alle vier Bingo-Zahlen ‚erraten‘ hat und
 * geben Sie dann Bingo! auf der Konsole aus. Das Programm endet dann. Außerdem soll das Programm enden, wenn die
 * Spieler*in eine negative Zahl eintippt (also wohl keine Lust mehr hat).

 * Erweiterung für zwei Spieler*innen, falls Sie Spaß daran haben:
 * Lassen Sie zu Beginn des Spiels eine Spieler*in die vier Zahlen selbst eingeben über die Konsole.
 * Dann geben Sie so viele Leerzeilen aus, dass eine zweite Spieler*in die Zahlen nicht mehr sieht.
 * Nun kann die zweite Spieler*in so lange raten, bis sie ein Bingo! hat (oder aufgibt).
 * Geben Sie die Anzahl an Versuchen beim Bingo!
 */

import java.util.Scanner;

public class Bingo {
  public static void main(String[] args) {
    boolean aGuessed = false;
    boolean bGuessed = false;
    boolean cGuessed = false;
    boolean dGuessed = false;

    Scanner in = new Scanner(System.in);

    System.out.println("Bitte Zahl Nr. 1 eingeben:");
    int a = in.nextInt();
    System.out.println("Bitte Zahl Nr. 2 eingeben:");
    int b = in.nextInt();
    System.out.println("Bitte Zahl Nr. 3 eingeben:");
    int c = in.nextInt();
    System.out.println("Bitte Zahl Nr. 4 eingeben:");
    int d = in.nextInt();

    for (int i = 0; i < 100; i++) {
      System.out.println();
    }

    int guess = 0;
    while ((!aGuessed || !bGuessed || !cGuessed || !dGuessed) && guess >= 0) {
      System.out.println("Bitte nächste Zahl eingeben: ");
      guess = in.nextInt();

      if (guess == a) {
        aGuessed = true;
      } else if (guess == b) {
        bGuessed = true;
      } else if (guess == c) {
        cGuessed = true;
      } else if (guess == d) {
        dGuessed = true;
      }
    }

    if (guess >= 0) {
      System.out.println("Bingo!");
    } else {
      System.out.println("Das Spiel wurde frühzeitig beendet.");
    }
  }
}
