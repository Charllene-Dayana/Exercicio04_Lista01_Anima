import java.util.Scanner;

class main {
    public static void main(String[] args) {
        int nota;
        int nota2;
        int nota3;
        int nota4;
        int media;
        Scanner teclado = new Scanner(System.in);

        nota = teclado.nextInt();
        nota2 = teclado.nextInt();
        nota3 = teclado.nextInt();
        nota4 = teclado.nextInt();
        media = (nota + nota2 + nota3 + nota4) / 4;

        System.out.println(media);
        teclado.close();
    }
}
