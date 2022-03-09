package feladat01;

public class HarmadikSzal extends Thread {
    private int szamlalo = 0;
    @Override
    public void run() {
        while (szamlalo < 5) {
            szamlalo++;
            try {
                System.out.println("Ez itt a harmadik szál." + szamlalo);
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
