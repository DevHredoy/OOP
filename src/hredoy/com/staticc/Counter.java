package hredoy.com.staticc;
// demo of static variable
//demo of how a static instance variable is incremented
public class Counter {
    static int count;

    Counter()
    {
        count++;


    }


    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        System.out.println(Counter.count);

    }
}
