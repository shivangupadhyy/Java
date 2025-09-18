public class Lec1 {

    public static class Dog {
        String breed;
        int age;
        String color;

        public void setBreed(String breed){
            this.breed = breed;
            System.out.println("Breed name is : " + breed);
        }

        public void setAge(int age){
         this.age = age;
         System.out.println("Age of the is " + age);
        }

    public void setColor(String color){
        this.color = color;
        System.out.println("color of the bredd" + color);
    }


    }
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        obj1.setBreed("Shitshu");
        obj1.setAge(12);
        obj1.setColor("black and white");

    }
}
