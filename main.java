    import java.util.Scanner;
    public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma frase:");
            String frase = scanner.nextLine().toUpperCase();

            if (frase.length() > 47) {
                System.out.println("Não é possivel cifrar, número maximo de caracteres excedido");
            } else {
                char[] bank = {'Ã', 'Â', 'Á', 'Ä', 'Ë', 'É', 'Ê', 'Ö', 'Ô', 'Õ', 'Í', 'Ü', 'Ú', 'Ç'};
                char[] banko = {'A', 'A', 'A', 'A', 'E', 'E', 'E', 'O', 'O', 'O', 'I', 'U', 'U', 'C'};

                char[] letrasFrase = frase.toCharArray();
                String novafrase = "";

                for (int i = 0; i < letrasFrase.length; i++) {
                    char letraAtual = letrasFrase[i];

                    for (int b = 0; b < bank.length; b++) {
                        if (letraAtual == bank[b]) {
                            letraAtual = banko[b];
                            break;
                        }
                    }

                    if (letraAtual >= 'A' && letraAtual <= 'Z') {
                        novafrase = novafrase + letraAtual;
                    }
                }

                System.out.println("Frase formatada: " + novafrase);
            }

            scanner.close();
        }
    }