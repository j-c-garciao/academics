/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author jc_go
 */
public class LocalFile {
    
    public BufferedReader getBufferedFile(){
        try{
            File file = new File("C:\\Users\\jc_go\\Documents\\GitHub\\academics\\ProgrammingCourses\\OOP\\Students\\data\\Taller_Estudiantes.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            return br;            
        }
        catch(FileNotFoundException e){
            return null;
        }
    } 
   
}
