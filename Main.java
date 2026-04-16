import java.util.Scanner;
import java.util.ArrayList;


// Name of the program file should match the class name
public class Main {
    // All class name should hava their first letter capital
    public static void main(String[] args){
        // All method name should be in lower case
        // In Java, String[] args is a parameter in the main method that allows a program to receive command-line arguments from the user at runtime
        // While args is the standard convention, you can technically name it anything (e.g., String[] myInput).


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Inputs");
        int age = sc.nextInt();
        String name = sc.next();

        // int age = 24;
        System.out.println(name + age);

        // If else is same as C++

        // Loops are same as C++ just java don't have auto datatype feature just use (int x: arr){}
        
        int[] arr = {2,4,6,8};
        // int[] arr = new int[5];
        // It's size cannot be changes

        // Dynamic Array
        // ArrayList<Integer> list;

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}