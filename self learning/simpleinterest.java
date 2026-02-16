import java.util.*;
public class simpleinterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter time duration: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest : "+si);

        double totalamount = principal + si;
        System.out.println("Total amount : " +totalamount);
    }
}
