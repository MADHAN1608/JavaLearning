public class TestArith
{
public static void main(String []a)
{
System.out.println("Hello world!!");

AnotherClass AC = new AnotherClass();

System.out.println("Add:"+AC.add(10, 5));
System.out.println("sub:"+AC.sub(10, 5));
System.out.println("mul:"+AC.mul(10, 5));
System.out.println("div:"+AC.div(10, 5));

}
}

class AnotherClass
{
int add(int a, int b)
{
return a+b;
}

int sub(int a, int b)
{
return a-b;
}

int mul(int a, int b)
{
return a*b;
}

int div(int a, int b)
{
return a/b;
}


}
