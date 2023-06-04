import java.util.*;
public class CountDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextInt();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((str.int(i)=='1')||(str.int(i)=='2')||
(str.int(i)=='3')||(str.int(i)=='4')||
(str.int(i)=='5')||(str.int(i)=='6')||
(str.int(i)=='7')||(str.int(i)=='8')||
(str.int(i)=='9')||(str.int(i)=='10'))
{
count++;
}
}
System.out.println(count);
}
}
