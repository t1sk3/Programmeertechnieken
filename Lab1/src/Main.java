public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle(230, 90, "blue");
        c.makeVisible();

        Square s = new Square(310, 120, "red");
        s.makeVisible();

        Triangle t = new Triangle(210, 140, "green");
        t.makeVisible();

        Person p = new Person(280, 190, "black");
        p.makeVisible();
    }
}
