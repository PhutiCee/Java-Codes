/* 
Use a string builder to construct a sentence that describes your personal details, 
including your name, academic year, field of study and the university.
*/

package Exercises;

public class MyProfile {
    public static void main(String[] args) {
        StringBuilder nameSurname = new StringBuilder("Phuti Sekwadi");
        StringBuilder academicYear = new StringBuilder("Final year");
        StringBuilder fieldOfStudy = new StringBuilder("Mathematical and Computer Science");
        StringBuilder university = new StringBuilder("University of Limpopo");

        System.out.printf("My name: %s\nAcademic Year: %s\nField of study: %s\nUniversity: %s \n\n\n", nameSurname,
                academicYear,
                fieldOfStudy, university);
    }
}
