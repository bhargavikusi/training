import java.util.Scanner;
class print_stars
{
public static void print_multiple_star(int i)
{
int k=1;
for(;k<=i;k=k+1)
System.out.print("*");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int j=sc.nextInt(0);
print_multiple_star(j);
System.out.println("");
}
}