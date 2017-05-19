package JavaII.Shapes;

class Square extends Quadralateral {

    public Square(double side){
        super(side, side);
    }

    void setLength(double length){
        this.length = length;
    }

    void setWidth(double width){
        this.width = width;
    }

}
