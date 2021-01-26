/* Hausaufgabe 08 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=kaKytF988_Q
 */

/* Implementieren Sie eine Klasse Article,
 * welche eine Warenprodukt eines Online-Shops repräsentiert.
 * 1. Ein Artikel sollte mindestens einen Titel, einen Preis und
 *    eine eindeutige Artikelnummer haben. Es gibt Ähnlichkeiten zur Implementierung des Kontos
 *    aus der SU, woran Sie sich orientieren können
 *    (insbesondere bezüglich der Vergabe der Artikelnummern).
 * 2. Ergänzen Sie die Klasse Article um Klassenattribute und Klassenmethoden
 *    für die Anzahl aller verfügbaren Artikel
 * 3. Implementieren Sie eine Klasse ArticleTest mit einer main-Methode und instanziieren Sie
 *    darin einige Artikel zum Test. Geben Sie die Artikelbezeichnungen, Artikelnummern und
 *    Preise sowie Gesamtzahl an Artikeln auf die Konsole aus (Tipp: Wenn Sie mögen implementieren
 *    Sie eine Objektmethode public String toString() für Article, welche ein
 *    System.out.println(myArticle) dann automatisch nutzt.
 * 4. Ergänzen Sie in Article eine Klassenmethode
 *    public static void changePrices(Article[] articles, double percentage),
 *    welche alle Artikel des übergeben Arrays um den in percentage angegebenen Prozentsatz im
 *    Preis anpasst. (Verständnisfrage: Warum reicht bei dieser Methode als Rückgabe void ?)
 * 5. Schreiben Sie am Ende auf, welche Attributwerte, Variablen und Objekte
 *    sich alle im Metaspace, im Heap und im Stack befinden,
 *    wenn Sie in der letzten Zeile Ihre main-Methode anhalten würden.
 */
public class Article {
  private String name;
  private int price;
  private int number;

  private static int nextNumber = 1;
  private static int amountOfArticles = 0;

  public Article(String name, int price) {
    this.name = name;
    this.price = price;
    this.number = nextNumber++;
    amountOfArticles++;
  }

  public String toString() {
    return String.format("%s (%d): %.2f€\nGesamtartikel: %d\n",
        name, number, price / 100f, amountOfArticles);
  }

  public static void changePrices(Article[] articles, double percentage) {
    for (int i = 0; i < articles.length; i++) {
      articles[i].price *= (1 + percentage);
    }
  }

  public static int getAmountOfArticles() {
    return amountOfArticles;
  }
}
