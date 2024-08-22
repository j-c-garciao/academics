package DomesticPet;

/**
 *
 * @author JC Garcia-Ojeda
 */
public class Dog {
    //ATTRIBUTES
    String Breed;
    String Size;
    int Age;
    String Color;

    //CONSTRUCTOR
    public Dog(String Breed, String Size, int Age, String Color) {
        this.Breed = Breed;
        this.Size = Size;
        this.Age = Age;
        this.Color = Color;
    }
    //METHODS
    void doEat(){
    }
    void doSleep(){
    }
    void doSit(){
    }
    void doRun(){
    }
    
    public String getBreed() {
        return Breed;
    }

    public String getSize() {
        return Size;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    
}
