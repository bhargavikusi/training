import java.util.Scanner;
class Array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int sum=0;
int a[]=new int[x];
int i=0,temp=0,j=0;
for(i=0;i<x;i++){
a[i]=sc.nextInt();
}
for(i=0;i<x;i++){
for(j=i+1;j<x;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}System.out.println(a[0]+" "+a[x-1]);
for(int y:a){
sum+=y;
}
float avg=(float)sum/x;
System.out.println(sum);
System.out.println(avg);
}
}


 