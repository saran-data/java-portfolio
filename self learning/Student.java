import java.util.*;

class Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int roll=sc.nextInt();
        sc.nextLine();
        String sub = sc.nextLine();
        int marks=sc.nextInt();

        if(marks>=35){
            System.out.print("Name: " + name + ", Roll No: " + roll + ", Subject Code: " + sub + ", Marks: " + marks + ", Result: Pass");
        }
        else{
            System.out.print("Name: " + name + ", Roll No: " + roll + ", Subject Code: " + sub + ", Marks: " + marks + ", Result: Fail");
        }
    }
}