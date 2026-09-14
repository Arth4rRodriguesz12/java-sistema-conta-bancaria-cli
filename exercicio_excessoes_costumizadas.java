
    class SaldoInsuficienteException extends RuntimeException{// criei uma classe para utilizar em um erro especifico 
        public  SaldoInsuficienteException(String mensagem){
            super(mensagem);//repassa a menssagem para a excessão
        }

    }

    class DepositoMenorQueZeroException extends RuntimeException{
        public DepositoMenorQueZeroException(String aviso){
            super(aviso);
        }
    }


class ContaBancaria{
    private double saldo;
    private String titular;
    private int numeroConta;

    public ContaBancaria(double saldo , String titular, int numeroConta){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public int getNumeroConta(){
        return  numeroConta;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

   public void sacar(double valor){
    if (valor > saldo){
    throw new SaldoInsuficienteException("Você não tem saldo suficiente!" );//chama a excessão que criei
    } else{
        this.saldo -= valor;
        System.out.println("O novo saldo é: " + this.saldo);
    }
   }

   public void depositar(double deposito){
    if(deposito < 0){
    throw new DepositoMenorQueZeroException("Erro, deposito não pode ser menor que zero");
    }else{
        this.saldo += deposito;
        System.out.println("O novo saldo é: " + this.saldo);
    }
   }

   public void consultar(){
        System.out.println("O seu saldo atual é: " + saldo);
    }

   public ContaBancaria(){

   }
}

     public class exercicio_excessoes_costumizadas{
     public static void main(String[] args){

        ContaBancaria contaB = new ContaBancaria();

        contaB.depositar(1000.0);
        contaB.sacar(150.0);
        contaB.sacar(1200);

        }
    }