public class Teste {
    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();

        //Exercicio 1
        int[] array1 = {1, 2, 3, 4, 5};
        exercicios.exercicio1(array1);

        // Exercício 2
        int[] array2 = {6, 7, 8, 9, 10};
        int[] reversedArray = exercicios.exercicio2(array2);
        System.out.print("Array Reverso: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        // Exercício 3
        int[] array3 = {11, 12, 13, 14, 15};
        int[] evenArray = exercicios.exercicio3(array3);
        System.out.print("Array com Valores Pares: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println();

        // Exercício 4
        String[] array4 = {"Java", "Python", "C++", "Ruby"};
        String searchElement = "Python";
        int position = exercicios.exercicio4(array4, searchElement);
        if (position != -1) {
            System.out.println("Elemento " + searchElement + " encontrado na posição " + position);
        } else {
            System.out.println("Elemento " + searchElement + " não encontrado no array");
        }

        // Exercício 5
        boolean[] array5 = {true, false, true, true, false};
        int[] binaryArray = exercicios.exercicio5(array5);
        System.out.print("Array Binário: ");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i] + " ");
        }
        System.out.println();

        // Exercício 6
        int[] array6a = {1, 2, 3};
        int[] array6b = {4, 5, 6};
        int[] mergedArray = exercicios.exercicio6(array6a, array6b);
        System.out.print("Array Mesclado: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();

        // Exercício 7
        int[] array7a = {-1, -2, 3, -4};
        int[] array7b = {5, -6, 7, -8};
        int[] combinedArray = exercicios.exercicio7(array7a, array7b);
        System.out.print("Array Combinado: ");
        for (int i = 0; i < combinedArray.length; i++) {
            System.out.print(combinedArray[i] + " ");
        }
        System.out.println();
    }
}
