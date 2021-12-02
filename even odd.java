import java.util.*;
class evenodd
{                         
public static void main(String args[])
{                      //main class     
int n;
System.out.println("Enter the number n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();        //accepting the number
if(n%2==0)             //checking for even number
System.out.println("It is an even number");
else
System.out.println("It is an odd number");
}
}
