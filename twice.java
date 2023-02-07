import java.io.*;
import java.util.*;
public class twice
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=0;
for(int i=1;i<=a;i++)
{
int j=i*i;
sum=sum+j;
System.out.println(sum);
}
}
}
