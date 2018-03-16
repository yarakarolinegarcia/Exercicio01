public class Principal {

    public static void main(String[] args) {

        System.out.println("Retângulo ASCII");
        Retangulo r = new Retangulo(2,2);
        r.desenhaASCII();
        System.out.println("Retângulo UTF8");
        r.desenhaUTF8();

    }
}
