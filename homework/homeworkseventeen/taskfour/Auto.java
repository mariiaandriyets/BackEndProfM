package com.proftelran.homework.homeworkseventeen.taskfour;

public class Auto {
    private int number;
    private String color;
    private String model;
    private int mileage;
    private int price;

    public Auto(int number, String color, String model, int mileage, int price) {
        this.number = number;
        this.color = color;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
