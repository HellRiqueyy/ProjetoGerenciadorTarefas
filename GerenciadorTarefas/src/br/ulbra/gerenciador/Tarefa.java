package br.ulbra.gerenciador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;

public class Tarefa {

    private ArrayList tarefa;

    public Tarefa() {
        tarefa = new ArrayList();
    }

    public void adicionar(String tarefa) {
        this.tarefa.add(tarefa);
        JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
    }

    public void remover(int indice) {
        if (tarefa.isEmpty() || (indice - 1) > tarefa.size()) {
            JOptionPane.showMessageDialog(null, "Tarefa inesistente");
        } else {
            tarefa.remove(indice - 1);
            JOptionPane.showMessageDialog(null, "Exterminio com sucesso!");
        }
    }

    public void alterar(int indice, String tarefa) {
        if (this.tarefa.isEmpty() || (indice - 1) > this.tarefa.size()) {
            JOptionPane.showMessageDialog(null, "Tarefa inesistente");
        } else {
            this.tarefa.set((indice - 1), tarefa);
            JOptionPane.showMessageDialog(null, "Tarefa alterada!");
        }
    }

    public void removerTudo() {

        int i = JOptionPane.showConfirmDialog(null, "Desejar exterminar todas as tarefas?");
        if (i == JOptionPane.YES_OPTION && !tarefa.isEmpty()) {
            tarefa.removeAll(tarefa);
            abrirJanela();
        }else{
            JOptionPane.showMessageDialog(null,"Lista de tarefas está vazia!");
        }
    }

    public String mostrarLista() {
        String lista = "Lista de tarefas\n";
        if (tarefa.isEmpty()) {
            lista = "Lista de tarefas Vazia!";
        } else {
            for (int i = 0; i < tarefa.size(); i++) {
                lista += (i + 1) + ". " + tarefa.get(i) + "\n";
            }
        }
        return lista;
    }

    public void ordenar() {
        Collections.sort(tarefa);
    }

    private void abrirJanela() {
        FrPopUp janela = new FrPopUp();
    }

}
