    import java.util.Scanner;
    public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma frase para cifrarmos:");
            String frase = scanner.nextLine().toUpperCase();

            if (frase.length() > 47) {
                System.out.println("Não é possivel cifrar, número maximo de caracteres a mais que o permitido");
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
                int t = novafrase.length();
                int r=0;
                String fc ="";
 for(int z = 0; z <t;z++){
    fc= fc + novafrase.charAt(r); 
    r = (r+3)% t;
    


 }

                  System.out.println("Mensagem cifrada!!!!!!: " + fc);


            }

      scanner.close();
   } 
}