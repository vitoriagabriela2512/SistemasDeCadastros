package br.ulbra.sistemasdecadastros;

import android.view.View;
import android.widget.Button;


public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_usuario;
    Button bt_listar_usuarios_cadastrados;
    TelaCadastroUsuario tela_cadastro;
    TelaListagemUsuarios tela_listagem;


    public TelaPrincipal(MainActivity act) {
        this.act = act;
    }


    public void CarregarTela() {
        // Define qual layout XML esta tela irá controlar
        act.setContentView(R.layout.activity_tela_principal);


        // Encontra os botões no layout através de seus IDs
        btcadastrar_usuario = (Button) act.findViewById(R.id.btcadastrar_usuario);
        bt_listar_usuarios_cadastrados = (Button) act.findViewById(R.id.bt_listar_usuarios_cadastrados);


        // Define o que acontece quando o botão de cadastrar é clicado
        btcadastrar_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chama o método para carregar a tela de cadastro
                tela_cadastro.CarregarTela();
            }
        });


        // Define o que acontece quando o botão de listar é clicado
        bt_listar_usuarios_cadastrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chama o método para carregar a tela de listagem
                tela_listagem.CarregarTela();
            }
        });
    }


    // Métodos para receber as instâncias das outras telas
    public void setTelaCadastro(TelaCadastroUsuario tela_cadastro) {
        this.tela_cadastro = tela_cadastro;
    }


    public void setTelaListagem(TelaListagemUsuarios tela_listagem) {
        this.tela_listagem = tela_listagem;
    }
}
