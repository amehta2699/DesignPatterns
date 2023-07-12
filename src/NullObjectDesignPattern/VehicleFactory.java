package src.NullObjectDesignPattern;

// NULL Object Pattern says that instead of returning NULL, return a null Object with 0 value
// return new NullVehicle(); -> earlier we were doing return null, but then it gives the null pointer exception,
// but now we are returning an object, so we won't get null pointer exception
public class VehicleFactory {

    static Vehicle getVehicleObject(String typeofVehicle) {
        if("Car".equals(typeofVehicle)){
            return new Car();
        }
        return new NullVehicle();
    }
}
