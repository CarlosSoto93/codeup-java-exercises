package JavaII;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Map<String, Student> students = new HashMap();

        Student carlos = new Student("Carlos");
        Student ruben = new Student("Ruben");
        Student francisco = new Student("Francisco");
        Student rocio = new Student("Rocio");

        carlos.addGrade(90);
        carlos.addGrade(100);
        carlos.addGrade(96);

        ruben.addGrade(65);
        ruben.addGrade(72);
        ruben.addGrade(70);

        francisco.addGrade(70);
        francisco.addGrade(72);
        francisco.addGrade(71);

        rocio.addGrade(80);
        rocio.addGrade(76);
        rocio.addGrade(72);

        students.put("CarlosGithub", carlos);
        students.put("RubensGithub", ruben);
        students.put("FranciscosGithub", francisco);
        students.put("RociosGithub", rocio);


//        System.out.println(students.get("CarlosGithub").getAllGrades());


        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:\n");

        students.forEach((key, value) -> {
            System.out.print("|" + key + "| ");
        });
        System.out.println("Or |view all| to see all grades for all students.");
//        System.out.println("");
        Boolean anotherStudent;

        do {

            String selectedStudent = input.getString("\nWhat student would you like to see more information on?\n");

            if (students.get(selectedStudent) != null) {
                System.out.println("\nName: " + students.get(selectedStudent).getName() + " - Github Username: " + selectedStudent);
                System.out.println("Current Average: " + students.get(selectedStudent).getGradeAverage());
                System.out.println("Grades: \n" + students.get(selectedStudent).getAllGrades());
                anotherStudent = input.yesNo("\nWould you like to see another student?\n");
                input.removeEnter();
            } else if (selectedStudent.equalsIgnoreCase("view all")) {

                System.out.println("");
                students.forEach((key, value) -> {
                    System.out.println("Student: " + key);
                    System.out.println("Grades: \n" + value.getAllGrades());
                });

                anotherStudent = input.yesNo("Would you like to see more on a student?\n");
                input.removeEnter();
            } else {
                System.out.println("\nSorry, no students found with the github username of " + "\"" + selectedStudent + "\"\n");
                anotherStudent = input.yesNo("Would you like to see another student?\n");
                input.removeEnter();
            }

        } while (anotherStudent == true);

        System.out.println("\nGoodbye, have a wonderful day!");


    }
}
