
    class SaldoInsuficienteException extends RuntimeException{// criei uma classe para utilizar em um erro especifico 
        public  SaldoInsuficienteException(String mensagem){
            super(mensagem);//repassa a menssagem para a excessão
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
    throw new SaldoInsuficienteException("Você não tem saldo suficiente!" );
    }
   }
}