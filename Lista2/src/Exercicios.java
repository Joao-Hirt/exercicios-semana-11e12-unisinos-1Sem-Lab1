import java.util.Scanner;

public class Exercicios {
    Scanner scanner = new Scanner(System.in);

    public void exercicio1(){
        System.out.println("Digite a quantidade de notas a serem digitadas: ");
        int x = scanner.nextInt();
        double[] notas = new double[x];
        double soma = 0;
        for(int i=0; i<notas.length; i++){
            System.out.println("Digite a nota "+(i+1)+": ");
            notas[i] = scanner.nextInt();
            soma += notas[i];
        }
        System.out.println("A média de notas é: "+(soma/notas.length));
    }

    public void exercicio2(){
        System.out.println("Qual a quantidade de nomes a ser adicionado? ");
        int x = scanner.nextInt();
        scanner.nextLine();
        String[] nomes = new String[x];
        for(int i=0; i<nomes.length; i++){
            System.out.println("Digite o "+(i+1)+"o nome: ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Dados informados: ");
        for(int i=0; i<nomes.length; i++){
            if(i < nomes.length-2){
                System.out.print(nomes[i]+", ");
            }else if(i == nomes.length-2){
                System.out.print(nomes[i]+" e ");
            }else{
                System.out.print(nomes[i]+".");
                System.out.println();
            }
        }
    }

    public double exercicio3(int[] array){
        int soma = 0;
        for(int i=0; i<array.length; i++){
            soma += array[i];
        }return soma;
    }

    public boolean procuraNome(String[] array, String nome){
        for(int i=0; i<array.length; i++){
            if(array[i].equalsIgnoreCase(nome)){
                System.out.println("Nome encontrado na posição: "+i);
                return true;
            }
        }return false;
    }

    public int[] exercicio5(int[] arrayA, int[] arrayB){
        if(arrayA.length != arrayB.length){
            return null;
        }
        int[] arraySoma = new int[arrayA.length];
        for(int i=0; i<arrayA.length; i++){
            arraySoma[i] = arrayA[i] + arrayB[i];
        }return arraySoma;
    }

    public void exercicio6(double[] array){
        double maior = array[0];
        double menor = array[0];
        double soma = array[0];
        for(int i=1; i<array.length; i++){
            soma += array[i];
            if(array[i] >= maior){
                maior = array[i];
            }else if(array[i] <= menor){
                menor = array[i];
            }
        } System.out.println("O maior valor do array é: "+maior+"\nO menor valor do array é: "+menor+"\nA média dos valores do array é: "+(soma/array.length));
    }

    public void exercicio7(){
        int[] array = new int[(int)((Math.random()*100)+1)];
        for(int i=0; i<array.length; i++){
            array[i] = (int)((Math.random()*1000)+1);
        }
        System.out.println("O tamanho do array é de "+array.length+" números.");
        for(int i=0; i<array.length; i++){
            if(i <= array.length-2){
                System.out.print(array[i]+" - ");
            }else{
                System.out.print(array[i]);
            }
        }
    }

    public void exercicio8(){
        int[] numeros = new int[5];
        numeros[0] = 3;
        numeros[numeros[0]] = 5;
        numeros[numeros[3]-3] = 4;
        numeros[4] = 7;
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}
