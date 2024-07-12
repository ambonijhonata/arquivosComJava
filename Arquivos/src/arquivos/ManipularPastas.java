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
public class ManipularPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        System.out.println("IMPRIMIR PASTAS DO CAMINHO; ");        
        File[] folders = path.listFiles(File::isDirectory);        
        for (File folder : folders) {
            System.out.println(folder);
        }
        
        System.out.println("IMPRIMIR ARQUIVOS DO CAMINHO; ");        
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        
        System.out.println("CRIAR SUBPASTA");        
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("CRIOU PASTA? " + success);        
    }
}
