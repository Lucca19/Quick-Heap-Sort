public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Vetor sem ordenar:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        quicksort(vetor, 0, vetor.length - 1);


        System.out.println("\n \nVetor ordenado :");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            System.out.println();
        }

        System.out.println("Quantidade de trocas feitas:"); // só falta esse pra terminar 
        for (int i = 0; i < vetor.length; i++) {
            System.out.println();
        }
    }

    static void quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita); // Pega um pivo.
            quicksort(vetor, esquerda, p); // Ordena a esquerda do pivo.
            quicksort(vetor, p + 1, direita); // Ordena a direita do pivo.
            
            }
        }

    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) ((esquerda + direita) / 2);
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        int quant = 0;

        while(true){ // Faz a ordenação do pivo.
            do{
                i++;
            }while(vetor[i] < pivo);
            do{
                j--;
            }while(vetor[j] > pivo);
            if(i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            quant++;
        }
    }
}
