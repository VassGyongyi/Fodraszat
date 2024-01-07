package model;

public class NoKliens extends Kliens {

    public NoKliens(String kliensNev, Hossz hossz) {
        super(kliensNev, hossz);

    }

    @Override
    public void setMosott() {
        System.out.println("Női mosás " + getOsszeg() + " Ft");

        super.setMosott();
    }

    @Override
    public void setVagott() {
        System.out.println("Női vágás " + getOsszeg() + " Ft");

        super.setVagott();
    }

    @Override
    public void setFestett() {
        System.out.println("Női festés " + getOsszeg() + " Ft");

        super.setFestett();
    }

}
