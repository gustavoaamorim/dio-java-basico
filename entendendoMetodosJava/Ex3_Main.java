package entendendoMetodosJava;

public class Ex3_Main {
        public static void main(String[] args) {
            
            System.out.println("Exercício retornos");

            //Quadrado
            double areaQuadraro = Ex3_Quadrilatero.area(5);

            System.out.println("A área do quadrado é: " + areaQuadraro);
                
            //Retangulo
            double areaRetangulo =  Ex3_Quadrilatero.area(10, 5);

            System.out.println("A área do quadrado é: " + areaRetangulo);
    
            //Trapezio
            double areaTrapezio =  Ex3_Quadrilatero.main(15, 10, 5);

            System.out.println("A área do trapézio é: " + areaTrapezio);
            
        }
}
