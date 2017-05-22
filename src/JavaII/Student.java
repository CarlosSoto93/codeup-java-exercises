package JavaII;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double gradesAddedUp = 0;
        for (Double grade : grades){
            gradesAddedUp += grade;
        }

        return gradesAddedUp / grades.size();
    }

    public static void main(String[] args) {

        Student studentCarlos = new Student("Carlos");
        Student studentEmilio = new Student("Emilio");
        Student studentJosh = new Student("Josh");
        Student studentDan = new Student ("Dan");

        studentCarlos.addGrade(95);
        studentCarlos.addGrade(80);
        studentCarlos.addGrade(100);
        studentCarlos.addGrade(90);

        studentEmilio.addGrade(90);
        studentEmilio.addGrade(90);
        studentEmilio.addGrade(90);
        studentEmilio.addGrade(90);

        studentJosh.addGrade(87);
        studentJosh.addGrade(83);
        studentJosh.addGrade(85);
        studentJosh.addGrade(97);

        studentDan.addGrade(100);
        studentDan.addGrade(100);
        studentDan.addGrade(105);
        studentDan.addGrade(106);

        System.out.println(studentCarlos.getName() + " " + studentCarlos.getGradeAverage());
        System.out.println(studentEmilio.getName() + " " + studentEmilio.getGradeAverage());
        System.out.println(studentJosh.getName() + " " + studentJosh.getGradeAverage());
        System.out.println(studentDan.getName() + " " + studentDan.getGradeAverage());
    }

}
