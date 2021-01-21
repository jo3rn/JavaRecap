/* Hausaufgabe 06 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=dbVTsNgdApw
 */

/* In dieser Aufgabe implementieren Sie eine Text-Verschlüsselung, die auf Julius Caesars
 * Verschlüsselungsalgorithmus basiert. Dabei wird für jeden Großbuchstaben A bis Z jeweils ein
 * Austauschzeichen definiert (Kleinbuchstaben und andere Zeichen bleiben in dieser Aufgabe
 * einfach erhalten), z.B. könnte man folgende Ersetzungen vornehmen:
 * A durch Z, B durch Y, C durch X und so weiter bis Y durch B und Z durch A.
 * Dies kann man durch den Schlüssel "ZYXWVUTSRQPONMLKJIHGFEDCBA" darstellen.
 * An Position 0 steht das Austauschzeichen für A an Position 25 steht das Austauschzeichen für Z.
 * Wendet man den Schlüssel auf den Text "HALLO ANNA" an so ist der verschlüsselte Text
 * entsprechend "SZOOL ZMMZ" (Leerzeichen bleiben unverändert).
 *
 * Um den Schlüssel in Java zu speichern verwenden Sie ein char Array.
 * Da Character (char) als Datentyp in Java ebenfalls Zahlen sind und lediglich
 * als Zeichen (Buchstaben, usw.) ausgegeben werden, kann man über char auch iterieren und
 * char als Index für Arrays verwenden (!).
 * So können Sie das Austauschzeichen für A an Position ‚A‘ speichern.
 * Folgendes Codebeispiel verdeutlicht dies.
 *
 *    // print chars A to Z
 *    for (char c= 65; c <= 90; c++) {
 *      System.out.println(c);
 *    }
 *    // create a boring key char[]
 *    char[] key = new char[256];
 *    for (char c=0; c < 256; c++) {
 *      key[c] = c;
 *    }
 *    // print all 256 characters' replacements
 *    for (int i=0; i < 256; i++) {
 *      System.out.println(key[i]);
 *    }
 *
 * Dieser Code gibt zunächst alle Großbuchstaben von A bis Z auf der Konsole aus.
 * Dann wird für jedes Zeichen das Zeichen selbst als Austauschzeichen in einem char[] key definiert
 * (wenig spannend zugegeben) und 256 Zeichen werden zeilenweise auf die Konsole geschrieben.
 *
 * Vorgeschlagenes Vorgehen zur Implementierung von Caesars Code (erst komplett lesen):
 * 1. Schreiben Sie eine Methode public static int[] getFrequency(Strings s),
 *    die die Anzahl der Vorkommen jedes Zeichens im String s zählt und an dem Index des Zeichens
 *    im Resultat speichert. Kommt also 'A' dreimal vor, so steht an Index 'A' eine 3.
 *    (nicht unbedingt notwendig für Caesars Code)
 * 2. Schreiben Sie eine Methode public static char[] getKey(String s), die einen String aus
 *    26 Zeichen als Argument nimmt (ansonsten liefert die Methode null als Rückgabe) und
 *    das Zeichen an Position 0 als Austauschzeichen für 'A' nimmt, das Zeichen an Position 1
 *    als Austauschzeichen für 'B' usw. Das Resultat soll ein char[] mit 256 Elementen sein.
 *    Für alle anderen Zeichen soll das Zeichen selbst auch das Austauschzeichen sein.
 * 3. Schreiben Sie eine Methode public static String encrypt(String text, char[] key),
 *    die den String mit dem Schlüssel verschlüsselt und die obige Methode getKey verwendet.
 * 4. Schreiben Sie eine Methode public static String decrypt(String cipher, char[] key),
 *    die den verschlüsselten Text mit dem Schlüssel entschlüsselt und obige Methode getKey
 *    verwendet.
 *
 * In der Vorgabedatei CaesarsCode.java finden Sie fertige Testfälle in der main Methode.
 */

// created by Prog1-Team
// Skeleton file to use as a base
public class CaesarsCode {
  public static void main(String[] args) {
    // Key and text to encrypt are read from start arguments (or program ends directly)
    if (args.length != 2) {
      return;
    }
    String keyPhrase = args[0];
    String text = args[1];

    // test cases are already implemented and main is 'done'
    char[] key = getKey(keyPhrase);
    int[] frequencies = getFrequency(text);
    System.out.println("Anzahl A:" + frequencies['A']);
    System.out.println("Anzahl ' ':" + frequencies[' ']);
    System.out.println("Anzahl 1:" + frequencies['1']);
    System.out.println(encrypt(text, key));
    System.out.println(decrypt(encrypt(text, key),key));
  }

  public static int[] getFrequency(String s) {
    int[] frequency = new int[256];
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      frequency[c]++;
    }
    return frequency;
  }

  public static char[] getKey(String key) {
    char[] result = new char[256];
    if (key.length() != 26) {
      return null;
    }

    for (int i = 0; i < result.length; i++) {
      result[i] = (char) i;
    }

    int j = 0;
    for (char c = 'A'; c <= 'Z'; c++) {
      result[c] = key.charAt(j);
      j++;
    }

    return result;
  }

  public static String encrypt(String text, char[] key) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      result += key[c];
    }
    return result;
  }

  public static String decrypt(String cipher, char[] key) {
    String result = "";
    String cipherString = new String(key);
    for (int i = 0; i < cipher.length(); i++) {
      char c = cipher.charAt(i);
      int index = cipherString.indexOf(c);
      result += (char) index;
    }
    return result;
  }
}