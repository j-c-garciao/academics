package leerarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoUdC {
    public static void main(String[] args) {
  	try{
            File file = new File("data\\datos.txt"); //TENER ACCESO AL ARCHIVO
            BufferedReader br = new BufferedReader(new FileReader(file));//MANEJO MEMORIA
            String line; //VARIABLE PARA MANIPULAR CADA LINEA DEL ARCHIVO
            double suma=0.0;
            //LEER EL ARCHIVO HASTA QUE NO HAYAN MÁS LINEAS
            while((line=br.readLine())!=null){
                System.out.println(line);
                //RECORTAR LA INFORMACIÓN
                String [] str = line.split(";"); //"; discriminador/wildcard"
                //MANIPULAR DATOS
                for(int i=0;i<str.length;++i){
                    System.out.print(str[i]+" ");
                    suma=Double.parseDouble(str[i])+suma;
                }
                System.out.println("--> "+suma);
                suma=0.0;
                //System.out.println("");
            }
        }
	catch(IOException e){
            System.out.println(e);
	}
    }
}