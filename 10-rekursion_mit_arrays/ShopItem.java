/* Übung 10 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=wdqO_u2xSxE
 */

/*
 * Aufgabenstellung siehe ShoppingCart.java
 */

public class ShopItem {
  private double price;
  private double count;

  ShopItem(double price, double count) {
    this.price = price;
    this.count = count;
  }

  public double getTotal() {
    return this.price * this.count;
  }
}
