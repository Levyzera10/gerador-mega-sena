import java.util.*;

public class Menu {
    static Scanner teclado = new Scanner(System.in);

    static Set<Integer> loto = new TreeSet<>();

    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Gerar números mega-sena");


        int numeroGerado = 0;


        Boolean sistema = true;
        while (sistema) {
            mostarMenu();
            int numeroMenu = teclado.nextInt();

            switch (numeroMenu) {
                case 1:
                    sistema = false;
                    break;
                case 2:
                    imprimeTodosOsNumeros();
                    break;
                case 3:
                    imprimeNumerosPares();
                    break;
                case 4:
                    imprimeNumerosImpares();
                    break;
                default:
            }

        }
    }

    public static void imprimeTodosOsNumeros() {
        loto.clear();
        System.out.println("TODOS OS NÚMEROS");

        System.out.println("Números desejados ?");
        int numeroDesejado = teclado.nextInt();
        for (int i = 0; i < numeroDesejado; i++) {
            int numeroGerado = 1 + random.nextInt(60);

            if (loto.contains(numeroGerado)) {
                while (loto.contains(numeroGerado)) {
                    numeroGerado = 1 + random.nextInt(60);
                }
                loto.add(numeroGerado);
            } else {
                loto.add(numeroGerado);
            }

        }
        System.out.println(loto);

    }

    public static void imprimeNumerosPares() {
        loto.clear();
        System.out.println("Números pares:");

        System.out.println("Números desejados ?");
        int numeroDesejado = teclado.nextInt();

        for (int i = 0; i < numeroDesejado; ) {
            int numeroGerado = 1 + random.nextInt(60);
            if (numeroGerado % 2 == 0 && loto.add(numeroGerado)) {
                i++;

            }

        }
        System.out.println(loto);

    }

    public static void imprimeNumerosImpares() {
        loto.clear();

        System.out.println("Números Ímpares");

        System.out.println("Números desejados ?");
        int numeroDesejado = teclado.nextInt();

        for (int i = 0; i < numeroDesejado; ) {
            int numeroGerado = 1 + random.nextInt(60);
            if (numeroGerado % 2 != 0 && loto.add(numeroGerado)) {
                i++;

            }

        }
        System.out.println(loto);

    }

    public static void mostarMenu() {
        System.out.println(" ----Menu----");
        System.out.println(" \nopção 1: Encerrar o programa ");
        System.out.println("opção 2: todos os números");
        System.out.println("opção 3: Números pares ");
        System.out.println("opção 4: Números ímpares ");
    }
}





