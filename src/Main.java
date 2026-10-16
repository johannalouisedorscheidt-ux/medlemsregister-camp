public class Main {
    public static void main(String[] args) {

        System.out.println("Välkommen till Klubbens Register!");

        Medlem medlem = new Medlem("Kim", 1001);
        System.out.println(medlem.getNamn());
        System.out.println(medlem.getMedlemsnummer());
    }
}
