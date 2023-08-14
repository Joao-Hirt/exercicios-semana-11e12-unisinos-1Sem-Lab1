import java.util.Scanner;
public class Exercicios {
    Scanner scanner = new Scanner(System.in);

    public void exercicio1(int[] array){
        for(int i = array.length -1; i>=0; i--){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }

    public int[] exercicio2(int[] array){
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i<length; i++){
            reversedArray[i] = array[length-1-i];
        }
        return reversedArray;
    }

    public int[] exercicio3(int[] array){
        int quantPares = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i] % 2==0){
                quantPares++;
            }
        }

        int[] arrayPares = new int[quantPares];
        int posicao = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] % 2==0){
                arrayPares[posicao] = array[i];
                posicao++;
            }
        }
        return arrayPares;
    }

    public int exercicio4(String[] array, String x){
        for(int i = 0; i<array.length; i++){
            if(array[i].equalsIgnoreCase(x)){
                return i;
            }
        }
        return -1;
    }

    public int[] exercicio5(boolean[] array){
        int[] array1e0 = new int[array.length];
        for(int i = 0; i<array.length; i++){
            if(array[i]){
                array1e0[i] = 1;
            }else{
                array1e0[i] = 0;
            }
        }
        return array1e0;
    }

    public int[] exercicio6(int[] array1, int[] array2){
        int[] array1mais2 = new int[array1.length+array2.length];
        for(int i = 0; i<array1.length; i++){
            array1mais2[i] = array1[i];
        }
        for(int i = 0; i<array2.length; i++){
            array1mais2[array1.length+i] = array2[i];
        }
        return array1mais2;
    }

    public int[] exercicio7(int[] array1, int[] array2){
        int posicao = 0;
        int[] array1e2 = new int[array1.length+array2.length];
        for(int i=0; i<array1.length; i++){
            if(array1[i] < 0){
                array1e2[posicao] = array1[i];
                posicao++;
            }
        }
        for(int i=0; i<array2.length; i++){
            if(array2[i] < 0){
                array1e2[posicao] = array2[i];
                posicao++;
            }
        }

        for(int i=0; i<array1.length; i++){
            if(array1[i] >= 0){
                array1e2[posicao] = array1[i];
                posicao++;
            }
        }
        for(int i=0; i<array2.length; i++){
            if(array2[i] >= 0){
                array1e2[posicao] = array2[i];
                posicao++;
            }
        }
        return array1e2;
    }

    public void exercicio8(char[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println();
    }

    public double exercicio9(int[] array){
        int total = 0;
        for(int i=0; i<array.length; i++){
            total = total+array[i];
        }
        return (double) total/array.length;
    }

    public double exercicio10(int[] array){
        int total = 0;
        int quantPares = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] % 2==0){
                total = total+array[i];
                quantPares++;
            }
        }
        return (double) total/quantPares;
    }

    public int exercicio11(int[] array, int x){
        for(int i=0; i<array.length; i++){
            if(i == x){
                return array[i];
            }
        } return -1;
    }

    public boolean exercicio12(double[] array){
        for(int i=0; i<array.length; i++){
            if(array[i] < 0){
                return true;
            }
        }return false;
    }

    public int exericio13(int[] array){
        int maior = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>maior){
                maior = array[i];
            }
        }return maior;
    }

    public int exercicio14(int[] array){
        int maior = array[0];
        int posicao = 0;
        for(int i=1; i<array.length; i++){
            if(array[i]>maior){
                maior = array[i];
                posicao = i;
            }
        }return posicao;
    }

    public int exercicio15(int[] array){
        int menor = array[0];
        for(int i=1; i< array.length; i++){
            if(array[i]<menor){
                menor = array[i];
            }
        }return menor;
    }

    public int exercicio16(int[] array){
        int menor = array[0];
        int posicao = 0;
        for(int i=1; i<array.length; i++){
            if(array[i]<menor){
                menor = array[i];
                posicao = i;
            }
        }return posicao;
    }

    public boolean exercicio17(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return false;
        }
        for(int i=0; i< array1.length; i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }return true;
    }

    public String exercicio18(char[] array){
        StringBuilder retorno = new StringBuilder();
        for(int i=0; i<array.length; i++){
            retorno.append(array[i]);
        }return retorno.toString();
    }

    public String[] exercicio19(int x){
        String[] string = new String[x];
        for(int i=0; i<x; i++){
            System.out.println("Digite um valor: ");
            string[i] = scanner.nextLine();
        }return string;
    }

    public String[] exercicio20(String[] array, int x){
        if(x >= 0 && x < array.length){
            String[] resultArray = new String[array.length-1];
            int resultIndex = 0;

            for(int i=0; i<array.length; i++){
                if(i != x){
                    resultArray[resultIndex] = array[i];
                    resultIndex++;
                }
            }return resultArray;
        }else{
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    }

    public String exercicio21(double[] array){
        StringBuilder retorno = new StringBuilder();
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                retorno.append(i);
            }
        }return retorno.toString();
    }
}
