package prova;

public class main {
    public static void main(String[] args) {

        prova.categoria c1 = new prova.categoria(1, "accao");
        prova.categoria c2 = new prova.categoria(2, "terror");

        System.out.println(c1);
        System.out.println(c2);

        prova.filme u1 = new prova.filme( 9,"vf9");
        u1.getCategoria().add(c1);
        u1.getCategoria().add(c2);

        System.out.println(u1);
    }
}