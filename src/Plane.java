public class Plane implements Vehicle {

    private int num_of_wheels;
    private int num_of_passengers;
    private boolean has_gas;

    @Override
    public int set_num_of_wheels() {
        return num_of_wheels = 8;
    }

    @Override
    public int set_num_of_passengers() {
        return num_of_passengers = 56;
    }

    @Override
    public boolean has_gas() {
        return has_gas = false;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "num_of_wheels=" + num_of_wheels +
                ", num_of_passengers=" + num_of_passengers +
                ", has_gas=" + has_gas +
                '}';
    }
}
