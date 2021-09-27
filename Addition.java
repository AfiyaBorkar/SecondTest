import java.util.*;  
class Addition 
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.println("**** Addition *****");  
System.out.println("Enter the number 1: ");
int a= sc.nextInt();              //reads string 
System.out.println("Enter the number 2: ");
int b= sc.nextInt(); 
int c = a+b;
System.out.print("Addition: "+c);   
System.out.println("*** END ***")  
}
