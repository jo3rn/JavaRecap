/* Übung 08 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=isoADJZO77k
 */

/* Schreiben Sie eine Klasse Student zur Verwaltung aller Daten eines Studierenden in einem Objekt.
 * Studierende haben
 * - Namen (String),
 * - Geschlecht (char, ‚f‘„female“, ‚m‘„male“ oder ‚d‘ „divers“, ‚u‘ im Falle ungültiger Angaben),
 * - Matrikelnummer (long),
 * - Email-Adresse (String),
 * - Fachsemesterzahl (int)
 * - Urlaubssemesterzahl (int).
 *
 * Die Matrikelnummer soll bei Instanziierung automatisch und garantiert eindeutig vergeben werden.
 * Orientieren Sie sich am SU Beispiel der Klasse Account (für Konten).
 *
 * Mindestens der Konstruktor
 *    public Student(String name, char gender, String email, int studyTerms, int holidayTerms)
 * sollte vorhanden sein.
 *
 * Ergänzen Sie die Klasse Student um folgende Fähigkeiten
 * (entscheiden Sie jeweils, ob Objektmethoden oder Klassenmethoden zu implementieren sind):
 *  • getSemesters() gibt als int-Rückgabe die Summe aller bisher studierten Semester
 *    eines Studierenden zurück (Fach- + Urlaubssemester)
 *  • isGender(char gender) gibt als boolean-Rückgabe true,
 *    falls der Studierende dieses Geschlecht angegeben hat
 *  • filter(Student[] students, char gender, int minSemesters, int maxSemesters)
 *    gibt als Student[] Rückgabe alle Studierenden des übergebenen Arrays students zurück,
 *    welche dem Geschlecht des Parameters gender entsprechen und mindestens minSemesters studiert
 *    haben und maximal maxSemesters studiert haben.
 *
 * Testen Sie Ihre Implementierung mit der main-Methode der Klasse StudentTest.java
 * Darin können Sie auch ablesen, ob obige Methoden Objekt- oder Klassenmethoden sind.
 */

public class Student {
  private String name;
  private char gender;
  private String email;
  private long matriculationNumber;
  private int studyTerms;
  private int holidayTerms;

  public Student(String name, char gender, String email, int studyTerms, int holidayTerms) {
    this.name = name;
    this.gender = gender;
    this.email = email;
    this.studyTerms = studyTerms;
    this.holidayTerms = holidayTerms;

    this.matriculationNumber = MatriculationNumbers.getInstance().getNextMatriculationNumber();
  }

  public int getSemesters() {
    return studyTerms + holidayTerms;
  }

  public boolean isGender(char gender) {
    return gender == this.gender;
  }

  public static Student[] filter(Student[] students,
                                 char gender,
                                 int minSemesters,
                                 int maxSemesters) {
    int count = 0;

    for (int i = 0; i < students.length; i++) {
      if (students[i].isGender(gender) && students[i].getSemesters() >= minSemesters
          && students[i].getSemesters() <= maxSemesters) {
        count++;
      }
    }

    Student[] filteredStudents = new Student[count];
    count = 0;

    for (int i = 0; i < students.length; i++) {
      if (students[i].isGender(gender) && students[i].getSemesters() >= minSemesters
          && students[i].getSemesters() <= maxSemesters) {
        filteredStudents[count] = students[i];
        count++;
      }
    }

    return filteredStudents;
  }
}
