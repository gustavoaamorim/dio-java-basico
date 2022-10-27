package entendendoMetodosJava;

public class Ex3_Quadrilatero {

      //area quadrado
      public static double area(double lado) {
        return lado*lado;
    }

    //area retângulo
    public static double area(double lado1, double lado2) {
        return lado1*lado2;
    }

    //area trapezio
    public static double main(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor)*altura)/2;
    }

}
