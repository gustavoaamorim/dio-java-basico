package entendendoMetodosJava;

public class Ex1_Main {
    
    public static void main(String[] args) {
        
        //Calculadora
        System.out.println("Exercício calculadora");
        Ex1_Calculadora.soma(10, 2);
        Ex1_Calculadora.subtracao(10, 2);
        Ex1_Calculadora.multiplicacao(10, 2);
        Ex1_Calculadora.divisao(10, 2);


        //Mensagem
        System.out.println("Exercício mensagem");
        Ex1_Mensagem.obterHora(16);

        //Emprestimo
        System.out.println("Exercício emprestimo");
        Ex1_Emprestimo.calcular(1000, Ex1_Emprestimo.getDuasParcelas()); //usando um método como parâmetro
        Ex1_Emprestimo.calcular(1000, 3);
    }


}
