/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class InformacoesCaminhoArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        System.out.println("NOME DO ARQUIVO: " + path.getName());
        System.out.println("CAMINHO DO ARQUIVO: " + path.getParent());
        System.out.println("CAMINHO COMPLETO DO ARQUIVO: " + path.getPath());
        
        sc.close();
    }
}
