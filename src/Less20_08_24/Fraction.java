package Less20_08_24;

import java.util.Scanner;

/** Создайте класс «Дробь». Необходимо хранить в полях
 класса: числитель и знаменатель. Реализуйте методы
 класса для ввода данных, вывода данных, реализуйте доступ
 к отдельным полям через методы класса. Также создайте
 методы класса для выполнения арифметических операций
 (сложение, вычитание, умножение, деление, и т.д.). */

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
    }
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num = scanner.nextInt();
        this.setNumerator(num);
        System.out.print("Enter denominator: ");
        int denom = scanner.nextInt();
        this.setDenominator(denom);

        scanner.close();
    }

    public void print() {
        System.out.println(getNumerator() + "/" + getDenominator());
    }

    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction subtract(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int denom = this.denominator * other.denominator;
        return new Fraction(num, denom);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        int num = this.numerator * other.denominator;
        int denom = this.denominator * other.numerator;
        return new Fraction(num, denom);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }
}
