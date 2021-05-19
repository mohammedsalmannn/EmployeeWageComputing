package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args)
    {
        final int IS_PRESENT= 1 ;
         int PER_HR=20;
        int FULL_DAY=8;
         int PART_TIME_HRs=8;
        //int oneday_wages=0;
        int empCheck= (int) (Math.floor(Math.random()*10)%2);
            if(empCheck==IS_PRESENT)
            {
                int part= (PER_HR*PART_TIME_HRs);
                int Day= (PER_HR * FULL_DAY );
                int total=(part+Day);
                int Gross_Total=(total*20);
                System.out.println("PartTime Wages " + part);
                System.out.println("TotalWages "+total);
                System.out.println(Gross_Total);
            }
            else{
                int oneday_wages=(   PER_HR * FULL_DAY   );
                   System.out.println("Oneday Wages is : " + oneday_wages);
            }


    }

}
