package leerarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoUdC2 {
    public static void main(String[] args) {
  	try{
            File file = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Frecuency.csv"); //TENER ACCESO AL ARCHIVO
            BufferedReader br = new BufferedReader(new FileReader(file));//MANEJO MEMORIA
            String line; //VARIABLE PARA MANIPULAR CADA LINEA DEL ARCHIVO
            double suma=0.0;
            int cont1=0;
            int cont2=0;
            int cont3=0;
            int cont4=0;
             int cont5=0;
            int cont6=0;
            int cont7=0;
            int cont8=0;
            int cont9=0;
            int cont10=0;
            //VARIABLE DE LA SOLUCIÓN
            ///XXX
            
            //LEER EL ARCHIVO HASTA QUE NO HAYAN MÁS LINEAS
            while((line=br.readLine())!=null){
                System.out.println(line);
                int n=Integer.parseInt(line);
                System.out.println("valor entero "+n);
                






///AQUI SE HACE ALGO
                switch (n){
                    case 1: cont1++;
                            break;
                     case 2: cont2++;
                            break;
                     case 3: cont3++;
                            break;
                     case 4: cont4++;
                            break;      
                      case 5: cont5++;
                            break;
                     case 6: cont6++;
                           break;
                     case 7: cont7++;
                            break;
                     case 8: cont8++;
                            break;             
                     case 9: cont9++;
                            break;
                     case 10: cont10++;
                            break;       
                            
                            
                }
            }
            
            //AQUI SE IMPRIMEN LOS RESULTADOS
            
        }
	catch(IOException e){
            System.out.println(e);
	}
    }
}