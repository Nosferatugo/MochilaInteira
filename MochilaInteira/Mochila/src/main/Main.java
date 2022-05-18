package main;

import fileManager.FileManager;
import java.io.File;

public class Main {

    public static void main(String args[])
    {
        String arq = null;
//        Ler o Arquivo de Entrada
        //Aqui deve-se alterar a instancia desejada e comparar com a solução proposta no problema
        String DIRETORIO = "instancias";
//        String entrada = FileManager.readFromFile(DIRETORIO+"entrada.txt");
        String entrada = FileManager.readFromFile(DIRETORIO+"/mochila01.txt.txt");
//        String entrada = FileManager.readFromFile(DIRETORIO+"mochila02.txt.txt");
        String[] linhas = entrada.split("\n");

       
        String[] temp1 = linhas[0].split(" ");
        int qntObjetos = Integer.parseInt(temp1[0]);
        int pesoMaximo = Integer.parseInt(temp1[1]);


       // Objetos utilizados
        int valores[] = new int[qntObjetos];
        int wt[] = new int[qntObjetos];
        for (int i = 1; i < linhas.length; i++) {
            String[] temp2 = linhas[i].split(" ");
            wt[i-1] = Integer.parseInt(temp2[0]);
            valores[i-1] = Integer.parseInt(temp2[1]);

         }

        // Executar Mochila!!
        Mochila mochila = new Mochila();
        System.out.println("\n\nTotal carregado: "+ mochila.mochila(wt, valores, pesoMaximo));
    }
}


