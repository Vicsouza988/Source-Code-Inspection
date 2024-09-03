//Victor Luis Lima Souza 10310277
//Gabriel Romero 10385477

package br.calebe.ticketmachine.core; 

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            //erro na verificação da nota
            // a comparação está verificando papelMoeda[1] (que é o 5)- defeito
            if (papelMoeda[1] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            //o nome da exceção não é informativa
            //nome deveria ser mais especifico - defeito
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        //método não implementado, deveria retornar o troco corretamente - defeito
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            //nome da exception não é informativa
            // nome deveria ser mais especifico- defeito
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
