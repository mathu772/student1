package school.management.system;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.String.*;

public class Student {

    private String name;
    private String gender;
    private int id;
    private int coursefees;
    private int totalfees = 45000;
    private String course;
    private String courses="";
    private int payamount;
    private int balancefee;
    private int noofcourse;
    private Object getName;


    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("student name :");
        this.name = sc.nextLine();

        System.out.print("Reg no :");
        this.id = sc.nextInt();

        System.out.print("Gender :");
        this.gender = sc.next();

        System.out.print("\n");
        System.out.print("name :" + name + "\n");
        System.out.print("Reg no :" + id + "\n");
        System.out.print("Gender :" + gender + "\n");
        System.out.println("------******------\n");


    }

    public void enroll()
    {
        System.out.println("enter number of the course");
        Scanner sc = new Scanner(System.in);
        noofcourse= sc.nextInt();
        do {

            for(int i=0;i<noofcourse;i++)
            {
                String course = sc.next();
                courses = courses + course ;
                //System.out.println("enrolled in :" + course+" ");
                coursefees = coursefees + totalfees;
            }
            if(noofcourse==0)
            {
               System.out.println("you cant choose");
            }
           else
            {
                break;
            }
        } while (true);
        System.out.println("Enrolled Courses : " +courses+" ");
        String[] old = courses.split(" ");
        for (String a:old)
        {
            System.out.println(a);
        }
        System.out.println("course amount :"+coursefees);
        feepay();


    }
    public void feepay()
    {

        System.out.print("Enter Pay Amount : ");
        Scanner sc = new Scanner(System.in);
        payamount = sc.nextInt();
        System.out.println();
        balancefee= coursefees-payamount;
        System.out.println("You have paid : " + balancefee + " rupees");

    }
    public static void main(String[] args)
    {
        //Student s1 = new Student();
      // List<Student> students=new ArrayList<>();
        System.out.print("Enter Num of students to be added : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] student = new Student[n];

        for (int i = 0; i < n; i++)
        {
            student[i] = new Student();
            student[i].enroll();
            System.out.println(student[i].toString());
            student[i].show();


        }


    }
    private void show() {
        if(balancefee == 0)
        {
            System.out.println("YOUR STATUS :No Pending");
        }
        else
        {
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("YOUR STATUS :Pending !!!");
        }
    }

    public String toString()
    {

       // return " \n *****Student Details***** : \n \n Name : " +" "+name +"   "+ "Reg no : "+id+" Gender :"+gender+" "+" No.Course Enrolled : "
              //  +noofcourse+ " "+  "Total Fees : "+ coursefees+" "+"Pay Amount :"+payamount+ " "+" PendingAmount :"+balancefee;

          System.out.println("---------------------------------------------------------------------------------------------------------------");
          System.out.println( "NAME "+"     "+"REG NO "+"    "+ "GENDER"+"    "+" NO.OF COURSE ENROLLED "+"    "+"Total Fees "+"    "+"PAY AMOUNT"+"   "+"PENDING AMOUNT");
          System.out.println();
          System.out.println("----------------------------------------------------------------------------------------------------------------");
          return name+"      "+id+"     "+gender+"            "+noofcourse+"                      "+coursefees+"        "+payamount+"        "+balancefee;

    }
    



}
