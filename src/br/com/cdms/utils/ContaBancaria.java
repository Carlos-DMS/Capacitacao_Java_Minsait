package br.com.cdms.utils;

import br.com.cdms.exception.LimitePixExcedidoException;

public class ContaBancaria {

    private Double limitePix = 2000.0;

    public ContaBancaria() {
    }

    public ContaBancaria(Double limitePix) {
        this.limitePix = limitePix;
    }

    public void fazerPix(Double quantia) throws LimitePixExcedidoException {
        if (quantia > this.limitePix) {
            throw new LimitePixExcedidoException(quantia - this.limitePix);
        }
        else {
            System.out.println("PIX realizado com sucesso!");
        }
    }
}
