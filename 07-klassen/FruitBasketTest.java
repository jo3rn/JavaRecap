
// created by J. Konert

public class FruitBasketTest {
  public static void main(String[] args) {
    FruitBasket basket = new FruitBasket();
    basket.addApple(150); // 150gr Apfel reinlegen
    basket.addApple(99); // kein Apfel rein
    // auf der Konsole: "zu leicht"
    basket.addApple(201); // kein Apfel rein
    // auf der Konsole: "zu schwer"
    basket.addApple(200);
    System.out.println(basket.getTotalFruits()); // Ausgabe: 2
    System.out.println(basket.getTotalWeight()); // Ausgabe: 350
    for (int i = 1; i <= 9; i++) {
      basket.addApple(100);
    } // Ausgabe: "zu viele Aepfel"
    System.out.println(basket.getTotalFruits()); // Ausgabe: 10
    System.out.println(basket.getTotalWeight()); // Ausgabe: 1150
  }
}

