/* Übung 08 Aufgabe 1
 * Link: https://www.youtube.com/watch?v=isoADJZO77k
 */

/*
 * Aufgabenstellung siehe Student.java
 */

public class StudentTest {
  public static void main(String[] ignoredArgs) {
    Student susan = new Student("Susan Glow", 'd', "susan.glow@cs.hs-fulda.de", 2, 0);
    Student lara = new Student("Lara Müller", 'f', "lara.mueller@cs.hs-fulda.de", 1, 0);
    Student pieter = new Student("Pieter Ornov", 'm', "pieter.Ornov@cs.hs-fulda.de", 8, 1);
    Student clara = new Student("Clara de Manielle", 'f', "clara.de-manielle@cs.hs-fulda.de", 3, 0);

    boolean checkSusan = susan.getSemesters() == 2 && susan.isGender('d') && !susan.isGender('f');
    boolean checkLara = lara.getSemesters() == 1 && lara.isGender('f') && !lara.isGender('m');
    boolean checkPieter = pieter.getSemesters() == 9
        && pieter.isGender('m') && !pieter.isGender('d');

    Student[] students = Student.filter(new Student[] {susan, lara, pieter, clara}, 'f', 1, 2);
    boolean checkStudents = students != null && students.length == 1 && students[0] == lara;
    System.out.println(checkSusan && checkLara && checkPieter && checkStudents
        ? "all Tests passed!" : "Test failed! See sourcecode for details.");
  }
}