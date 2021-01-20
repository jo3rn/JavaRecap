/* Hausaufgabe 05 Aufgabe 3
 * Link: https://www.youtube.com/watch?v=4G25kaQvuwc
 */

/* Ein Anagramm einer Zeichenkette ist eine Zeichenkette mit exakt gleich vielen,
 * identischen Zeichen in gegebenenfalls anderer Reihenfolge.
 * Beispiel: "betrug" und "geburt" sind Anagramme voneinander.
 * Außerdem sollen Leerzeichen ignoriert werden, so dass auch
 * "tom marvolo riddle" und "i am lord voldemort" Anagramme voneinander sind.
 * Klein-/Großschreibung soll hingegen berücksichtigt werden.
 * Schreiben Sie eine Methode public static boolean anagram(String s1, String s2), die prüft,
 * ob die beiden Argumente Anagramme voneinander sind. Testen Sie in der main!
 *
 * Gehen Sie dabei wie folgt vor (und nicht anders, etwa Sortieren mit eingebauten Methoden):
 * - Entfernen Sie zunächst alle Leerzeichen.
 * - Entfernen Sie nacheinander jedes Zeichen in s1 aus s2, falls s1 und s2 dieselbe Länge haben.
 */

public class Anagram {
  public static void main(String[] args) {
    System.out.println("Testing anagram method... passes if all are true:");
    System.out.println(anagram("anagram", "anagram") == true);
    System.out.println(anagram("lagerregal", "regallager") == true);
    System.out.println(anagram("programmieren", "oper immer rang") == true);
    System.out.println(anagram("tom marvolo riddle", "i am lord voldemort") == true);
    System.out.println(anagram("java", "cpluplus") == false);
    System.out.println(anagram("warmer regen", "kalte dusche") == false);
  }

  public static boolean anagram(String s1, String s2) {
    s1 = s1.replaceAll(" ", "");
    s2 = s2.replaceAll(" ", "");

    if (s1.length() != s2.length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      char c = s1.charAt(i);
      int index = s2.indexOf(c);

      if (index == -1) {
        return false;
      }

      s2 = s2.substring(0, index) + s2.substring(index + 1);
    }

    return true;
  }
}
