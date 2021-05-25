package com.bridgelabz;

import java.lang.*;

public class EmployeeWage<empHrs> {
    public static int empCheck;
    private static int empHrs = 0;
    public int PER_HR;
    public int FULL_DAY;
    public int PART_TIME_HRs;
    public static int one_wages = 0;
    //public static int total=0;
    private String company;
    public static int NUM_OF_WRK_HR;
    public static int NUM_OF_WRK_DAYS;
    public static int MAX_WRK_DAYS;
    public static final int IS_PRESENT = 1;
    public static int MAX_WRK_HRS = 100;
    public static int totalEmpHr = 0, totalDAYS = 0;

    public static int total = 0;


    public static int computeWgae(String company, int PER_HR, int NUM_OF_WRK_DAYS, int MAX_WRK_DAYS) {
        while (totalEmpHr <= MAX_WRK_DAYS && totalDAYS < NUM_OF_WRK_DAYS) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case 1:
                    one_wages = 8;
                    //empHrs=8;
                    break;
                case 2:
                    one_wages = 4;
                    // empHrs=4;
                    break;
                default:
                    System.out.println("emp absnt");
                    break;

            }
            total += one_wages * PER_HR;
            System.out.println("empHrs  :" + one_wages);
            totalDAYS++;
            System.out.println("Total Salary  of Company  :" +company + " " + total);

        }


        return total;
    }


//    public EmployeeWage( String company,int PER_HR, int NUM_OF_WRK_DAYS, int MAX_WRK_DAYS) {
//        this.PER_HR = PER_HR;
//        this.company = company;
//        this.NUM_OF_WRK_DAYS = NUM_OF_WRK_DAYS;
//        this.MAX_WRK_DAYS = MAX_WRK_DAYS;
//    }

    public static void main(String[] args) {
        computeWgae("Dmart",20,2,10);
        computeWgae("salman",10,4,15);



        }

    }

