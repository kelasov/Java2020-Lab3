package circle;

public class Circle {
    private int cenX;
    private int cenY;
    private int rad;

    Circle(int cenX, int cenY, int rad){
        cenX=this.cenX;
        cenY=this.cenY;
        rad=this.rad;
    }

    public int getCenX(){
        return cenX;
    }
    public void setCenX(int cenX){
        this.cenX=cenX;
    }
    public int getCenY(){
        return cenY;
    }
    public void setCenY(int cenY){
        this.cenY=cenY;
    }
    public int getRad(){
        return rad;
    }
    public void setRad(int rad){
        this.rad=rad;
    }
    //111
    @Override
    public String toString() {
        return "Circle{" +
                "cenX=" + cenX +
                ", cenY=" + cenY +
                ", rad=" + rad +
                '}';
    }
}
