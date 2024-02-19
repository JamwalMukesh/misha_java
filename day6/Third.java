class Point
{
    int x, y;
}
class Third {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.println(" Point p1: " + p1.x + "," + p1.y);
        System.out.println(" Point p2: " + p2.x + "," + p2.y);

        System.out.println(" Point: " + new Point().x);
    }
}
