package model.formasPagamento;

public abstract class FormaPagamento {
    protected byte idFormaPagamento;
    protected String pagador;
    protected boolean pagamentoAprovado;
    protected String instituicaoFinanceira;

    public byte getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(byte idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public boolean isPagamentoAprovado() {
        return pagamentoAprovado;
    }

    public void setPagamentoAprovado(boolean pagamentoAprovado) {
        this.pagamentoAprovado = pagamentoAprovado;
    }

    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }
}
