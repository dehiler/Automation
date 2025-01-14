package co.sample.poo;

public class Calculadora {

    private double num1;

    private double num2;

    private double num3;

    public Calculadora(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double suma (){
        double resultado = this.num1 + this.num2;
        return resultado;
    }

    public double resta (){
        double resultado = this.num1 - this.num2;
        return resultado;
    }

    public double multi (){
        double resultado = this.num1 * this.num2;
        return resultado;
    }

    public double divi (){
        double resultado = this.num1 / this.num2;
        return resultado;
    }

    public double suma3 () {
        double resultado = this.num1 + this.num2 + this.num3;
        return resultado;
    }
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getNum3() {
        return num2;
    }
}


