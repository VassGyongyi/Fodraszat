package fodraszat;

import model.Kliens;
import model.Fodraszat;
import model.FerfiKliens;
import model.NoKliens;

public class FodraszatProgram {

    private Fodraszat fodraszat;

    public static void main(String[] args) {

        new FodraszatProgram();

    }
    private final Fodraszat kliens;

    public FodraszatProgram() {
        kliens = new Fodraszat(5);

        kliens.fogad(new NoKliens("Hajni", Kliens.Hossz.HOSSZU));
        kliens.mosas();
        kliens.vagas();
        kliens.festes();
        kliens.kesz("Hajni");
        kliens.fogad(new FerfiKliens("Marci", Kliens.Hossz.ROVID));
        kliens.mosas();
        kliens.vagas();
        kliens.festes();
        kliens.kesz("Marci");
        kliens.fogad(new FerfiKliens("Dezső", Kliens.Hossz.KOZEPES));
        kliens.mosas();
        kliens.vagas();
        kliens.festes();
        kliens.kesz("Dezső");
    }

}
