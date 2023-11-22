import com.workintech.polymorphism.Ford;
import com.workintech.polymorphism.Holden;
import com.workintech.polymorphism.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("************");
        com.workintech.polymorphism.Car car = new com.workintech.polymorphism.Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        com.workintech.polymorphism.Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        com.workintech.polymorphism.Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        com.workintech.polymorphism.Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}