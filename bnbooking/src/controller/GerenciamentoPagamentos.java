package controller;

import model.formasPagamento.FormaPagamento;
import view.CadastrarPagamento;

import javax.swing.*;

public class GerenciamentoPagamentos {
    private FormaPagamento formaPagamento;
    public GerenciamentoPagamentos() {
        int opcao = exibirOpcoes();
        if(opcao == 1) {
            CadastrarPagamento cp = new CadastrarPagamento();
        } else {
            JOptionPane.showMessageDialog(null, "Alterar tela");
        }
    }

    private int exibirOpcoes() {
        String[] escolhas = {"Adicionar forma de pagamento", "Alterar forma de pagamento"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opção:",
                "Gerenciar pagamentos", JOptionPane.QUESTION_MESSAGE,
                null, escolhas, escolhas[0]);
        return escolha.equals("Adicionar forma de pagamento") ? 1 : 2;
    }

    public boolean cadastrarFormaPagamento(String formaPagamento) {

        return true;
    }

    /*public boolean alterarFormaPagamento() {

    }*/
}
