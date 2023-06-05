import java.util.Scanner;
class if_example{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num1;
num1=sc.nextInt();
int num2;
num2=sc.nextInt();
int max;
if(num1>num2){
System.out.println(num1+">"+num2);
}
else if(num1<num2)
{
System.out.println(num1+"<"+num2);
}
}
}




