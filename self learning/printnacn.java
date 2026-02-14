import java.util.*;
class printnacn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur name:");
        String name = sc.nextLine();
        System.out.println("Enter ur age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ur college name:");
        String college = sc.nextLine();
        
        System.out.println("Student info");
        System.out.println("Name : "+ name + "Age " + age + "College name " + college);
    }
}