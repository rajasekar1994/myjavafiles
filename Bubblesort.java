import java.util.Scanner;
class BubbleSort
{
public static void main(String args[])
{
int a[]=new int[10];
int i;
Scanner s1=new Scanner(System.in);
System.out.println("enter the array length");
int n=s1.nextInt();
System.out.println("enter the array elements");
for(i=0;i<n;i++)
{
a[i]=s1.nextInt();
}
int temp,j;
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
{
if (a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println("The array elements are"+a[i]);
}
}
}