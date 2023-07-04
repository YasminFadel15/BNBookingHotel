package model.formasPagamento;

public class Boleto extends FormaPagamento {
    private String codigoBarras;
    private String vencimentoBoleto;

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getVencimentoBoleto() {
        return vencimentoBoleto;
    }

    public void setVencimentoBoleto(String vencimentoBoleto) {
        this.vencimentoBoleto = vencimentoBoleto;
    }
}
