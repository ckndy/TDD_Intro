package com.codeclan.example.tddintro;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RobotTest {

  Robot robot;

  @before
  public void before() {
    robot = new Robot("C3PO", "Gold");
  }

  @Test
  public void testRobotSetUp() {
    Robot robot = new Robot("C3P0", "Gold");
    assertEquals("C3P0", robot.getName());
    assertEquals("Gold", robot.getColour());
  }

  @Test
  public void testCheckBattery() {
    assertEquals(100.0, robot.checkBattery(), 0.01);
  }

  @Test
  public void testMakeDrink() {
    assertEquals("I am making coffee", robot.makeDrink("coffee"));
    assertEquals(90.00, robot.checkBattery(), 0.01);
  }

  @Test
  public void testWashDishes() {
    assertEquals("I am washing the dishes", robot.washDishes());
    assertEquals(60.00, robot.checkBattery(), 0.01);
  }

  @Test
  public void testDoDusting() {
    assertEquals("I am dusting", robot.doDusting());
    assertEquals(40.00, robot.checkBattery(), 0.01);
  }

  @Test
  public void testRechargeBattery() {
    robot.doDusting();
    robot.rechargeBattery();
    assertEquals(100.00, robot.checkBattery(), 0.01);
  }
}
