package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args)
    {
        //final int IS_PRESENT= 1 ;
         int PER_HR=20;
        int FULL_DAY=8;
         int PART_TIME_HRs=8;
        //int oneday_wages=0;
        int empCheck= (int) (Math.floor(Math.random()*10)%2);
        switch (empCheck) {

            case 0 :
                int oneday_wages=(   PER_HR * FULL_DAY   );
                System.out.println("Oneday Wages is : " + oneday_wages);
                System.out.println("salman");
                break;
            case 1:
                int part= (PER_HR*PART_TIME_HRs);
                int Day= (PER_HR * FULL_DAY );
                int total=(part+Day);
                System.out.println("PartTime Wages " + part);
                System.out.println("TotalWages "+total);
                System.out.println("salman");
                break;
            default:
                System.out.println("mann");


        }

    }

}
