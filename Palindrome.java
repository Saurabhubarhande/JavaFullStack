import java.util.Scanner;

public class Palindrome{

public static void main (String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("enter the number");
int num=sc.nextInt();
int org_num=num;


//reversing the number
int rev=0;
while (num!=0)
{
rev=rev*10+num%10;
num=num/10;
}
if(org_num==rev ){
System.out.println(org_num+"is a Palindrome num");
}
else{
System.out.println(org_num+"is not a Palindrome num");
}

}
}