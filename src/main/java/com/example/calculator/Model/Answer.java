package com.example.calculator.Model;

public class Answer {
    private static double value;

    public Answer(double value) {
        this.value = value;
    }
    public Answer() {
        value = 0.0;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public String to_String() {
        return Double.toString(value);
    }
    public void add(double newValue) {
        this.value += newValue;
    }
    public void multiply(double newValue) {
        this.value *= newValue;
    }
    public void divide(double newValue) {
        this.value /= newValue;
    }
    public void minus(double newValue) {
        this.value -= newValue;
    }
    public void resetValue() {
        value = 0.0;
    }
}
