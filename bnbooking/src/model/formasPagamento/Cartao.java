package model.formasPagamento;

public class Cartao extends FormaPagamento {
    private long numeroCartao;
    private String bandeira;
    private String dataVencimento;
    private short codigoSeguranca;

    public long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public short getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(short codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}
