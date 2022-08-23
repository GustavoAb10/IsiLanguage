import java.util.Scanner;
public class MainClass { 
	public static void main(String[] args){ 
		Scanner _key = new Scanner(System.in);
double a;
double b;
int  c;
String t1;
a = 2.3;
b = 5;
a= _key.nextDouble();
b= _key.nextDouble();
c= _key.nextInt();
System.out.println(a);
System.out.println(b);
if (a>b) {System.out.println(a);}else {System.out.println(b);}

while (a<b) {a= _key.nextDouble();System.out.println(b);}

c = 1;
switch (c) {
	case 1: 
		System.out.println(b);
		break;
	case 2: 
		System.out.println(c);
		break;
}

	}}