import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e Importar classe Scanner
        Scanner valor = new Scanner(System.in);
        
        //Exibir Mensagens para o usuário
        System.out.println("Bem Vindo ao seu Banco Digital!!\n");

        //Obter pela classe Scanner os valores digitados
        System.out.println("Digite o número:");
        int numeroConta = valor.nextInt();
        valor.nextLine(); 

        System.out.println("Digite o número da Agência:");
        String numeroAgencia = valor.nextLine();

        System.out.println("Digite o seu nome:");
        String nomeCliente = valor.nextLine();

        System.out.print("Informe o saldo inicial (valor decimal): ");
        BigDecimal saldo = valor.nextBigDecimal();
        
        System.out.println("\nDados informados:");
        
        System.out.println("Número da conta digitado: " + numeroConta);
        System.out.println("Número da agência digitado: " + numeroAgencia);
        System.out.println("Nome do cliente digitado: " + nomeCliente);
        
        System.out.printf("Saldo formatado: R$ %.2f\n", saldo.doubleValue());
        //Exibir Mensagem Final = "Conta Criada"
        System.out.println("\nConta criada com sucesso!");

        valor.close();
        

    }
}
