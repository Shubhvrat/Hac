/*
 * In this problem we are going to see about a Static intializer blocks , so
 * first static is keyword
 * means that the varialbe or the method available at the class level , you dont
 * need to create the
 * instance of the class to access it
 * Static initializer blocks are used for initializing static variables. They
 * are executed only once when the class is loaded into memory, and before any
 * static method is called or any static variable is accessed.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class static_block {

    // Write your code here
    
    public static int B;
    public static int H;
    public static boolean flag;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B == 0 || H == 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
