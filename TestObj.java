public class TestObj
{
public static void main(String a[])
{

SeperateClass sep = new SeperateClass();
System.out.println("add:"+sep.add(10, 5));
}
}

class SeperateClass
{

int add(int a, int b)
{
System.out.println("sub:"+sub(10, 5));
return a+b;
}

int sub(int a, int b)
{
System.out.println("mul:"+mul(10, 5));
return a-b;
}

int mul(int a, int b)
{
System.out.println("div:"+div(10, 5));
return a*b;
}

int div(int a, int b)
{
return a/b;
}


}