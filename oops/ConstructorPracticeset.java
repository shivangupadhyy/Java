package oops;

import oops.cylinder.rectangle;

class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*3.14* radius * radius + 2*3.14*radius*height;
    }

    public class rectangle{
        private int lenght;
        private int breadth;

        public rectangle(){
            this.lenght = 4;
            this.breadth = 5;
        }
        public rectangle(int lenght, int breadth){
            this.lenght = lenght;
            this.breadth = breadth;
        }

        public int getLength(){
            return lenght;
        }

        public int getBreadth(){
            return breadth;
        }
    }
}

public class ConstructorPracticeset {
    public static void main(String[] args) {

        // problem 1
//         cylinder MyCylinder = new cylinder();
//         MyCylinder.setHeight(12);
//         int h = MyCylinder.getHeight();
//         System.out.println(h);

//         MyCylinder.setRadius(9);
//         int r = MyCylinder.getRadius();
//         System.out.println(r);
// //prblem no 2
//         System.out.println(MyCylinder.surfaceArea());

//         //problem 3

        cylinder mCylinder = new cylinder(9, 12);
        System.out.println(mCylinder.getHeight());
        System.out.println(mCylinder.getRadius());

        System.out.println(mCylinder.surfaceArea());

        //prblem 4
        cylinder.rectangle r = mCylinder.new rectangle(10, 12);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());






    }
}
