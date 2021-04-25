public abstract class GeometricFigure {
    int height;
    int width;
    String figure;

    public GeometricFigure(int h,int w, String f){

        this.height=h;
        this.width=w;
        this.figure=f;

    }
    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getFigure() {
        return figure;
    }
    public abstract  double figureArea(int h, int w);
}
