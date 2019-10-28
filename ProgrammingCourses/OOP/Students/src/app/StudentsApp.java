/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import datasource.LocalFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.NumberFormat;
import students.Graduate;
import students.Student;
import students.Technician;
import students.Undergraduate;

/**
 *
 * @author jc_go
 */
public class StudentsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalFile lf=new LocalFile();
        BufferedReader br = lf.getBufferedFile();
        
        Student [] technician = new Technician[1000];
        Undergraduate [] undergraduate = new Undergraduate[1000];
        Student [] graduate = new Graduate[1000];
        
        
        int j=0,k=0,l=0,m=0;
        try{
            String line;
            while((line=br.readLine())!=null){
                String [] data = new String[line.split(";").length];
                int i=0;
                for(String datum:line.split(";")){
                    data[i++]=datum;
                }
                m++;
                if(m>1){ // SOBREPASA LA PRIMERA FILA -- DATOS COLUMNA
                    switch (Integer.parseInt(data[data.length-1])) {
                        //TECNICO
                        case 1: technician[j++]= new Technician(Integer.parseInt(data[data.length-1]),Integer.parseInt(data[0]),data[1],data[2],data[3].charAt(0),Double.parseDouble(data[4]));
                                break;
                        //PREGRADO
                        case 2: undergraduate[k++]= new Undergraduate(Integer.parseInt(data[data.length-1]),Integer.parseInt(data[0]),data[1],data[2],data[3].charAt(0),Double.parseDouble(data[4])); 
                                break;
                        //GRADUADO
                        case 3: graduate[l++]= new Graduate(Integer.parseInt(data[data.length-1]),Integer.parseInt(data[0]),data[1],data[2],data[3].charAt(0),Double.parseDouble(data[4]));
                                break;
                        default: System.out.println("Error");
                    }
                } 
            }
        }
        catch(IOException e){
            System.out.println();
        }
        
        
        //FORMATO NUMERO - PORCENTAJE
        NumberFormat defaultFormat = NumberFormat.getPercentInstance();
	defaultFormat.setMinimumFractionDigits(1);
        
        
        
        
        
        int tecnico=0;int pregrado=0;int posgrado=0;
        //PROCESAR DATA
        //(1) Visualizar el total de estudiantes de nivel tecnológico, pregrado, y posgrado
        System.out.println("ítem (1)");
        for(int i=0;i<1000;++i){
            if(technician[i]!=null){
                tecnico++;
            }
            if(undergraduate[i]!=null){
                pregrado++;
            }
            if(graduate[i]!=null){
                posgrado++;
            }
        }
        System.out.println("Total técnicos "+tecnico+"\n"+
                           "Total pregrado "+pregrado+"\n"+
                           "Total posgrado "+posgrado);
        
        //(ii)Visualizar el porcentaje de mujeres y hombres en cada grupo poblacional, i.e.,
        //    nivel tecnológico, pregrado, y posgrado
        System.out.println("ítem (2)");
        int f_tecnico=0;
        int f_pregrado=0;
        int f_posgrado=0;
        
        for(int i=0;i<1000;++i){
            if(technician[i]!=null){
                if(technician[i].getGender()=='F'){
                    f_tecnico++;
                }
            }
            if(undergraduate[i]!=null){
                if(undergraduate[i].getGender()=='F'){
                    f_pregrado++;
                }
            }
            if(graduate[i]!=null){
                if(graduate[i].getGender()=='F'){
                    f_posgrado++;
                }
            }
        }
        
        
        System.out.println("Porcentaje mujeres técnicos "+defaultFormat.format((double)f_tecnico/(double)tecnico)+" Porcentaje hombres técnicos "+defaultFormat.format((1-(double)f_tecnico/(double)tecnico))+"\n"+
                           "Porcentaje mujeres pregrado "+defaultFormat.format((double)f_pregrado/(double)pregrado)+" Porcentaje hombres pregrado "+defaultFormat.format((1-(double)f_pregrado/(double)pregrado))+"\n"+
                           "Porcentaje mujeres posgrado "+defaultFormat.format((double)f_posgrado/(double)posgrado)+" Porcentaje hombre posgrado "+defaultFormat.format((1-(double)f_posgrado/(double)posgrado)));
        
        //(iii) Visualizar el porcentaje de estudiantes aprobados en cada uno de los niveles.
        //Recuerde que en el nivel tecnológico y de pregrado la nota aprobatoria es de 3.0
        //(tres punto cero), mientras que en posgrado la nota aprobatoria es 3.5 (tres
        //punto cinco).
        
        System.out.println("ítem (3)");
        int a_tecnico=0;
        int a_pregrado=0;
        int a_posgrado=0;
        
        for(int i=0;i<1000;++i){
            if(technician[i]!=null){
                if(technician[i].getGrade()>=3.0){
                    a_tecnico++;
                }
            }
            if(undergraduate[i]!=null){
                if(undergraduate[i].getGrade()>=3.0){
                    a_pregrado++;
                }
          }
            if(graduate[i]!=null){
                if(graduate[i].getGrade()>=3.5){
                    a_posgrado++;
                }
            }
        }
        System.out.println("Porcentaje aprobados técnicos "+defaultFormat.format((double)a_tecnico/(double)tecnico)+" Porcentaje reprobados técnicos "+defaultFormat.format((1-(double)a_tecnico/(double)tecnico))+"\n"+
                           "Porcentaje aprobados pregrado "+defaultFormat.format((double)a_pregrado/(double)pregrado)+" Porcentaje reprobados pregrado "+defaultFormat.format((1-(double)a_pregrado/(double)pregrado))+"\n"+
                           "Porcentaje aprobados posgrado "+defaultFormat.format((double)a_posgrado/(double)posgrado)+" Porcentaje reprobados posgrado "+defaultFormat.format((1-(double)a_posgrado/(double)posgrado)));
        
        //(iv) Finalmente, por cada grupo poblacional se debe visualizar la media, varianza, y
        //desviación estándar.
        System.out.println("ítem (4)");
        
        double prom_tecnico=0.0;
        double prom_pregrado=0.0;
        double prom_posgrado=0.0;
        
        for(int i=0;i<1000;++i){
            if(technician[i]!=null){
                prom_tecnico= technician[i].getGrade()/tecnico + prom_tecnico;    
            }
            if(undergraduate[i]!=null){
                prom_pregrado= undergraduate[i].getGrade()/pregrado + prom_pregrado;    
            }
            if(graduate[i]!=null){
                prom_posgrado= graduate[i].getGrade()/posgrado + prom_posgrado;
            }
        }
      
        double var_tecnico=0.0;
        double var_pregrado=0.0;
        double var_posgrado=0.0;
        
        for(int i=0;i<1000;++i){
            if(technician[i]!=null){
                var_tecnico= Math.pow (prom_tecnico-technician[i].getGrade(),2)/ (tecnico-1) + var_tecnico;    
            }
            if(undergraduate[i]!=null){
                var_pregrado= Math.pow (prom_pregrado-undergraduate[i].getGrade(),2)/ (pregrado-1) + var_pregrado;    
            }
            if(graduate[i]!=null){
                var_posgrado= Math.pow (prom_posgrado-graduate[i].getGrade(),2)/(posgrado-1) + var_posgrado;
            }
        }
        System.out.println("Varianza técnicos "+var_tecnico+" Desviación técnicos "+Math.sqrt(var_tecnico)+"\n"+
                           "Varianza pregrado "+var_pregrado+" Desviación pregrado "+Math.sqrt(var_pregrado)+"\n"+
                           "Varianza posgrado "+var_posgrado+" Desviación posgrado "+Math.sqrt(var_posgrado));
    }
}
