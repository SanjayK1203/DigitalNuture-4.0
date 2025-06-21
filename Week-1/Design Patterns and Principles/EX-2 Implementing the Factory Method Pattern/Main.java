public class Main {
    public static void main(String[] args) {

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.book();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.book();

        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.book();
    }
}