/* Übung 08 Aufgabe 1
 * Link:
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
}
