//Victor Luis Lima Souza 10310277
//Gabriel Romero 10385477

package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    // acesso inadequado para os dois atributos
    // seria melhor utilizar o "private" para melhor encapsulamento - defeito
    
    
    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    
    
    // falta de métodos setters - defeito

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
