package model;

public class Fodraszat {

    private final Kliens[] kliensek;
    private int kliensekDb;
    private boolean nyitva;

    public Fodraszat(int db) {
        kliensekDb = 0;
        kliensek = new Kliens[db];
        nyitva = true;

    }

    public void fogad(Kliens kliens) {
        if (nyitva) {
            if (kliensekDb < kliensek.length) {
                kliensek[kliensekDb++] = kliens;
            } else {
                System.out.println("A fodrászat fogadóképessége betelt!");
            }
        } else {
            System.out.println("A fodrászat nincs nyitva.");
        }
    }

    public void mosas() {
        if (nyitva) {
            for (Kliens kliens : kliensek) {
                if (kliens != null) {
                    kliens.setMosott();
                }
            }
        } else {
            System.out.println("A fodrászat nincs nyitva.");
        }
    }

    public void vagas() {
        if (nyitva) {
            for (Kliens kliens : kliensek) {
                if (kliens != null) {
                    kliens.setVagott();
                }
            }

        } else {
            System.out.println("A fodrászat nincs nyitva.");
        }
    }

    public void festes() {
        if (nyitva) {
            for (Kliens kliens : kliensek) {
                if (kliens != null) {
                    kliens.setFestett();
                }
            }
        } else {
            System.out.println("A fodrászat nincs nyitva.");
        }
    }

    public void kesz(String kliensNev) {
        if (nyitva) {
            int j = 0;
            while (j < kliensekDb && (kliensek[j] == null || !(kliensek[j].getKliensNev().equals(kliensNev)))) {
               
                j++;
            }
            if (j < kliensekDb) {
                System.out.println(String.format("Kész %s!", kliensNev));
                
                kliensek[j] = null;
            } else {
                System.out.println("Hiba az előjegyzésben!");
            }
        } else {
            System.out.println("A fodrászat nincs nyitva.");
        }
    }
  
    public void zarva() {
        nyitva = false;
    }
}
