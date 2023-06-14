import java.util.ArrayList;
class main10{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
languages.add("java");
languages.add("c++");
languages.add("kotlin");
System.out.println("ArrayList:"+languages);
languages.set(2,"javaScript");
System.out.println("Modified ArrayList:"+languages);
}
}
