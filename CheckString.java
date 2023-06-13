import java.io.*;
import java.util.*;
class CheckString{
static boolean isNumber(String s){
for(int i=0;i<s.length();i++){
if(Character.isDigit(s.charAt(i))==false)
{return false;}
}
return true;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
//Function returns 1 if all elements are in range '0-9'
if(isNumber(str))
System.out.println("Integer");
else
System.out.println("String");
}
}
 