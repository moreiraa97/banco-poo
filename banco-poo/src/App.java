public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente lucas = new Cliente();
        Cliente matheus = new Cliente();

        lucas.setNome("Lucas");
        matheus.setNome("Matheus");

        Conta cc = new ContaCorrente(lucas); 
        Conta poupanca = new ContaPoupanca(matheus);

        cc.depositar(100);
        cc.transferir(75, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
