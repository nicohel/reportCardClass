package com.example.alexs.reportcardclass;

/**
 * Created by alexs on 7/3/16.
 */
public class ReportCard {

    //Set initial variables
    String studentName = "Alex Springer";
    int mChemistryGrade = 92;
    int mCalculusGrade = 98;
    int mComputerScienceGrade = 96;
    int mBiologyGrade = 89;
    int mAvgGrade = (mChemistryGrade + mCalculusGrade + mComputerScienceGrade + mBiologyGrade)/4;


    // Get or set the name of the student on this report card
    @Override
    public String toString(){
        String fullReport = "Name: " + studentName + ";\n" +
                "Course Grades:\n" +
                "Chemistry: " + mChemistryGrade + " percent\n" +
                "Calculus: " + mCalculusGrade + " percent\n" +
                "Computer Science: " + mComputerScienceGrade + "percent\n" +
                "Biology: " + mBiologyGrade + " percent;\n" +
                "Current Average: " + mAvgGrade + " percent";
        return fullReport;
    }
    
    public ReportCard(String vstudentName,
            int vchemistryGrade,
            int vcalculusGrade,
            int vcomputerScienceGrade,
            int vbiologyGrade){
            vstudentName = studentName;
            vchemistryGrade = mChemistryGrade;
            vcalculusGrade = mCalculusGrade;
            vcomputerScienceGrade = mComputerScienceGrade;
            vbiologyGrade= mBiologyGrade;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
    // Get or set the grade for the Chemistry course
    public int getChemistryGrade() {
        return mChemistryGrade;
    }
    public void setChemistryGrade(int grade) {
        mChemistryGrade = grade;
    }
    // Get or set the grade for the Calculus course
    public int getCalculusGrade() {
        return mCalculusGrade;
    }
    public void setCalculusGrade(int grade) {
        mCalculusGrade = grade;
    }

    // Get or set the grade for the Computer Science course
    public int getComputerScienceGrade() {
        return mComputerScienceGrade;
    }
    public void setComputerScienceGrade(int grade) {
        mComputerScienceGrade = grade;
    }

    // Get or set the grade for the biology course
    public int getBiologyGrade() {
        return mBiologyGrade;
    }
    public void setBiologyGrade(int grade) {
        mBiologyGrade = grade;
    }

}
