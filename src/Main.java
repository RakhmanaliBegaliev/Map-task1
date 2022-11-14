import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,InformationAboutCar> cars=new HashMap<>();
        cars.put(new Car(5,5625),new InformationAboutCar(2015,"Ferrari","blue",5000));
        cars.put(new Car(4,8594),new InformationAboutCar(2019,"Mazda","green",7000));
        cars.put(new Car(3,1656),new InformationAboutCar(2022,"Toyota","yellow",9000));
        for(Map.Entry a : cars.entrySet()){
            System.out.println(a.getKey()+" " + a.getValue());
        }
    }
}