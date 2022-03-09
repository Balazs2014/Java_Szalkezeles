package feladat01;

public class FoSzal {
    public static void main(String[] args) {
        new MasodikSzal().start();
        new HarmadikSzal().start();

        while (true) {
            try {
                System.out.println("Ez itt a fő szál.");
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class MasodikSzal extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Ez itt a masodik szál!");
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
