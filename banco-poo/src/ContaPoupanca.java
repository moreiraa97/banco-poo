
public class ContaPoupanca extends Conta {



    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }


    @Override
    protected void imprimirExtrato() {

        System.out.println("\n--- Extrato Conta Poupanca ---");
        super.imprimirExtrato();
    }
    


}
