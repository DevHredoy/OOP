package hredoy.com.overloading;

import org.w3c.dom.ls.LSOutput;

public class TestOverload {

    public static void main(String[] args) {
        OverloadingCalculator oCalculator=new OverloadingCalculator();
        System.out.println(oCalculator.doAddition(4,5));
        System.out.println(oCalculator.doAddition(4,12,9));
        System.out.println(oCalculator.doAddition(3,5f));
        oCalculator.displayAddition(3,5);
        oCalculator.displayAddition(0.2f,22,3,5);


    }

}
