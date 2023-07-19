public class AreaTester {
    public static void main(String[] args) {
        GetRectangle getRectangle = new GetRectangle();
        getRectangle.getHeight(4);
        getRectangle.getWidth(10);
        int ans = getRectangle.getArea();
        System.out.println(ans);
    }
}cd
