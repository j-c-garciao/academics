package app.nicolas2;


import java.util.Scanner;

public class Matrix { // Solucion planteada por mí
    public static void main(String[] args) throws Exception {
        
        // int[][] core = {    { 1, 2, 3, 4, 5},
        //                     { 6, 7, 8, 9,10},
        //                     {11,12,13,14,15},
        //                     {16,17,18,19,20},
        //                     {21,22,23,24,25}}

        Scanner input = new Scanner(System.in);

        int N = 0;
        do{
            System.out.print("\n Ingresa la dimension N: ");
            N = Integer.parseInt(input.nextLine());

            if(N < 2 || N > 10){
                System.out.println(" N > 2 || N < 10 ");
            }

        }while(N < 2 || N > 10);

        int[][] core = new int[N][N];

        System.out.println("\n ");

        for(int x = 0; x < core.length; x++){
            for(int y = 0; y < core.length; y++){

                core[x][y] = (int)(Math.random()*(25-5)) + 5;

               if(core[x][y] < 10){
                System.out.print("0");
               }
               System.out.print(core[x][y]+ "  ");

            }
            System.out.println("\n ");
        }

        System.out.print("\n Seleccione un grado: ");
        System.out.print("\n [1]. 90 ");
        System.out.print("\n [2]. 180 ");
        System.out.print("\n [3]. 270 ");

        int grado = 0;

        do{
            System.out.print("\n Opcion: ");
            grado = Integer.parseInt(input.nextLine());

            if(grado > 3 || grado < 1){
                System.out.println(" Error: no se reconoce la opcion");
            }

        }while(grado > 3 || grado < 1);

        int ring = 0;

        do{
            System.out.print("\n Ingrese el anillo: ");
            ring = Integer.parseInt(input.nextLine());

            if(ring*2 > core.length || ring < 1){
                System.out.println(" Error: la matriz no tiene este anillo");
            }

        }while(ring*2 > core.length || ring < 1);

        Matrix.rotateMatrix(core,90*grado,ring);
        
        System.out.println(" Resultado ");
        System.out.println("\n ");
        for(int x = 0; x < core.length; x++){
            for(int y = 0; y < core.length; y++){

               if(core[x][y] < 10){
                System.out.print("0");
               }
               System.out.print(core[x][y]+ "  ");

            }
            System.out.println("\n ");
        }

        if(core.length%2 == 0){
            System.out.println(" Nota: PUEDE que ocurra un error durante las matrices sin centro (par),\n "+
                               "       se me acabo el tiempo para solucionar el bug");
        }

    }

    public static void rotateMatrix(int[][] core, int angle,int ring){

        if(ring*2 > core.length){
            System.out.println("\n No existe ese anillo para esta matriz");
            return;
        }
        double radiant = Math.toRadians(angle);

        int middle = core.length/2;
        int less = 0;

        if(core.length%2 == 0){
            less = 1;
        }

        int lenOfRing = 2*ring;
        lenOfRing++;

        for(int index = Math.abs((lenOfRing/2)-middle); index < ((lenOfRing-((lenOfRing/2)-middle)-less)/2)+ring; index++){
            
            int value = rotateIndex(index-middle,ring, core,core[middle-ring][index], radiant,index,middle-ring,1);
            core[middle-ring][index] = value;
        }
    }

    private static int rotateIndex(double x, double y, int[][] core,int value, double radiant, int initialx, int initialy, int rep){

        if(rep >= 4){
            return value;
        }

            int middle = core.length/2;
            double posx = Math.round((x)*Math.cos(radiant) - ((y)*Math.sin(radiant)));
            double posy = Math.round((x)*Math.sin(radiant) + ((y)*Math.cos(radiant)));
            int xres = 0;
            int yres = 0;

            if(core.length%2 == 0){
                if(posx > 0){
                    xres = 1;
                }
                if(posy <= 0){
                    yres = 1;
                }
            }

            int posinxx = (middle + (int)posx - xres);
            int posinyy = (middle -(int)(posy) - yres);

            int aux = core[posinyy][posinxx]; 
            core[posinyy][posinxx] = value;

            rep++;
            return rotateIndex(posx, posy, core,aux, radiant, posinxx, posinyy,rep);
    }

}
