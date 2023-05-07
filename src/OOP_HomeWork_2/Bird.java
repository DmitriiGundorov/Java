package OOP_HomeWork_2;

public abstract class Bird extends Animal {

//    Птицы

    public Bird(Double height, Double weight, int eyeColor, String sound, Double flightAlt) {
        super(height, weight, eyeColor, sound);
        this.flightAlt = flightAlt;
    }

    public Double getFlightAlt() {
        return flightAlt;
    }

    public void setFlightAlt(Double flightAlt) {
        this.flightAlt = flightAlt;
    }

    private Double flightAlt;

    public void doFlight() {
        if (flightAlt > 0)
            System.out.println("Я летаю на высоте " + flightAlt + " м");
        else
            System.out.println("Я не летаю");
    }
}