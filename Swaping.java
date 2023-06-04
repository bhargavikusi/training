import java.util.Scanner;
class Swaping{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
int temp;
temp=num1;
num1=num2;
num2=temp;
System.out.print(num1+"\n"+num2);
}
}