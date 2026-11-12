class Area {
public static void main(String []a) {

Square sq = new Square(20);
Rectangle rt = new Rectangle(10, 30);
Circle cr = new Circle(3);

sq.area();
rt.area();
cr.area();

}
}


class Square implements AreaFormat{
int len;

public void area(){
System.out.println(len*len);
}

public Square(int length){
len = length;
}
}

class Rectangle implements AreaFormat{
int len;
int breath;

public void area(){
System.out.println(len*breath);
}

public Rectangle(int length, int bth){
len = length;
breath = bth;
}

}

class Circle implements AreaFormat {
final double pi = 3.14;
int radius;
public void area(){
System.out.println(pi*radius*radius);
}

public Circle(int r){
radius = r;
}

}

interface AreaFormat {
public void area();
}