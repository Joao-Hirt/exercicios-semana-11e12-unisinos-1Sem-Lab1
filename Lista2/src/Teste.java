import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();

        //Exercicio1:
        System.out.println("**** E X E R C Í C I O  1 ****");
        exercicios.exercicio1();

        //Exercicio2:
        System.out.println("\n**** E X E R C Í C I O  2 ****");
        exercicios.exercicio2();

        //Exercicio3:
        System.out.println("\n**** E X E R C Í C I O  3 ****");
        int[] arrayExercicio3 = {5,10,15,20};
        System.out.println(exercicios.exercicio3(arrayExercicio3));

        //Exercicio4:
        System.out.println("\n**** E X E R C Í C I O  4 ****");
        String[] arrayExercicio4 = {"Joao", "Ana", "Leonardo", "Fabricio"};
        if(exercicios.procuraNome(arrayExercicio4, "joao")){
            System.out.println("Encontrado!");
        }else{
            System.out.println("Não encontrado :/");
        }

        //Exercicio5:
        System.out.println("\n**** E X E R C Í C I O  5 ****");
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {6,7,8,9,10};
        System.out.println(Arrays.toString(exercicios.exercicio5(arrayA, arrayB)));

        //Exercicio6:
        System.out.println("\n**** E X E R C Í C I O  6 ****");
        double[] arrayExercicio6 = {1.2, 4.5, 7.8, 9.5, 4.8};
        exercicios.exercicio6(arrayExercicio6);

        //Exercicio7:
        System.out.println("\n**** E X E R C Í C I O  7 ****");
        exercicios.exercicio7();

        //Exercicio8:
        System.out.println("\n**** E X E R C Í C I O  8 ****");
        exercicios.exercicio8();
    }
}
