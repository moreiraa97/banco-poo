public abstract class Conta implements ContaInterface{


    //AGENCIA_PADRAO é implementada com "final" pois não deve ser modificada ao longo do código
    //SEQUENCIAL não é implementada como final pois deve ser incrementada para cada nova conta, como uma espécie de Primary key


    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero; 
    protected double saldo;
    protected Cliente cliente; 


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO; 
        this.numero = SEQUENCIAL++;
        this.cliente = cliente; 
    }



    @Override
    public void depositar(double valor) {
        
        this.saldo = saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        
        this.saldo = saldo -= valor; 
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    
    protected void imprimirExtrato() {
        System.out.println(String.format("\tCliente: %s", this.cliente.getNome()));
        System.out.println(String.format("\tAgencia: %d", this.agencia));
        System.out.println(String.format("\tNumero: %d", this.numero));
        System.out.println(String.format("\tSaldo: %.2f", this.saldo));
    }

    
   

}
