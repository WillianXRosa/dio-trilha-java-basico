
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Digite o número da conta: ");
        numeroConta =sc.nextInt();
        System.out.println("Digite o número da agência: ");
        agencia = sc.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo: ");
        saldo = (Double)sc.nextDouble();

        System.out.println("Ola shr(a) " + nomeCliente + ", obrigado por abrir uma conta em nosso banco, sua agência é: " 
        + agencia + ", conta: " + numeroConta + ", seu saldo: R$ " + saldo + ", já está disponível para saque.");


        
    }
}
