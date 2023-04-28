/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR;

/**
 *
 * @author jc_go
 */
public class LR {
    int eID;
    String Titulo;
    String Artista;
       int tracks;
    char type;
    double price;

    public LR(int eID, String Titulo, String Artista, int tracks, char type, double price) {
        this.eID = eID;
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.tracks = tracks;
        this.type = type;
        this.price = price;
    }

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean searchLR(LR a[], int id){
        boolean exist=false;
        for (int i=0;i<a.length;++i){
            if (a[i].geteID()==id)
                return true;
        } 
        return exist; 
    }
    
    
    //WHAT ABOUT NULL POSITIONS
    private void sortData(LR A[]){
        double key=0;
        int i=0;
        for(int j=1;j<A.length;j++){
            key=A[j].getPrice();
            i=j-1;
            while(i>=0 && A[i].getPrice()>key){
                A[i+1]=A[i];
                i=i-1;
            }
        A[i+1].setPrice(key);
        }    
    }
    
    
    
    
    
    
    
}
