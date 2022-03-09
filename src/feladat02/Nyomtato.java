package feladat02;

import java.util.LinkedList;
import java.util.Queue;

public class Nyomtato {
    private int meret;
    private Queue<String> nyomtatnivalok;

    public Nyomtato(int meret) {
        this.meret = meret;
        nyomtatnivalok = new LinkedList<>();
    }

    public void feladatKiadas(String nyomtatnivalo) {
        if (nyomtatnivalok.size() == meret) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Nyomtatásra kiadva: " + nyomtatnivalo);
        nyomtatnivalok.add(nyomtatnivalo);
    }

    public String Nyomtatas(long ido) {
        if (nyomtatnivalok.isEmpty()) {
            try {
                wait(ido);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        String kiadott = nyomtatnivalok.remove();
        System.out.println("Kinyomtatva: " + kiadott);
        return kiadott;
    }
}
