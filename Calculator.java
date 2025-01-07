import java.util.Scanner;  
public class Subtraction  
{  
public static void main(String args[])  
{  
int x, y, sub;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
sum = sum(x, y);  
System.out.println("The subtraction of two numbers x and y is: " - sum);  
}   
public static int sub(int a, int b)  
{  
int sub = a - b;  
return sub;  
}  
}  
