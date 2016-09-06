/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos - 31
 * @author Christian Morales, Jose Luis Méndez
 * Carne: 15015, 15021
 * 05 de septiembre del 2016
 * Descripción: main, interfaz con el usuario
 */
import java.util.Scanner;
import java.util.Set;
public class main {
       private static Scanner scan;
    public static void main(String[] args){
        scan = new Scanner(System.in);
        String userOption;
        int tipo =0;
        int read = 0;
        
            System.out.println("ingrse opcion");
            System.out.println("(1)has table");
            System.out.println("(2)linked table");
            System.out.println("(3)tree hash table");
            
            userOption = scan.nextLine();
            
            tipo = Integer.valueOf(userOption);
        
        HashFunctions<String> mobileDeveloper = new HashFunctions(tipo);
         HashFunctions<String> webDeveloper = new HashFunctions(tipo);
    
        HashFunctions<String> javaDeveveloper = new HashFunctions(tipo);
        
       
        

            
            Integer previousEX = 0;
            String name = " ";
            
            System.out.println("por favor ingrese desarroyador");
            developer = scan.nextLine();
            
            System.out.println("java(1)");
            System.out.println("mobil(1)");
            System.out.println("web(1)");
            userOption = scan.nextLine();
            
            previousEX = Integer.valueOf(userOption);
            
            switch(previousEX){
                case 1:
                    javaDeveveloper.addElement(developer);
                    break;
                case 2:
                    mobileDeveloper.addElement(developer);
                    break;
                case 3:
                    webDeveloper.addElement(developer);
                    break;
            
            
        
        // Determinar tamanios de los conjuntos
         Set<String> mo = mobileDeveloper.getSet();
        Set<String> java = javaDeveveloper.getSet();
        Set<String> web = webDeveloper.getSet();
       
        
        int x;
        int y;
        int Z;
        String maxDevelopers;
         x= java.getSetSize();
        y = web.getSetSize();
        z = mo.getSetSize();
        
        if(x>y && x>z){
            maxDevelopers="maxDevelopers:Java";
            
        }
        if(y>x && y>z){
            maxDevelopers="maxDevelopers:Web";
            
        }
        if(z>x && z>y){
            max="maxDevelopers:Movil";
          
        }
        System.out.println(maxDevelopers);
       
        
        
        
    }
}
