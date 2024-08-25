package app;

import DomesticPet.Dog;

/**
 *
 * @author JC Garcia-Ojeda
 */
public class App {

    public static void main(String[] args) {
        //INSTANCE CREATION
        Dog d1 = new Dog("Neapolitan Mastiff","Large",5,"Black");
        Dog d2 = new Dog("Maltese","Small",2,"White");
        Dog d3 = new Dog("Chow Chow","Medium",3,"Brown");
        
        //READ INSTANCE
        System.out.println("d1's instance "+d1);
        System.out.println("d2's instance "+d2);
        System.out.println("d3's instance "+d3);
        
        //READ INFORMATION
        System.out.println("d1's information "+d1.getBreed()+
                           " "+d1.getSize()+
                           " "+d1.getAge()+" years"+
                           " "+d1.getColor());
        
        
        
        
        
        //System.out.println("d2's instance "+d2);
        //System.out.println("d3's instance "+d3);
        
        
        
        
    }
}
