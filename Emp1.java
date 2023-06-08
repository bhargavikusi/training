public class Emp1 {  
int id;  
String name;  
Address address;  
  public Emp1(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String args[]) {  
Address address1=new Address("plmr","UP","india");  
Address address2=new Address("chittoor","UP","india");  
  
Emp1 e=new Emp1(111,"varun",address1);  
Emp1 e2=new Emp1(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
}  