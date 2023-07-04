import controller.GerenciamentoHospedes;
import controller.GerenciamentoPagamentos;
import view.CadastrarHospede;
import view.CadastrarPagamento;

public class Main {
    public static void main(String[] args) {
        //GerenciamentoPagamentos gp = new GerenciamentoPagamentos();
        CadastrarHospede ch = new CadastrarHospede();
        //GerenciamentoHospedes gh = new GerenciamentoHospedes();
        ch.cadastrarHospede();
    }
}