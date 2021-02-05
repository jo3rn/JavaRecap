/* Übung 10 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=wdqO_u2xSxE
 */

/* 1. Implementieren Sie eine iterative Lösung (Schleife(n)) für die Berechnung der Gesamtsumme
 *    aller Waren eines Warenkorbes.
 *    Die Einzelpreise der Waren im Warenkorb befinden sich im Array double[] itemPrices.
 *    Die Anzahl, die die Kundin je von diesen Waren im Warenkorb hat im Array int[] itemCount.
 *    Offensichtlich sind beide Arrays gleich lang. Sie benötigen eine aufrufende Methode,
 *    z.B. die main-Methode um Ihre Lösung mit einigen Preisen und Anzahlen zu testen
 *    (z.B. fünf Waren in unterschiedlicher Menge und mit unterschiedlichen Preisen).
 *    Tipp: Die Gesamtsumme berechnen Sie über die Summierung der einzelnen Produkte
 *    von Einzelpreis und Anzahl.
 * 2. Implementieren Sie nun eine rekursive Lösung.
 * 3. Diskutieren Sie, welche Variante Ihnen leichter fällt und warum.
 * 4. Ändern Sie eine der beiden Varianten (iterativ oder rekursiv) in eine
 *    objektorientierte Lösung, bei der es nur noch ein Array ShopItem[] items gibt
 *    mit Instanzen einer Klasse ShopItem.
 *    Ihre neue Klasse ShopItem benötigt mindestens ein Attribut für den Einzelpreis
 *    und ein Attribut für die Anzahl. Außerdem ist ratsam, die Attribute als private zu deklarieren
 *    und Methoden zum Setzen und Auslesen des Einzelpreises, zum Setzen und Auslesen der Anzahl
 *    und zum Auslesen des Gesamtpreises zu implementieren.
 *    Im Ergebnis sollten Sie feststellen können, dass die eigentliche Berechnung des
 *    Warenkorb-Gesamtpreises nun wesentlich übersichtlicher ist,
 *    da die Klasse ShopItem die Logik und Daten für eine einzelne Ware kapselt.
 */
public class ShoppingCart {
  public static void main(String[] args) {
    double[] itemPrices = { 1.00, 2.59, 3.33, 9.99, 0.25 };
    double[] itemCount = { 4, 11, 0, 2, 1 };
    // 4 + 28.49 + 0 + 19.98 + 0.25 = 52.72

    double totalIterative = totalIterative(itemPrices, itemCount);
    System.out.println(totalIterative + "€ (Gesamtsumme iterativ berechnet)");
    double totalRecursive = totalRecursive(itemPrices, itemCount, 0);
    System.out.println(totalRecursive + "€ (Gesamtsumme rekursiv berechnet)");

    /* itemPrices and itemCount are empty */
    double[] emptyArray = new double[0];

    double totalIterativeEmpty = totalIterative(emptyArray, emptyArray);
    System.out.println(totalIterativeEmpty + "€ (Gesamtsumme iterativ berechnet)");
    double totalRecursiveEmpty = totalRecursive(emptyArray, emptyArray, 0);
    System.out.println(totalRecursiveEmpty + "€ (Gesamtsumme rekursiv berechnet)");

    /* itemPrices and itemCount differ in length */
    double[] itemPricesUneven = { 1.00, 2.59, 3.33, 9.99, 0.25 };
    double[] itemCountUneven = { 4, 11, 0, 2 };

    double totalIterativeUneven = totalIterative(itemPricesUneven, itemCountUneven);
    System.out.println(totalIterativeUneven + "€ (Gesamtsumme iterativ berechnet)");
    double totalRecursiveUneven = totalRecursive(itemPricesUneven, itemCountUneven, 0);
    System.out.println(totalRecursiveUneven + "€ (Gesamtsumme rekursiv berechnet)");

    /* use instances of ShopItem instead of two separate arrays */
    ShopItem[] shopItems = {
        new ShopItem(1.00, 4),
        new ShopItem(2.59, 11),
        new ShopItem(3.33, 0),
        new ShopItem(9.99, 2),
        new ShopItem(0.25, 1) };

    double totalIterativeShopItem = totalIterative(shopItems);
    System.out.println(totalIterativeShopItem + "€ (Gesamtsumme objektorientiert berechnet)");
    double totalIterativeShopItemEmpty = totalIterative(new ShopItem[0]);
    System.out.println(totalIterativeShopItemEmpty + "€ (Gesamtsumme objektorientiert berechnet)");
  }

  private static double totalIterative(double[] itemPrices, double[] itemCount) {
    if (itemCount.length != itemPrices.length) {
      System.out.println("Arrays haben unterschiedliche Länge");
      return 0;
    }

    double total = 0;

    for (int i = 0; i < itemPrices.length; i++) {
      total += itemPrices[i] * itemCount[i];
    }

    return total;
  }

  private static double totalIterative(ShopItem[] shopItems) {
    double total = 0;

    for (int i = 0; i < shopItems.length; i++) {
      total += shopItems[i].getTotal();
    }

    return total;
  }

  private static double totalRecursive(double[] itemPrices, double[] itemCount, int startPos) {
    if (itemPrices.length == 0) {
      return 0;
    }

    if (itemCount.length != itemPrices.length) {
      System.out.println("Arrays haben unterschiedliche Länge");
      return 0;
    }

    double total = itemPrices[startPos] * itemCount[startPos];

    if (startPos == itemPrices.length - 1) {
      return total;
    }

    return total + totalRecursive(itemPrices, itemCount, startPos + 1);
  }
}
