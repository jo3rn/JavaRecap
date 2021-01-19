/* Übung 03 Aufgabe 2
 * Link: https://www.youtube.com/watch?v=eNAMPJztujA
 */

/* Schreiben Sie eine Schleife, in welcher Sie einen Kredit durch jährliche Zahlung tilgen.
 * Nehmen Sie dazu an, dass Sie 10.000 EUR (zehntausend) aufgenommen haben zu einem
 * jährlichen Zinssatz von 0,77 % (Null Komma siebenundsiebzig Prozent).
 * Sie zahlen als Studierende im Jahr 480 EUR ab (Tilgung).
 * Geben Sie die Anzahl Jahre am Ende aus, die Sie brauchen, bis Sie den Kredit abbezahlt haben.
 * (Als letztes Jahr gilt das Jahr, in welchem die letzte Tilgungsrate <= 480 EUR beglichen wird).
 * Tipp: Zinsen werden am Jahresende immer erst nach Abzug der Tilgung auf den Restbetrag berechnet.
 * Nehmen Sie den Datentyp double für die Finanzwerte.
 * Wenn Sie mögen, speichern Sie in einer weiteren double Variable,
 * wie viele EUR an Zinsen Sie insgesamt zahlen müssen und geben diese am Ende aus. */

public class Repayment {
  public static void main(String[] args) {
    double credit = 10_000;
    double interest = 0.0077;
    double interestPaid = 0;
    double repayment = 480;

    int years = 0;

    do {
      years++;
      credit -= repayment; // credit = credit - repayment;

      if (credit > 0) {
        interestPaid += credit * interest;
        credit *= 1 + interest;
      }

    } while (credit > 0);

    System.out.println("Der Kredit wurde nach " + years + " Jahren beglichen.");
    System.out.printf("Insgesamt wurden %.2f€ an Zinsen bezahlt.\n", interestPaid);
  }
}
