import java.util.Scanner;
class PolymorphismExample{
void print(){
System.out.println("Welcome "+n);
}
}
class Test{
public static void main(String args[]){
PolymorphismExample1 ob1=new PlolymorphismExample1();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name:");
String s=sc.next();
ob1.print(s);
}
}