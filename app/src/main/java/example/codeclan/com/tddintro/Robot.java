package example.codeclan.com.tddintro;

public class Robot {
  private String Robot;
  private colour;
  private double battery;
  private String drink;

  public Robot(String name, String colour) {
    this.name = name;
    this.colour = colour;
    this.battery = 100.0;
  }

  public String getName() {
    return this.name;
  }

  public String getColour() {
    return this.colour;
  }

  public double checkBattery() {
    return this.battery;
  }

  public String makeDrink() {
    this.battery -= 10.0;
    return "I am making" + drink;
  }

  public String washDishes() {
    this.battery -= 30.0;
    return "I am washing the dishes";
  }

  public String doDusting() {
    this.battery -= 20.00;
    return "I am dusting";
  }

  public void rechargeBattery() {
    this.battery = 100.0;
  }
}
