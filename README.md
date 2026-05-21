# 👥 Sistema de Cadastro de Usuários Mobile

## 📱 Descrição do Projeto

O Sistema de Cadastro de Usuários é um aplicativo Android desenvolvido em Java no Android Studio que permite realizar o cadastro e a visualização de usuários em memória.

A aplicação possui múltiplas telas e permite:

- cadastrar usuários
- armazenar dados temporariamente
- visualizar usuários cadastrados
- navegar entre registros

O projeto foi desenvolvido como atividade prática da disciplina de Desenvolvimento Mobile utilizando conceitos de orientação a objetos, manipulação de telas e interfaces gráficas modernas com Material Design.

---

# 🚀 Funcionalidades

✅ Cadastro de usuários

✅ Armazenamento de registros em memória

✅ Listagem dos usuários cadastrados

✅ Navegação entre registros

✅ Interface moderna utilizando Material Design

✅ AlertDialog para mensagens do sistema

✅ Organização dos dados utilizando classe modelo

✅ Navegação entre telas

✅ Interface responsiva

---

# 📋 Dados Cadastrados

Cada usuário cadastrado possui:

| Campo | Tipo |
|---|---|
| Nome | Texto |
| Telefone | Texto |
| Endereço | Texto |

---

# 🧠 Estrutura do Sistema

O aplicativo foi dividido em várias classes para melhor organização:

| Classe | Responsabilidade |
|---|---|
| MainActivity | Controla toda a aplicação |
| Registro | Modelo de dados |
| TelaPrincipal | Menu principal |
| TelaCadastroUsuario | Cadastro de usuários |
| TelaListagemUsuarios | Visualização dos registros |

---

# 🧮 Funcionamento da Aplicação

## Tela Principal

A tela inicial apresenta duas opções:

- Cadastrar Novo Usuário
- Listar Usuários Cadastrados

---

## Tela de Cadastro

Permite informar:

- Nome
- Telefone
- Endereço

Após clicar em:

```text id="ekv6x8"
Cadastrar

O sistema:

cria um novo objeto Registro
salva na lista ArrayList
retorna ao menu principal
Tela de Listagem

Permite:

visualizar usuários cadastrados
navegar entre os registros
exibir status da posição atual

Botões disponíveis:

Botão	Função
Anterior	Volta um registro
Próximo	Avança um registro
Fechar	Retorna ao menu principal
🧠 Modelo de Dados

A classe Registro representa cada usuário cadastrado.

Ela armazena:

nome
telefone
endereço
🧮 Estrutura de Armazenamento

Os usuários são armazenados utilizando:

ArrayList<Registro>

A lista permanece disponível enquanto o aplicativo estiver aberto.

🖥️ Interface do Aplicativo
Componentes Utilizados
TextView

Utilizado para títulos e exibição de informações.

TextInputEditText

Utilizado para entrada de dados do usuário.

MaterialButton

Botões modernos do Material Design.

MaterialCardView

Exibição visual organizada dos registros.

AlertDialog

Mensagens e confirmações do sistema.

ConstraintLayout

Responsável pelo posicionamento responsivo dos componentes.

🛠️ Tecnologias Utilizadas
Tecnologia	Utilização
Java	Lógica da aplicação
XML	Interface gráfica
Android Studio	Desenvolvimento
Material Design	Interface moderna
ArrayList	Armazenamento dos registros
AlertDialog	Mensagens do sistema
📂 Estrutura do Projeto
SistemasDeCadastros/

│

├── app/

│

├── java/br/ulbra/sistemasdecadastros/

│   │

│   ├── MainActivity.java

│   ├── Registro.java

│   ├── TelaPrincipal.java

│   ├── TelaCadastroUsuario.java

│   ├── TelaListagemUsuarios.java

│

├── res/

│   │

│   ├── layout/

│   │   ├── tela_principal.xml

│   │   ├── cadastro_de_usuarios.xml

│   │   └── listagem_usuarios_cadastrados.xml

│   │

│   └── values/

│       └── strings.xml

│

├── AndroidManifest.xml

│

├── build.gradle

│

└── README.md

✅ Requisitos Funcionais

✔ Cadastrar usuários

✔ Listar usuários cadastrados

✔ Navegar entre registros

✔ Exibir mensagens do sistema

✔ Armazenar registros em memória

✔ Retornar ao menu principal

✔ Interface moderna

▶️ Como Executar o Projeto
Requisitos
Android Studio
Java JDK
Emulador Android ou celular físico
Passos
Abra o Android Studio
Clique em:
Open Project
Selecione a pasta do projeto
Aguarde o Gradle sincronizar
Execute o aplicativo clicando em:
Run ▶
Escolha um dispositivo Android
📸 Exemplo de Uso
Cadastro

Usuário informa:

Nome: João Silva
Telefone: (51) 99999-9999
Endereço: Rua Central, 100
Resultado
Cadastro efetuado com sucesso.
Visualização
Nome: João Silva
Telefone: (51) 99999-9999
Endereço: Rua Central, 100
📚 Conceitos Trabalhados

Durante o desenvolvimento deste projeto foram utilizados conceitos importantes de Android:

Orientação a Objetos
Classes Java
ArrayList
Manipulação de telas
Material Design
Eventos de clique
AlertDialog
ConstraintLayout
Navegação entre interfaces
Organização de código
Estrutura MVC simplificada
👨‍💻 Autor

Desenvolvido por Vitória Gabriela Fernandes da Luz
