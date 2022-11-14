public class InformationAboutCar {
    private int dateOfBirth;
    private String model;
    private String colour;
    private int price;

    public InformationAboutCar(int dateOfBirth, String model, String colour, int price) {
        this.dateOfBirth = dateOfBirth;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InformationAboutCar{" +
                "dateOfBirth=" + dateOfBirth +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
