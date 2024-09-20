package com.example.task03;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }

    public String toString(){
        return ("(" + real + " + " + imag + "i" + ")");
    }

    public ComplexNumber add(ComplexNumber number) {
        double real = this.real + number.real;
        double imag = this.imag + number.imag;

        return new ComplexNumber(real, imag);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double real = this.real * number.real - this.imag * number.imag;
        double imag = this.real * number.imag + this.imag * number.real;

        return new ComplexNumber(real, imag);
    }
}
