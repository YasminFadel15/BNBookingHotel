package controller;

import model.Hospede;
import view.CadastrarHospede;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoHospedes {

    public List<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(List<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    private List<Hospede> listaHospedes = new ArrayList<>();

    public void hospedesExistentes() {
        Hospede gabriel = new Hospede();
        gabriel.setCPF("12345678900");
        gabriel.setNomeCompleto("Gabriel Godinho");
        gabriel.setEndereco("Av. Atlântica, 1702 - Copacabana, Rio de Janeiro");
        gabriel.setTelefone(4799999999999L);
        gabriel.setEmail("gabrielgodinho@bnbooking.com");
        gabriel.setDataNascimento("22/08/1948");
        salvarHospedeNaLista(gabriel);

        Hospede jordan = new Hospede();
        jordan.setCPF("99999999999");
        jordan.setNomeCompleto("Jordan Nogueira");
        jordan.setEndereco("Av. Atlântica, 1702 - Copacabana, Rio de Janeiro");
        jordan.setTelefone(4712345678987L);
        jordan.setEmail("jordannogueira@bnbooking.com");
        jordan.setDataNascimento("26/01/2003");
        salvarHospedeNaLista(jordan);

        Hospede yasmin = new Hospede();
        yasmin.setCPF("10203040500");
        yasmin.setNomeCompleto("Yasmin Fadel");
        yasmin.setEndereco("Av. Atlântica, 1702 - Copacabana, Rio de Janeiro");
        yasmin.setTelefone(471212121212L);
        yasmin.setEmail("yasminfadel@bnbooking.com");
        yasmin.setDataNascimento("04/06/2004");
        salvarHospedeNaLista(yasmin);

    }

    public void salvarHospedeNaLista(Hospede h) {
        listaHospedes.add(h);
    }

    public void excluirHospedeDaLista(Hospede h) {
        listaHospedes.remove(h);
    }

    public void mostrarHospedes() {
        hospedesExistentes();
        for(Hospede h: listaHospedes) {
            JOptionPane.showMessageDialog(null, h.getNomeCompleto());
        }
    }

}
