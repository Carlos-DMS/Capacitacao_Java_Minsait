package br.com.cdms.exception;

public class LimitePixExcedidoException extends Exception{
    private Double quantiaExcedida;

    public LimitePixExcedidoException(Double quantiaExcedida) {
        super("Limite de PIX excedido por: " + quantiaExcedida);
        this.quantiaExcedida = quantiaExcedida;
    }

    public Double getQuantiaExcedida() {
        return quantiaExcedida;
    }
}
