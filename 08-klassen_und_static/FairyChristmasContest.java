/* Hausaufgabe 08 Aufgabe 0
 * Link: https://www.youtube.com/watch?v=jFPvrtt6MSg
 */

/*
 * Aufgabenstellung siehe FairyChristmasCharacter.java
 */

import java.util.Random;

public class FairyChristmasContest {
  public static void main(String[] args) {
    FairyChristmasCharacter santaClause = FairyChristmasCharacter.getSantaClause();
    FairyChristmasCharacter christChild = FairyChristmasCharacter.getChristChild();

    Random random = new Random();

    for (long i = 0; i < 7_800_000_000L; i++) {
      int randomNumber = random.nextInt(3);
      if (randomNumber == 0) {
        santaClause.waitingForYou();
      } else if (randomNumber == 1) {
        christChild.waitingForYou();
      }
    }

    FairyChristmasCharacter.printWaitingCount();
  }
}
