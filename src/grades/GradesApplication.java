package grades;



public class GradesApplication {

    public static void main(String[] args) {

            Student billy = new Student();

            billy.addGrade(100);
            billy.addGrade(88);
            billy.addGrade(67);
            billy.addGrade(89);
        System.out.println(billy.grades);
        System.out.println(billy.getGradeAverage());

    }
}
