package hredoy.com.overloading;

public class OverloadingCalculator {




int doAddition(int a,int b)
{
    return a+b;

}
int doAddition(int a,int b,int c )
{


    return a+b+c;
}
float doAddition(float a,float b)
{

    return a+b;
}

void displayAddition(int a,int g)
{
    System.out.println(a+g);
}

void displayAddition(float a,float b,int c,int d)
{
    System.out.println("addition of a and b is"+(a+b));
    System.out.println("addition of c and d is "+(c+d));
}

}
