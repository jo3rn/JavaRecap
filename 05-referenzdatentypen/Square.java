/* Übung 05 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=9YWL-B0qt0k
 */

/* Schreiben Sie eine Methode public static String square(int width),
 * die ein ASCII Art Quadrat als String zurückgibt. */

public class Square {
  public static void main(String[] args) {
    System.out.println(square(5));
  }

  public static String square(int width) {
    return ("X".repeat(width) + "\n").repeat(width);
  }
}
