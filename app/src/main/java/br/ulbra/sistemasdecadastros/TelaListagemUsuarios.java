package br.ulbra.sistemasdecadastros;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TelaListagemUsuarios {
    MainActivity act;
    TelaPrincipal tela_principal;
    Button btanterior, btproximo, btfechar;
    TextView txtnome, txttelefone, txtendereco, txtstatus;


    int index; // Variável para controlar qual registro está sendo exibido


    public TelaListagemUsuarios(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
    }


    public void CarregarTela() {
        // Antes de carregar a tela, verifica se existe algum registro
        if (act.getRegistros().size() == 0) {
            new AlertDialog.Builder(act)
                    .setTitle("Aviso")
                    .setMessage("Não existe nenhum registro cadastrado.")
                    .setNeutralButton("OK", null)
                    .show();
            return; // Interrompe a execução para não carregar a tela vazia
        }


        // Se existem registros, inicia o índice no primeiro (posição 0)
        index = 0;


        act.setContentView(R.layout.activity_tela_listagem_usuarios);
        btanterior = (Button) act.findViewById(R.id.btanterior);
        btproximo = (Button) act.findViewById(R.id.btproximo);
        btfechar = (Button) act.findViewById(R.id.btfechar);
        txtnome = (TextView) act.findViewById(R.id.txtnome);
        txtendereco = (TextView) act.findViewById(R.id.txtendereco);
        txttelefone = (TextView) act.findViewById(R.id.txttelefone);
        txtstatus = (TextView) act.findViewById(R.id.txtstatus);


        // Exibe o primeiro registro na tela
        PreencheCampos(index);
        AtualizaStatus(index);


        btanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index > 0) {
                    index--; // Decrementa o índice
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });


        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < act.getRegistros().size() - 1) {
                    index++; // Incrementa o índice
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });


        btfechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_principal.CarregarTela(); // Volta para o menu
            }
        });
    }


    private void PreencheCampos(int idx) {
        Registro registro = act.getRegistros().get(idx);
        txtnome.setText("Nome: " + registro.getNome());
        txttelefone.setText("Telefone: " + registro.getTelefone());
        txtendereco.setText("Endereço: " + registro.getEndereco());
    }


    private void AtualizaStatus(int idx) {
        int total = act.getRegistros().size();
        txtstatus.setText("Registros: " + (idx + 1) + "/" + total);
    }
}
