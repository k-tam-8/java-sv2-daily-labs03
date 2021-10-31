package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        students.addHeight(124);
        students.addHeight(135);
        students.addHeight(141);
        System.out.println(students.isHeightIncreasing());
        students.addHeight(121);
        System.out.println(students.isHeightIncreasing());
    }
}
