package view;

import controller.GerenciamentoHospedes;
import model.Hospede;

import javax.swing.*;
import java.util.List;

public class CadastrarHospede {

    public CadastrarHospede() {
        cadastrarHospede();
    }

    public void cadastrarHospede() {
        GerenciamentoHospedes gh = new GerenciamentoHospedes();

        Hospede hospede = new Hospede();
        String cpf = JOptionPane.showInputDialog("CPF (apenas números):");
        String nomeCompleto = JOptionPane.showInputDialog("Nome completo:");
        String endereco = JOptionPane.showInputDialog("Endereço:");
        long telefone = Long.parseLong(JOptionPane.showInputDialog("Telefone (apenas números):"));
        String email = JOptionPane.showInputDialog("E-mail:");
        String dataNascimento = JOptionPane.showInputDialog("Data de nascimento (dd/MM/aaaa)");

        hospede.setCPF(cpf);
        hospede.setNomeCompleto(nomeCompleto);
        hospede.setEndereco(endereco);
        hospede.setTelefone(telefone);
        hospede.setEmail(email);
        hospede.setDataNascimento(dataNascimento);

        gh.salvarHospedeNaLista(hospede);
        gh.mostrarHospedes();
    }
}
