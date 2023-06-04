import java.io.util.Scanner;
public class VowelsCount{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=sc.next().charAt(0);
int count=0;
for(int i=0;i<=str.length()-1;i++){
if(str.charAt(i)=='a')||(str.charAt(i)=='A')
(str.charAt(i)=='e')||(str.charAt(i)=='E')
(str.charAt(i)=='i')||(Str.charAt(i)=='I')
(str.charAt(i)=='o')||(str.charAt(i)=='O')
(str.charAt(i)=='u')||(str.charAt(i)=='U')
{
count++;
}
}
System.out.println(count);
}
}
