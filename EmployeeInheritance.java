import java.util.*;
class Employee{
    String name,address,phone;
    int age,salary;
    void printSalary(){
        System.out.println("Salary : "+salary);
    }
}class Manager extends Employee{
    String spec;
    void insert(String n,String ad,int yrs,String phn,int s,String sp){
        name=n;
        address=ad;
        age=yrs;
        phone=phn;
        spec=sp;
        salary=s;
    }void display(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nAddress : "+address+"\nPhone Number : "+phone+"\nSpecialisation : "+spec);
        super.printSalary();
    }
}class Officer extends Employee{
    String dept;
    void insert(String n,String ad,int yrs,String phn,int s,String dp){
        name=n;
        address=ad;
        age=yrs;
        phone=phn;
        dept=dp;
        salary=s;
    }void display(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nAddress : "+address+"\nPhone Number : "+phone+"\nDepartment : "+dept);
        super.printSalary();
    }
}public class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n,ad,dp,sp,phn;
        int yrs,sal;
        n=sc.nextLine();
        ad=sc.nextLine();
        dp=sc.nextLine();
        sp=sc.nextLine();
        phn=sc.nextLine();
        yrs=sc.nextInt();
        sal=sc.nextInt();
        Manager m=new Manager();
        m.insert(n, ad, yrs, phn, sal, sp);
        m.display();
        Officer o=new Officer();
        o.insert(n, ad, yrs, phn, sal, dp);
        o.display();
    }
}
