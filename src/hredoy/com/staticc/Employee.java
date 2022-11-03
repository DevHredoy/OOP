package hredoy.com.staticc;

public class Employee {
    int id;
    String name;
  static  String companyName="IT company";
static {
    System.out.println("static block");
}
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;

    }
void displayInfo()
{
    System.out.println("id :"+id+"name: "+name+" companyname: "+companyName);

}

    public static void main(String[] args) {
        System.out.println("abc");
    }

}
