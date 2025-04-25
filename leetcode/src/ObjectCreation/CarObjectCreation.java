package ObjectCreation;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CarObjectCreation {

    public static void main(String args[]) {
        try {
            Car c = new Car("BMW", 2023, "Black");
            System.out.println("Car Name: " + c.getName());

//            Class<Car> carClass = (Class<Car>) Class.forName("Car");
            Car c1 =(Car) Class.forName("ObjectCreation.Car").newInstance();
            Car c2 = (Car) Car.class.getDeclaredConstructor().newInstance();
            System.out.println("Car Name: " + c1.getName());
            System.out.println("Car Name: " + c2.getName());
            Car c3 = (Car) c.clone();
            System.out.println("Car Name: " + c3.getName());
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/ObjectCreation/car.txt"));
            oos.writeObject(c);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ObjectCreation/car.txt"));
            Car c4 = (Car) ois.readObject();

            System.out.println("Car Name: " + c4.getName());
            Constructor<Car> constructor = Car.class.getConstructor(String.class, long.class, String.class);
            Car c5 = constructor.newInstance("Audi", 2022, "Red");
            System.out.println("Car Name: " + c5.getName());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

    }
}
