import java.util.ArrayList;
class main9{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("Cat");
animals.add("Dog");
animals.add("Cow");
System.out.println("ArrayList:"+animals);
String str=animals.get(1);
System.out.println("Element at index1:"+str);
str=animals.get(2);
System.out.println("Element at index2:"+str);
}
}
