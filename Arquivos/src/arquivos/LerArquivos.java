/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Pichau
 */
public class LerArquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\A\\out.txt";
        
        /*Try with resources, fecha o que foi aberto sem precisar do finally*/
        try (BufferedReader br = new BufferedReader(new FileReader(path))){                        
            String line = br.readLine();//le uma linha, se tiver no final do file, retorna null
            
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        
        
   }

}
