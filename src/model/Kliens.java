package model;

public abstract class Kliens {

    private boolean mosott;
    private int osszeg;
    private boolean vagott;
    private boolean festett;
    private Hossz hossz;
    private String kliensNev;
    private static int alap =2000;

    public String getKliensNev() {
        return kliensNev;
    }
     public Kliens(String kliensNev, Hossz hossz){
       this.kliensNev = kliensNev;
       this.hossz = hossz;
    }
    public void setMosott() {
        //System.out.println("mosás");
        
        this.mosott = true;
    }

     public void setVagott() {
         //System.out.println("vágás");
       
        this.vagott = true;
    }

     public void setFestett() {
       // System.out.println("festés");
       
        this.festett = true;
    }

  

    public enum Hossz {ROVID, KOZEPES, HOSSZU}

    public int getOsszeg() {
       switch(hossz){
           case ROVID -> {
           osszeg = alap*2;
           }
            case KOZEPES -> {
            osszeg = alap*3;
                
           }
             case HOSSZU -> {
              osszeg = alap*5;   
             }
           }
        return osszeg; 
    }

   
    @Override
    public String toString() {
        return "Kliens{" + "mosott=" + mosott + ", osszeg=" + osszeg + ", vagott=" + vagott + ", festett=" + festett + ", hossz=" + hossz + ", kliensNev=" + kliensNev + '}';
    }
  
}


