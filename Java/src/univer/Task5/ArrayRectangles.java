package univer.Task5;

public class ArrayRectangles {

    private Rectangle[] rectangle_array;
    private int lastIndex = 0;

    public ArrayRectangles(int n){
        rectangle_array = new Rectangle[n];
        lastIndex = 0;
    }

    public ArrayRectangles(Rectangle... rectangles){
        rectangle_array = rectangles;
        lastIndex = rectangle_array.length;
    }

    public boolean addRectangle(Rectangle rectangle){
        if (lastIndex >= rectangle_array.length)
            return false;
        rectangle_array[lastIndex++] = rectangle;
        return  true;
    }

    public int numberMaxArea(){
        double maxArea = rectangle_array[0].getArea();
        int maxIndex = 0;
        for (int i = 0; i < lastIndex; i++){
            if(rectangle_array[i].getArea() > maxArea) {
                maxArea = rectangle_array[i].getArea();
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int numberMinPerimeter(){
        double minPerim = rectangle_array[0].getPerimeter();
        int minIndex = 0;
        for (int i = 0; i < lastIndex; i++) {
            if (minPerim > rectangle_array[i].getPerimeter()){
                minPerim = rectangle_array[i].getPerimeter();
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int numberSquare(){
        int number = 0;
        for (int i = 0; i < lastIndex; i++){
            if (rectangle_array[i].isSquare())
                number++;
        }
        return number;
    }
}
