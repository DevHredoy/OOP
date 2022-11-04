package hredoy.com.staticc;

public class StaticBlock {

    static int x=m1();

            static{

                System.out.println("from static block");

            }



            static int m1()
            {
                System.out.println("from  static method");
                return 10;
            }

    public static void main(String[] args) {
        System.out.println("from main method ");
                System.out.println("the value of x is :"+x);

    }

}
