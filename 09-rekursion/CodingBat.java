/* Übung 09 Aufgaben 0-3
 * Link: https://www.youtube.com/watch?v=WZSYnkjUl30
 */

public class CodingBat {
  /* main Methode zum Testen
   * Aufgaben siehe weiter unten */
  public static void main(String[] args) {
    testTriangle();
    testPowerN();
    testBunnyEars2();
    testNestParen();
  }

  /* https://codingbat.com/prob/p194781
   * Wenn man ein Dreieck auf die Konsole ausgibt aus Zeilen und Spalten mit Sternchen (*), dann
   * hat die erste Zeile einen Stern (*), die zweite zwei (**), die dritte Zeile drei (***) usw.
   * Schreiben Sie die Methode public static int triangle(int rows),
   * welche als Ergebnis die Anzahl aller Sterne zurückliefert,
   * die ein Dreieck mit der rows Anzahl an Zeilen hat.
   * Sie dürfen keine Multiplikation oder Schleifen benutzen.
   */
  public static int triangle(int rows) {
    if (rows == 0) {
      return rows;
    } else {
      return rows + triangle(rows -1);
    }
  }

  private static void testTriangle() {
    System.out.println("Testing triangle... passes if all true:");
    System.out.println("Test 01: " + (triangle(0) == 0));
    System.out.println("Test 02: " + (triangle(1) == 1));
    System.out.println("Test 03: " + (triangle(2) == 3));
    System.out.println("Test 04: " + (triangle(3) == 6));
    System.out.println("Test 05: " + (triangle(4) == 10));
    System.out.println("Test 06: " + (triangle(5) == 15));
    System.out.println("Test 07: " + (triangle(6) == 21));
    System.out.println("Test 08: " + (triangle(7) == 28));
    System.out.println("Test 09: " + (triangle(8) == 36));
  }

  /* https://codingbat.com/prob/p158888
   * Mit einer gegebenen Basis base und einem Exponenten n lässt sich
   * eine exponentielle Schreibweise eines Wertes ausdrücken (base^n oder auch „base hoch n“).
   * Schreiben Sie eine Methode public static int powerN(int base, int n),
   * welche das Ergebnis der Basis base zum Exponenten n ausgibt (z.b. powerN(3,2) ist 9).
   * Verwenden Sie keine Schleifen oder Methoden von java.lang.Math, sondern Rekursion.
   */
  public static int powerN(int base, int n) {
    if (base == 0) {
      return 0;
    } else if (n == 1) {
      return base;
    } else if (n == 0) {
      return 1;
    } else {
      return base * powerN(base, n - 1);
    }
  }

  private static void testPowerN() {
    System.out.println("Testing powerN... passes if all true:");
    System.out.println("Test 01: " + (powerN(3, 1) == 3));
    System.out.println("Test 02: " + (powerN(3, 2) ==9));
    System.out.println("Test 03: " + (powerN(3, 3) == 27));
    System.out.println("Test 04: " + (powerN(2, 1) == 2));
    System.out.println("Test 05: " + (powerN(2, 2) == 4));
    System.out.println("Test 06: " + (powerN(2, 3) == 8));
    System.out.println("Test 07: " + (powerN(2, 4) == 16));
    System.out.println("Test 08: " + (powerN(2, 5) == 32));
    System.out.println("Test 09: " + (powerN(10, 1) == 10));
    System.out.println("Test 10: " + (powerN(10, 2) == 100));
    System.out.println("Test 11: " + (powerN(10, 3) == 1000));
    System.out.println("Test 12: " + (powerN(0, 2) == 0));
    System.out.println("Test 12: " + (powerN(10, 0) == 1));
  }

  /* https://codingbat.com/prob/p107330
   * Eine Menge an Hasen steht in einer Reihe und sind durchnummeriert.
   * Die ungerade nummerierten Hasen (1,3,5,...) haben zwei Ohren,
   * die gerade nummerierten (2,4,6,...) Hasen haben drei Ohren
   * (weil sie heimlich noch einen Fuß in die Luft halten).
   * Schreiben Sie eine Methode public static int bunnyEars2(int bunnies),
   * welche für die Anzahl bunnies an Hasen in einer Reihen die Gesamtzahl an Ohren zurückgibt.
   * Verwenden Sie Rekursion und keine Schleifen oder Multiplikation.
   */
  public static int bunnyEars2(int bunnies) {
    if (bunnies == 0) {
      return 0;
    } else {
      if (bunnies % 2 == 0) {
        return 3 + bunnyEars2(bunnies - 1);
      } else {
        return 2 + bunnyEars2(bunnies - 1);
      }
    }
  }

  private static void testBunnyEars2() {
    System.out.println("Testing bunnyEars2... passes if all true:");
    System.out.println("Test 01: " + (bunnyEars2(0) == 0));
    System.out.println("Test 02: " + (bunnyEars2(1) == 2));
    System.out.println("Test 03: " + (bunnyEars2(2) == 5));
    System.out.println("Test 04: " + (bunnyEars2(3) == 7));
    System.out.println("Test 05: " + (bunnyEars2(4) == 10));
    System.out.println("Test 06: " + (bunnyEars2(5) == 12));
    System.out.println("Test 07: " + (bunnyEars2(6) == 15));
    System.out.println("Test 08: " + (bunnyEars2(10) == 25));
  }

  /* https://codingbat.com/prob/p183174
   * Schreiben Sie eine Methode public static boolean nestParen(String str), welche feststellt,
   * ob die Klammerung im String str korrekt ist; d.h. immer Paare von '(' und ')' sind vorhanden).
   * Tipp: Prüfen Sie in Ihrem Algorithmus die ersten und letzten Zeichen des Strings
   * um festzustellen, ob zwei Klammern zusammenpassen und lösen Sie so das Problem rekursiv.
   * Geben Sie als Ergebnis true zurück, wenn die Klammerung korrekt ist und "aufgeht",
   * false falls nicht. Falls andere Zeichen vorkommen, liefern Sie false zurück.
   */
  public static boolean nestParen(String str) {
    if (str.length() == 0) {
      return true;
    }

    if (str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
      return false;
    } else {
      return nestParen(str.substring(1, str.length() - 1));
    }
  }

  private static void testNestParen() {
    System.out.println("Testing nestParen... passes if all true:");
    System.out.println("Test 01: " + nestParen("(())"));
    System.out.println("Test 02: " + nestParen("((()))"));
    System.out.println("Test 03: " + !nestParen("(((x))"));
    System.out.println("Test 04: " + !nestParen("((())"));
    System.out.println("Test 05: " + !nestParen("((()()"));
    System.out.println("Test 06: " + nestParen("()"));
    System.out.println("Test 07: " + nestParen(""));
    System.out.println("Test 08: " + !nestParen("(yy)"));
    System.out.println("Test 09: " + nestParen("(())"));
    System.out.println("Test 10: " + !nestParen("(((y))"));
    System.out.println("Test 11: " + !nestParen("((y)))"));
    System.out.println("Test 12: " + nestParen("((()))"));
    System.out.println("Test 13: " + !nestParen("(())))"));
    System.out.println("Test 14: " + !nestParen("((yy())))"));
    System.out.println("Test 15: " + nestParen("(((())))"));
  }
}