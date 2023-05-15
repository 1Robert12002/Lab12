package org.example;

public class Calculator {
    private double x;
    public Calculator(double x) {
    this.x = x;
    }

    public Calculator adunare(double a) {
        this.x += a;
        return this;
    }


    public Calculator inmultire(double a) {
        this.x*=a;
        return this;
    }

    public Calculator impartire(double a) {
        if (a == 0) {
            throw new IllegalArgumentException("Impartitorul trebuie sa fie diferit de zero");
        }
        this.x /=a;
        return this;
    }

    public Calculator radical() {
        if (this.x < 0) {
            throw new IllegalArgumentException("Numarul trebuie sa fie pozitiv");
        }
        this.x=Math.sqrt(this.x);
        return this;
    }

    public Calculator negativ() {
        this.x=-this.x;
        return this;
    }

    public Calculator modulo(double a) {
        if (a == 0) {
            throw new IllegalArgumentException("Numarul trebuie sa fie diferit de zero");
        }
        this.x%=a;
        return this;
    }
    public Calculator  rez() {
        System.out.println(this.x);
        return null;
    }
    public double val(){
        return this.x;
    }

}

