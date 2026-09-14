# Conta Bancária & Exceções Customizadas em Java

Repositório criado para praticar a implementação de **exceções personalizadas** (*Unchecked Exceptions*) e aplicação de regras de negócio em Orientação a Objetos com Java.

## 📌 O que foi praticado

- **Criação de Exceções Customizadas:** Classes estendendo `RuntimeException` para mapear erros específicos do domínio bancário.
- **Uso do `super()`:** Repasse da mensagem detalhada do erro para a classe pai de exceção.
- **Validação de Regras de Negócio:** Tratamento de saques sem saldo disponível e tentativas de depósito com valores inválidos.
- **Encapsulamento e Estado:** Atualização correta dos atributos na memória (`this.saldo`) apenas quando as operações passam pelas validações.

## 🛠️ Estrutura das Exceções

Em vez de disparar exceções genéricas da linguagem, foram criadas duas exceções focadas no contexto do negócio:

- `SaldoInsuficienteException`: Lançada quando a quantia solicitada no saque supera o saldo atual.
- `DepositoMenorQueZeroException`: Lançada ao tentar depositar valores negativos.

```java
class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
