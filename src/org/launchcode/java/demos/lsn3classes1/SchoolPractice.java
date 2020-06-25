package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student smartestOne = new Student();
        smartestOne.setName("Mary");
        smartestOne.setStudentId(777);
        smartestOne.setNumberOfCredits(1);
        smartestOne.setGpa(4.0);

        System.out.println(smartestOne.getName());

    }
}
