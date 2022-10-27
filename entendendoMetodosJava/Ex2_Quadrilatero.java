package entendendoMetodosJava;

public class Ex2_Quadrilatero {


    //area quadrado
    public static void area(double lado) {
        System.out.println("A área do quadrado é: " + lado*lado);
    }

    //area retângulo
    public static void area(double lado1, double lado2) {
        System.out.println("A área do retângulo é: " + lado1*lado2);
    }

    //area trapezio
    public static void main(double baseMaior, double baseMenor, double altura) {
        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor)*altura)/2);
    }

}
