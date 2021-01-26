/* Hausaufgabe 08 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=kaKytF988_Q
 */

/*
 * Aufgabenstellung siehe Article.java
 */

public class ArticleTest {
  public static void main(String[] args) {
    Article networkCable = new Article("Netzwerkleitung", 6000);
    Article pliers = new Article("Knipex", 1500);
    Article lsaTool = new Article("Auflegewerkzeug", 2500);
    Article networkSwitch = new Article("Switch", 15000);

    System.out.println(networkCable);
    System.out.println(pliers);
    System.out.println(lsaTool);
    System.out.println(networkSwitch);

    Article.changePrices(new Article[] { pliers, lsaTool }, 0.1);
    System.out.println(pliers);
    System.out.println(lsaTool);

    Article.changePrices(new Article[] { networkCable }, -0.1);
    System.out.println(networkCable);
  }
}
