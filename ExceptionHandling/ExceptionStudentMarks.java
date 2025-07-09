package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionStudentMarks {

    public static void main(String[] args) {

        int studentCount;
        int subjectCount;
        int Total;
        double Avg;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        studentCount = scanner.nextInt();

        System.out.println("Enter the number of subjects:");
        subjectCount = scanner.nextInt();

        int[][] Marks = new int[studentCount][subjectCount];
        String[] StudentName = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            StudentName[i] = scanner.next();

            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                Marks[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student: " + StudentName[i]);
            Total = 0;

            for (int j = 0; j < subjectCount; j++) {
                try {
                    if (Marks[i][j] <= 0) {
                        throw new IllegalArgumentException("Marks cannot be less than 0  " + (j + 1));
                    }
                    System.out.println("Subject " + (j + 1) + " Marks: " + Marks[i][j]);
                    Total += Marks[i][j];
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            Avg = Total / (double) subjectCount; 
            System.out.println("Total Marks: " + Total);
            System.out.println("Average Marks: " + Avg);
        }
    }
}
