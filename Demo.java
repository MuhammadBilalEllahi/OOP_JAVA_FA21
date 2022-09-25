public class Demo {
    public static void main (String args[]){

        Circle c1 = new Circle();
        Circle c2 = new Circle();


        c1.radius  = 5;
        c1.setRadius(7);

        System.out.println( c1.radius );
    }
}
