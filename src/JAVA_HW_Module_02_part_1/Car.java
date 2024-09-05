package JAVA_HW_Module_02_part_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Car {

    private String carName;
    private String manufacturerName;
    private LocalDate issueYear;
    private double engineVolume;

    public Car() {
    }
    public Car(String carName, int year) {
        this.carName = carName;
        this.issueYear = LocalDate.ofYearDay(year, 1);
    }
    public Car(String carName, String manufacturerName, int year, double engineVolume) {
        this(carName, year);
        this.manufacturerName = manufacturerName;
        this.engineVolume = engineVolume;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car name: ");
        String carName = scanner.nextLine();
        this.setCarName(carName);
        System.out.print("Enter manufacturer name: ");
        String manufacturerName = scanner.nextLine();
        this.setManufacturerName(manufacturerName);
        System.out.print("Enter issue year: ");
        int issueYear = scanner.nextInt();
        this.setIssueYear(issueYear);
        System.out.print("Enter engine volume: ");
        double engineVolume = scanner.nextDouble();
        this.setEngineVolume(engineVolume);

        scanner.close();
    }

    public void print() {
        System.out.println("Car: " + getCarName() + '\n'
        + "Year issue: " + getIssueYear().getYear() + '\n'
        + "Engine volume: " + getEngineVolume() + " hp." + '\n'
        + "Manufacturer: " + getManufacturerName() + '\n');
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public LocalDate getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int year) {
        this.issueYear = LocalDate.ofYearDay(year, 1);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
