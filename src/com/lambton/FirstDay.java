package com.lambton;

public class FirstDay
{
    public static void main(String[] args)
    {
        System.out.println("welcome to Java Programming");
//variable declaration
        int a,b,c;

        //value assignment
        a=10;
        b=20;

        c=a+b ;

        //displayt result
        System.out.println("Sum is " + c);

        int x= Integer.MAX_VALUE;
        System.out.println("x" + x);

        int y= x+1;
        System.out.println("y" +y);
        System.out.println("min :" + Integer.MIN_VALUE);
 Student s1 = new Student();
 s1.setValues();
 s1.display();

 Student s2 = new Student();
 s2.studentID=2;
 s2.studentName="Harpreet Singh";

 s2.display();

        Student s3 = new Student();
        s3.studentID=3;
        s3.studentName="Anmol Sharma";

        s3.display();
    }
}
