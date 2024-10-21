package MoreExamples;

import java.util.Arrays;
import java.util.Objects;

class Car{
    int price;
    String model;
    int year;

    public  Car(int price, int year, String model){
        this.price =price;
        this.model = model;
        this.year =year;
    }
    @Override
    public String toString() {
        return "Car1{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, model, year);
    }
}
public class ObjectClassExample {
    public static void main(String[] args){
        Car catObj = new Car(20,2020,"abc");
        Car catObj2 = new Car(20,2020,"abc2");
        boolean b = catObj.equals(catObj2);
        System.out.println("Object = " + catObj);
        System.out.println("Object Equal = " + b);
    }

}
