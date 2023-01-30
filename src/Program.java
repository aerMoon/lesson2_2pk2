import java.util.Date;

public class Program {
    public static void main(String args[]) {
        Turtle turtle = new Turtle("ЧереПавел", new Date(2023, 1, 1), Env.GROUND, Food.GRASS);

        System.out.println(turtle.getName());
        System.out.println(turtle.getDateB());
    }
}
