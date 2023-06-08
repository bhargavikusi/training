public class Emp2 {  
int id;  
String name;  
Address address;  
  
public Emp2(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india");  
Address address2=new Address("gno","UP","india");  
  
Emp2 e=new Emp2(111,"varun",address1);  
Emp2 e2=new Emp2(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  