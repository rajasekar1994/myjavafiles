import java.util.Scanner;
class Armstrong{
public static void main(String[] args)
{
int a,n,l;
Scanner input=new Scanner(System.in);
a=input.nextInt();
int s=0;
while(n!=0)
{
l=a%10;
s=s+(l*l*l);
n=a/10;
}
if(a==s)
System.out.println("it is an armstrong number");
else
System.out.println("it is nota an armstrong nukmnber");
}
}