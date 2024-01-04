public class ContaCorrente extends Conta {



    public ContaCorrente(Cliente cliente){
        super(cliente);
    }


    
    @Override
    protected void imprimirExtrato() {

        System.out.println("\n--- Extrato Conta Corrente ---");
        super.imprimirExtrato();
    }
    

    
}
