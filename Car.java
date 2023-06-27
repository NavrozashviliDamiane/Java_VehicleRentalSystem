class Car extends Vehicle {
    private int numSeats;

    public Car(String brand, String model, int year, int numSeats) {
        super(brand, model, year);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }
}