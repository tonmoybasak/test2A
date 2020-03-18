class VehicleFactory {
    public Vehicle getVehicle(String type){
        if (type.equalsIgnoreCase("plane")){
            Plane plane = new Plane();
            plane.set_num_of_passengers();
            plane.set_num_of_wheels();
            plane.has_gas();
            return plane;
        }
        if (type.equalsIgnoreCase("car")){
            Car car = new Car();
            car.set_num_of_passengers();
            car.set_num_of_wheels();
            car.has_gas();
            return car;
        }
        return null;
    }
}
