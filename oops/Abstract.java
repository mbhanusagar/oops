package oops;

import java.util.Scanner;

class Abstract{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        B bb=new B();
        bb.add(a,b);

    }
}