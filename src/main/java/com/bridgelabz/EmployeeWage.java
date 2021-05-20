package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        final int IS_PRESENT = 1;
        //int Grand_Total=0;
        int PER_HR = 20;
        int FULL_DAY = 8;
       // int PART_TIME_HRs = 8;
        //int TOTAK_EMP_HR=0;
        int MAX_WRK_HRS=100;
        int NUM_OF_WRK_HR=0;
        int NUM_OF_WRK_DAYS=0;
        int MAX_WRK_DAYS=20;
        int one_wages=0;
        //int oneday_wages=0;
        int total=0;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
        //int Grand_Total = 0;
//        for (int i = 1; i <= 100; i++) {
//            //int empCheck= (int) (Math.floor(Math.random()*10)%2);
//
//            Grand_Total = ((i * PER_HR ));
        while (  NUM_OF_WRK_HR <= MAX_WRK_HRS &&  NUM_OF_WRK_DAYS <=MAX_WRK_DAYS )
        {
            if (empCheck == IS_PRESENT)
            {
                one_wages = PER_HR * FULL_DAY;
                NUM_OF_WRK_HR++;
            }
            else System.out.println("emp absnt");


            NUM_OF_WRK_DAYS++;

            System.out.println("Total_salary   :" + (total+=one_wages));
        }

    }
}
