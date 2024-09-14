public class Util {

    public static void preencheVetor(int tam, double[] vetor) {
        for (int i = 0; i < tam; i++) {
            vetor[i] = (Math.random() * 10.0);
        }
    }

    public static void imprimeVetor(int[] vetor) {
        System.out.println("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
    }

    public static double media(int vet[]) {
        double media = 0.0;
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            cont += vet[i];
        }
        media = cont / vet.length;
        return media;
    }

    public static int[] bubbleSort(int vet[]) {
        int[] vetor = new int[vet.length];
        int aux = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            vetor[i] = vet[i];
        }
        return vetor;
    }

    public static boolean eTri(double a, double b, double c) {
        boolean tri;
        if (a + b > c && a + c > b && b + c > a) {
            tri = true;
        } else {
            tri = false;
        }
        return tri;
    }


    public static boolean parImpar(int num) {
        boolean epar;
        if (num % 2 == 0) {
            epar = true;
        } else {
            epar = false;
        }
        return epar;
    }

    public static Double[] maiorMenorVet(Double vet[]) {
        Double maior = 0.0, menor = vet[0];
        Double vetor[] = new Double[1];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }
        vetor[0] = menor;
        vetor[1] = maior;
        return vetor;
    }

    public static double[] maiorMenorMat(int l, int c, int max) {
        double matriz[][] = new double[l][c];
        double maior = 0.0, menor = matriz[0][0], media = 0.0;
        for (int i = 0; i < l; i++){
            for (int j = 0; j < c; j++){
                matriz[i][j] = (Math.random() * 10.0 + max);
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        media = (maior + menor)/2;
        double vet[] = new double[3];
        vet[0] = maior;
        vet[1] = menor;
        vet[2] = media;
        return vet;
    }
}
