/* Übung 08 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=isoADJZO77k
 */

/*
 * Aufgabenstellung siehe Student.java
 */

public class MatriculationNumbers {
  private long matriculationNumber = 1;

  private static MatriculationNumbers instance = new MatriculationNumbers();

  private MatriculationNumbers() {
  }

  public long getNextMatriculationNumber() {
    return matriculationNumber++;
  }

  public static MatriculationNumbers getInstance() {
    return instance;
  }
}
