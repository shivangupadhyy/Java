package collection_framework;

public class GC {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "Iphone 16");
    }
}

class Phone{
    String brand;

    String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String toString(){
        return brand + " " + model;
    }

}
