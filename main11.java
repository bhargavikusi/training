import java.util.ArrayList;
class main11{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("Cat");
animals.add("Dog");
animals.add("Cow");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp:animals){
System.out.print(",");
System.out.print(temp);
}
}
}
