package com.example.alexs.reportcardclass;

/**
 * Created by alexs on 7/3/16.
 */
public class ReportCard {

    //Set initial variables
    String studentName = "Alex Springer";
    int chemistryGrade = 92;
    int calculusGrade = 98;
    int computerScienceGrade = 96;
    int biologyGrade = 89;
    int avgGrade = (chemistryGrade + calculusGrade + computerScienceGrade + biologyGrade)/4;


    // Get or set the name of the student on this report card
    @Override
    public String toString(){
        String fullReport = "Name: " + studentName + ";\n" +
                "Course Grades:\n" +
                "Chemistry: " + chemistryGrade + " percent\n" +
                "Calculus: " + calculusGrade + " percent\n" +
                "Computer Science: " + computerScienceGrade + "percent\n" +
                "Biology: " + biologyGrade + " percent;\n" +
                "Current Average: " + avgGrade + " percent";
        return fullReport;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
    // Get or set the grade for the Chemistry course
    public int getChemistryGrade() {
        return chemistryGrade;
    }
    public void setChemistryGrade(int grade) {
        chemistryGrade = grade;
    }
    // Get or set the grade for the Calculus course
    public int getCalculusGrade() {
        return calculusGrade;
    }
    public void setCalculusGrade(int grade) {
        calculusGrade = grade;
    }

    // Get or set the grade for the Computer Science course
    public int getComputerScienceGrade() {
        return computerScienceGrade;
    }
    public void setComputerScienceGrade(int grade) {
        computerScienceGrade = grade;
    }

    // Get or set the grade for the biology course
    public int getBiologyGrade() {
        return biologyGrade;
    }
    public void setBiologyGrade(int grade) {
        biologyGrade = grade;
    }

}
