package kata1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda accord" , 12000, 8.1);
        System.out.println("El coche " + car.getCarName() + " con " + car.getKm() + " ha consumido un total de " +
                car.totalUsage() + " litros de gasolina");
        Car otherCar = new Car("Toyota supra" , 222000, 6.7);
        System.out.println("El coche " + otherCar.getCarName() + " con " + otherCar.getKm() + " ha consumido un total de " +
                otherCar.totalUsage() + " litros de gasolina");

        Car anotherCar = new Car("Nissan micra" , 214865, 9.3);
        System.out.println("El coche " + anotherCar.getCarName() + " con " + anotherCar.getKm() + " ha consumido un total de " +
                anotherCar.totalUsage() + " litros de gasolina");
    }
}