package grades;


import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

            Student Billy = new Student();

            Billy.addGrade(100);
            Billy.addGrade(88);
            Billy.addGrade(67);
            Billy.addGrade(89);

            Student Stephanie = new Student();

            Stephanie.addGrade(100);
            Stephanie.addGrade(98);
            Stephanie.addGrade(92);
            Stephanie.addGrade(93);

            Student Jack = new Student();

            Jack.addGrade(100);
            Jack.addGrade(98);
            Jack.addGrade(96);
            Jack.addGrade(89);

            Student Tim = new Student();

            Tim.addGrade(100);
            Tim.addGrade(88);
            Tim.addGrade(98);
            Tim.addGrade(96);

            Student Pat = new Student();

            Pat.addGrade(100);
            Pat.addGrade(100);
            Pat.addGrade(99);
            Pat.addGrade(100);

            Student Jane = new Student();

            Jane.addGrade(97);
            Jane.addGrade(100);
            Jane.addGrade(98);
            Jane.addGrade(91);

            Student Nestor = new Student();

            Nestor.addGrade(54);
            Nestor.addGrade(67);
            Nestor.addGrade(71);
            Nestor.addGrade(80);

        System.out.println(Nestor.grades);
        System.out.println(Nestor.getGradeAverage());

        HashMap<String, String> students = new HashMap<>();

        students.put("1","Stephanie");
        students.put("2","Jack");
        students.put("3","Tim");
        students.put("4","Pat");
        students.put("5","Jane");
        students.put("6","Nestor");
        students.put("7","Billy");

        System.out.println(students);

    }
}
