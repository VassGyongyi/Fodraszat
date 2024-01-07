
package model;


public class FerfiKliens extends Kliens{
     
    public FerfiKliens(String kliensNev, Hossz hossz){
       super(kliensNev, hossz);
       
   }  
    @Override
        public void setMosott() {
            System.out.println("Férfi mosás "+getOsszeg()+" Ft");
           
            super.setMosott();
    } 
     @Override
        public void setVagott() { 
            System.out.println("Férfi vágás "+getOsszeg()+" Ft");   
          
            super.setVagott();
    } 
}
