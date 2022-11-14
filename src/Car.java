public class Car {
    private int id;
    private int numberOfAuto;

    public Car(int id, int numberOfAuto) {
        this.id = id;
        this.numberOfAuto = numberOfAuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfAuto() {
        return numberOfAuto;
    }

    public void setNumberOfAuto(int numberOfAuto) {
        this.numberOfAuto = numberOfAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberOfAuto=" + numberOfAuto +
                '}';
    }
}
