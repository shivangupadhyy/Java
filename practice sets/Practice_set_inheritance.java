public class Practice_set_inheritance {

    static class circle{

        circle(int r){
            System.out.println("I am circle paramerterized constructor");
            this.radius = r;
        }
        public int radius;
        public double area(){
            return Math.PI*this.radius*this.radius;
        }
    }

    static class Cylinder extends circle{

        Cylinder(int r, int h){
            super(r);
            System.out.println(" i am cylinder parameterized constructor");
            this.height = h;
        }
        public int height;
        public double volume(){
            return Math.PI*this.radius*this.radius*this.height;
        }
    }
    public static void main(String[] args) {

        Cylinder obj = new Cylinder(12, 4);
        // circle obj1 = new circle(12);
        
    }
}
