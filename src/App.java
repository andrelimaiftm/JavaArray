import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Vetores (Arrays)
        //É um variavel que armazena varios valores de mesmo tipo
        
        //String[]  nomes = new String[5];

        //System.out.println(nomes[0]);

       // int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        //int[] numeros2 = new int[100];
        

        //System.out.println(numeros[0]);
        //System.out.println(numeros[9]);
        
        /*String nome1 = "Maria";
        String nome2 = "Jose";
        String nome3 = "Pedro";
        String nome4 = "Juquinha";
        String nome5 = "Carla";*/

        /*nomes[0] = "Maria";
        nomes[1] = "Jose";
        nomes[2] = "Pedro";
        nomes[3] = "Juquinha";
        nomes[4] = "Carla";
        //posição excede a capacidade do vetor
        //nomes[5] = "Roberta";

        //int tamanhoVetor = numeros.length;
        //System.out.println(tamanhoVetor);

        /*for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] = i;
        }*/

        /*for (int numero : numeros2) {
            System.out.println(numero);
        }*/

        /*double[] notas = new double[3];
        int i = 0;
        double soma = 0;
        while (i < 3) {
           String temp = JOptionPane.showInputDialog(null, "Digite uma nota " + i+1 +":");
           double nota = Double.parseDouble(temp);
           notas[i] = nota;
           soma += nota;
           i++;
        }
        double media = soma/i;
        JOptionPane.showMessageDialog(null, media, "A Méda das Notas", JOptionPane.INFORMATION_MESSAGE);*/

        int[][] matriz = new int[3][3];

        int[][] matriz2 = {{1,2,3}, {4,5,6}, {7, 8, 9}};

        int[][] resultado = new int[3][3];

        int[][][] matrizTridimencional = new int[100][100][100];
        
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        //percorre as linhas da matriz
        /*for (int i = 0; i < matriz.length; i++) {
            //percorre as colunas da matriz
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 1;
            }
        }*/

        /*for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                resultado[i][j] = matriz[i][j]+matriz2[i][j];
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }*/

        for (int i = 0; i < matrizTridimencional.length; i++) { //3
            for (int j = 0; j < matrizTridimencional.length; j++) {//3*3
                for (int k = 0; k < matrizTridimencional.length; k++) {
                    System.out.print(matrizTridimencional[i][j][k]+ " ");
                }
                System.err.println();                
            }
            System.err.println();
        }        

    }
}
