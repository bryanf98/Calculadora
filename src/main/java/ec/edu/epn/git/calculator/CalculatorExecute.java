package ec.edu.epn.git.calculator;

public class CalculatorExecute {

    public static void main(String[] args){
        System.out.println("|-- Calculator Execute --|");

        Calculator c = new Calculator();

        int addition = c.addition(5,2);
        System.out.println("c.addtion(5,2) = " + addition);

        int substraction = c.substraction(9,3);
        System.out.println("c.substraction(9,3) = " + substraction);

        System.out.println("Último Cambio");
    }
}
