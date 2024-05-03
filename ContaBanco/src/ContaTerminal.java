import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente = "Mario Andrade";
        String agencia = "067-8";
        double saldo = 237.48;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta!");
        int numero = input.nextInt();
        
        if(numero == 1021){
            System.out.println("Olá "+nomeCliente+", obrigado por criar sua conta em nosso banco, sua agência é "+agencia+", conta "+
            numero+" e seu saldo "+saldo+" já está disponível para saque.");
        }
        
        

    }
}
