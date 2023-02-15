package SummarySession;

public class Box {
    private double width;
    private double height;
    private double depth;


    public void print(){
        System.out.println("w" + width);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    public Box(double width, double height, double depth){

        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
