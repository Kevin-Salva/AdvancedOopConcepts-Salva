public class UseGeometric {
    public static void main(String[] args) {
        double area;
        int height;
        int width;
        String figureType;
        GeometricFigure[] figure = new GeometricFigure[4];
        Square f0 = new Square(6,6, "Square");
        Triangle f1 = new Triangle(6,6,"Triangle");
        Square f2 = new Square(15, 15, "Square");
        Triangle f3 = new Triangle(15,15,"Triangle");
        figure[0] = f0;
        figure[1] = f1;
        figure[2] = f2;
        figure[3] = f3;
        for (GeometricFigure geometricFigure : figure) {
            height = geometricFigure.getHeight();
            width = geometricFigure.getWidth();
            figureType = geometricFigure.getFigure();
            area = geometricFigure.figureArea(height, width);
            System.out.println("the " + figureType + " with height= " + height + " and width= " + width
                    + " has an area of " + area);
        }
    }
}
