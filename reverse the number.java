import java.util.*;

import java.lang.*;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

class Codechef

{
    
int count(int n)
    
{
        
int b;
        
for(int i=0;;i++)
        
{
            
b=n%10;
            
if(b!=0)
            
return i;
            
n=n/10;
        
}
    
}
    
int reverse(int n)
    
{
        
int i,s=0;
        
for (i=0;;i++)
        
{
            
s=s*10+(n%10);
            
n=n/10;
            
if(n==0)
            
return s;
        
}
    
}
public static void main (String[] args) throws java.lang.Exception

{
	
InputStreamReader read = new InputStreamReader(System.in);

BufferedReader in = new BufferedReader(read);
	
int t= Integer.parseInt(in.readLine());
	
Codechef ob= new Codechef();
	
int i=0,n,b,s;
	
for(i=0;i<t;i++)
	
{
	    
n=0;
	    
n=Integer.parseInt(in.readLine());
	    
b=(int)(Math.pow(10,(ob.count(n))));
	    
System.out.println(ob.reverse(n/b));
	
}
		


}
}
