import java.util.Scanner;
public class MainClass { 
	public static void main(String[] args){ 
		Scanner _key = new Scanner(System.in);
double a;
double b;
String t1;
a = 2.3;
b = 5;
System.out.println(a);
System.out.println(b);
if (a>b) {System.out.println(a);}else {System.out.println(b);}
while (a<b) {a= _key.nextDouble();System.out.println(b);}
	}}