package sda.Prezentacja6;
// Cwiczenie 2
public class Rectangle {
    private int topSide;
    private int leftSide;
    private int width;
    private int height;



    public Rectangle(int topSide, int leftSide, int width, int height) {
        this.topSide = topSide;
        this.leftSide = leftSide;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int topSide, int leftSide) {
        this.topSide = topSide;
        this.leftSide = leftSide;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    public int rectangleField(){
        int result =width*height;
        System.out.println(result);
        return result;
    }
    public int rectangleCircumference(){
        int result2 = (width*2)+(height*2);
        System.out.println(result2);
        return result2;
    }

    public Rectangle kopiuj(){
        Rectangle rec3 = new Rectangle(0,0,this.height,this.width);
        return rec3;
    }


}

