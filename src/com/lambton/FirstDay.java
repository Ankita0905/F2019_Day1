package com.lambton;

public class FirstDay
{
    public static void main(String[] args)
    {
        System.out.println("Ankita Jain");
        //Variable declaration
        int a, b, c;
        //value Assignment
        a=10;
        b=20;

        c = a + b;
                 //Submit result
        System.out.println("the sum is " +c);
        int x=Integer.MAX_VALUE;
        System.out.println("x :" +x);

        int y= x + 1;
        System.out.println("y:" +y);
        System.out.println("min:" +Integer.MIN_VALUE);

        Student s1=new Student();
        s1.setValues();
        s1.display();

        Student s2=new Student();
        s2.StudentID=2;
        s2.StudentName="Kamal";
        s2.display();

        Student s3=new Student();
        s3.StudentID=3;
        s3.StudentName="Karan";
        s3.display();


    }
}
