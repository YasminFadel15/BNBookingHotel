package view;

import controller.GerenciamentoPagamentos;
import model.formasPagamento.Boleto;
import model.formasPagamento.Cartao;
import model.formasPagamento.Pix;

import javax.swing.*;
import java.math.BigInteger;
import java.util.Random;

public class CadastrarPagamento {

    public CadastrarPagamento() {
        escolherFormaPagamento();
    }
    public void escolherFormaPagamento() {
        String[] formasPagamento = {"Cartão", "Boleto", "Pix"};
        String formaPagamento = (String) JOptionPane.showInputDialog(null, "Selecione a forma de " +
                        "pagamento:", "Adicionar forma de pagamento",
                JOptionPane.QUESTION_MESSAGE, null, formasPagamento, formasPagamento[0]);
        cadastrarFormaPagamento(formaPagamento);
    }

    public void cadastrarFormaPagamento(String formaPagamento) {
        switch (formaPagamento) {
            case "Cartão" -> {
                Cartao card = new Cartao();
                String pagador = JOptionPane.showInputDialog("Titular do cartão:");
                long numeroCartao = Long.parseLong(JOptionPane.showInputDialog("Número do cartão:"));
                String[] bandeiras = {"Visa", "Mastercard", "Hipercard", "Elo", "American Express"};
                String bandeira = (String) JOptionPane.showInputDialog(null, "Selecione a bandeira:",
                        "Adicionar forma de pagamento",
                        JOptionPane.QUESTION_MESSAGE, null, bandeiras, bandeiras[0]);
                String dataVencimento = JOptionPane.showInputDialog("Data de vencimento (MM/AA):");
                short codigoSeguranca = Short.parseShort(JOptionPane.showInputDialog("Código de segurança:"));
                card.setIdFormaPagamento((byte) 0);
                card.setPagador(pagador);
                card.setInstituicaoFinanceira("");
                card.setNumeroCartao(numeroCartao);
                card.setBandeira(bandeira);
                card.setDataVencimento(dataVencimento);
                card.setCodigoSeguranca(codigoSeguranca);
                card.setPagamentoAprovado(true);
            }
            case "Boleto" -> {
                Boleto boleto = new Boleto();
                BigInteger codigoBarras = geraCodigoBarras();
                JOptionPane.showMessageDialog(null, "Boleto gerado!\n\n" +
                        "Código de barras:\n" + codigoBarras, "Boleto bancário", JOptionPane.INFORMATION_MESSAGE);
            }
            case "Pix" -> {
                Pix pix = new Pix();
                JFrame telaPix = new JFrame();
                telaPix.setVisible(true);
                telaPix.setSize(500, 500);
                telaPix.setTitle("Pix");
                telaPix.add(new JLabel("Escaneie o código QR com o aplicativo do seu banco.", SwingConstants.CENTER));
                telaPix.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                telaPix.setLocationRelativeTo(null);
                // ADICIONAR IMAGEM DO QR CODE
            }
        }
    }

    private BigInteger geraCodigoBarras() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 47; i++) {
            int digito = random.nextInt(10);
            sb.append(digito);
        }

        return new BigInteger(sb.toString());
    }
}
