import java.util.Scanner;

import packagess.Shivang;

public class Lec1 {

    // public static class Dog {
    //     String breed;
    //     int age;
    //     String color;

    //     public void setBreed(String breed){
    //         this.breed = breed;
    //         System.out.println("Breed name is : " + breed);
    //     }

    //     public void setAge(int age){
    //      this.age = age;
    //      System.out.println("Age of the is " + age);
    //     }

    // public void setColor(String color){
    //     this.color = color;
    //     System.out.println("color of the bredd" + color);
    // }


    public static class Student{
      String name ;
      int age;

      public void setName(String name){
        this.name = name;
        System.out.println("Name is : " + name);
      }

      public void setAge(int age){
        this.age = age;
        System.out.println("Age is :" + age);
      }
    }

    public static class Calculator{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        public void Sum(){
            int sum = a+b;
            System.out.println("sum of number is : " + sum);
        }
        public void Sub(){
            int sum = a-b;
            System.out.println("Subtraction of number is : " + sum);
        }
        public void Multiplication(){
            int sum = a*b;
            System.out.println("Multiplication of number is : " + sum);
        }
        public void Divide(){
            int sum = a/b;
            System.out.println("Divide of Two number is : " + sum);
        }
    }

    
    public static void main(String[] args) {
        // Dog obj1 = new Dog();
        // obj1.setBreed("Shitshu");
        // obj1.setAge(12);
        // obj1.setColor("black and white");
        // Student obj1 = new Student();
        // obj1.setName("Shivang"); 
        // obj1.setAge(21);
        Calculator obj1 = new Calculator();
        obj1.Sum();

    }
}
