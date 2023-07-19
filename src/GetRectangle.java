public class GetRectangle {
    private int height;
    private int width;

    GetRectangle(){
        height = 0;
        width = 0;
    }

    public void getHeight(int height){
        this.height = height;
    }

    public void getWidth(int width){
        this.width = width;
    }

    public int getArea(){
        return height*width;
    }


}
