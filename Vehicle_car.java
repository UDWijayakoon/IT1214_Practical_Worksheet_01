class Vehicle {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String model;

    @Override
    void display() {
        super.display();
        System.out.println("Model: " + model);
    }
}