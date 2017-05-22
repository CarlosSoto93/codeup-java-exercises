package JavaII;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {

        Map students = new HashMap();

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

        students.put("CarlosGithub", carlos.getGradeAverage());
        students.put("RubensGithub", ruben.getGradeAverage());
        students.put("FranciscosGithub", francisco.getGradeAverage());
        students.put("RociosGithub", rocio.getGradeAverage());


        System.out.println(carlos.getName() + ": " + students.get("CarlosGithub"));
        System.out.println(ruben.getName() + ": " + students.get("RubensGithub"));
        System.out.println(francisco.getName() + ": " + students.get("FranciscosGithub"));
        System.out.println(rocio.getName() + ": " + students.get("RociosGithub"));


    }
}
