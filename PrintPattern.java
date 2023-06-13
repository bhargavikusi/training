import java.util.Scanner;
class PrintPattern{
public static void printLine(int start,int stop){
for(int i=start;i<=stop;i++){
System.out.print(i);
if(i<stop)System.out.print(",");
}
}
public static void printPattern(int n){
for(int i=n;i>=1;i--){
System.out.print("\n");
printLine(i);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printLine(0,0);System.out.print("\n");
printLine(1,2);System.out.print("\n");
printLine(3,4);System.out.print("\n");
printLine(5,6);System.out.print("\n");
}
} 