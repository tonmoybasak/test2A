public class VehicleFactoryDemo {

    public static void main(String args[]) {

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("car");
        Vehicle plane = vehicleFactory.getVehicle("plane");

        System.out.println(car.toString());
        System.out.println(plane.toString());

    }
}
