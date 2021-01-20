/* Übung 05 Aufgabe 4
 * Link: https://www.youtube.com/watch?v=Ps2tFlvyL3o
 */

/* Studieren Sie die Dokumentation der String Klasse in Java und
  * probieren Sie mindestens drei neue Methoden an einfachen Beispielen aus.
  * Die Doku finden Sie hier: https://docs.oracle.com/javase/9/docs/api/java/lang/String.html */

public class StringFun {
  public static void main(String[] args) {
    String book = "book";
    System.out.println(book.length()); // die Länge von 'book' ist 4
    System.out.println(book.isEmpty()); // der String 'book' ist nicht leer

    String look = book.replace('b', 'l'); // 'b' wird durch 'l' ersetzt
    System.out.println(look); // look

    System.out.println(book.compareTo(look)); // -10: 'b' steht vor 'l'

    String upperLook = "Look";
    System.out.println(book.compareTo(upperLook)); // 22: 'L' steht vor 'b'
  }
}
