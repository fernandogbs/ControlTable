import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        try (Scanner alt = new Scanner(System.in)) {
            System.out.println("Deseja adicionar um usuario? (y/n)");
            String alternativa = alt.nextLine();

            switch (alternativa) {
                case "y":
                    AdicionaUsuario adc = new AdicionaUsuario();
                    adc.adicionaUsuario();
                    exibeTabela et = new exibeTabela();
                    et.retornaTabela();
                    break;
                case "n":
                    exibeTabela exibe = new exibeTabela();
                    exibe.retornaTabela();
                    break;
                default:
                    System.out.println("Processo invalido!");
                    break;
            }

            
            System.out.println("Deseja adicionar outro usuario? (y/n)");
            alternativa = alt.next();

            switch(alternativa){
                case "y":
                    AdicionaUsuario adc = new AdicionaUsuario();
                    adc.adicionaUsuario();
                    exibeTabela et = new exibeTabela();
                    et.retornaTabela();
                    break;
                case "n":
                    System.out.println("Encerrando processo!");
                    break;
                default:
                    System.out.println("Comando invalido!");
                    break;
            } 
            alt.close();
        } 
    }
}
