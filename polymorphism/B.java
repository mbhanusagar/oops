package polymorphism;

import java.util.Scanner;

public class B {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        A aa=new A();
        aa.ab(a,b);
                aa.ab(a,b,c);
    }
}
