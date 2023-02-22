import java .util.Scanner;
class eligibility
{
public static void main(String args[ ])
{
int age;
Scanner Sc=new Scanner(System .in);
System.out.println(" please enter  the age");
age=Sc.nextInt();
System.out.println("age is ="  +age);
if(age>=18)
System.out.println(" you are eligible to vote :)");
else
System.out.println(" you are not eligible to vote!!!!");
}
}
