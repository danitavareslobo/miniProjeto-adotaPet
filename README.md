# 🐾 AdotaPet 
<div align="center">

**Sistema de Gestão de Adoções** 

[![Java](https://img.shields.io/badge/Java-24-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2024.3-gradient?style=for-the-badge&logo=intellij-idea&logoColor=white&color=000000&labelColor=ff0080)](https://www.jetbrains.com/idea/)

</div>

Sistema back-end desenvolvido em Java para automatização dos processos de uma ONG dedicada à proteção animal. O projeto facilita a gestão completa do ciclo de adoções, desde o cadastro de animais resgatados até a vinculação com famílias adotantes qualificadas.

O **AdotaPet** é uma solução completa para ONGs de proteção animal que precisam gerenciar:
- Cadastro e controle de animais disponíveis para adoção
- Gestão de perfis de potenciais adotantes
- Processo completo de adoção com controle de documentação

O sistema foi desenvolvido como um mini-projeto educacional aplicando conceitos fundamentais da Programação Orientada a Objetos.

## ⚡ Funcionalidades

### 🏠 Gestão de Adotantes
- ✅ Cadastro de novos adotantes
- ✅ Edição de perfis existentes
- ✅ Ativação/desativação de adotantes
- ✅ Listagem com relatórios detalhados
- ✅ Validação de dados obrigatórios

### 🐕 Gestão de Animais
- ✅ Cadastro de cães e gatos
- ✅ Informações específicas por espécie
- ✅ Controle de status (Disponível/Indisponível/Adotado)
- ✅ Remoção segura (com validações)
- ✅ Relatórios personalizados por tipo

### 💝 Gestão de Adoções
- ✅ Geração de processos de adoção
- ✅ Validação de elegibilidade (adotante + animal)
- ✅ Controle de assinatura de termos
- ✅ Histórico completo de adoções
- ✅ Separação entre processos pendentes e concluídos

## 🛠 Tecnologias Utilizadas

- **Java 24** - Linguagem principal
- **IntelliJ IDEA** - IDE de desenvolvimento
- **Scanner** - Interface de linha de comando
- **Collections Framework** - Gerenciamento de dados em memória

## 🏗 Arquitetura

O projeto segue os princípios da **Programação Orientada a Objetos**:

### Classes Principais
```
📦 model/
├── 🔸 Animal.java (Classe Abstrata)
├── 🐕 Cao.java (Herda de Animal)
├── 🐱 Gato.java (Herda de Animal)
├── 👤 Adotante.java
└── 📄 Adocao.java
```

### Interfaces
```
📦 model/
├── ✅ Validavel.java (Validação de dados)
└── 📊 Relatorio.java (Geração de relatórios)
```

### Classe Principal
```
📄 Main.java (Interface do usuário + Lógica de negócio)
```

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior
- IntelliJ IDEA (recomendado) ou qualquer IDE Java

### Passos
1. **Clone o repositório**
   ```bash
   git clone https://github.com/danitavareslobo/miniProjeto-adotaPet.git
   ```

2. **Abra o projeto**
   - Abra o IntelliJ IDEA
   - File → Open → Selecione a pasta do projeto

3. **Execute o projeto**
   - Navegue até `src/Main.java`
   - Clique com botão direito → Run 'Main.main()'
   - Ou use o atalho `Ctrl + Shift + F10`

4. **Interaja com o sistema**
   - Use o menu interativo no console
   - Siga as instruções na tela

## 📁 Estrutura do Projeto

```
miniProjeto-adotaPet/
│
├── 📁 .idea/                 # Configurações do IntelliJ
├── 📁 out/                   # Arquivos compilados
├── 📁 src/                   # Código fonte
│   ├── 📁 model/             # Classes do modelo
│   │   ├── Animal.java       # Classe abstrata base
│   │   ├── Cao.java          # Especialização para cães
│   │   ├── Gato.java         # Especialização para gatos
│   │   ├── Adotante.java     # Dados dos adotantes
│   │   ├── Adocao.java       # Processo de adoção
│   │   ├── Validavel.java    # Interface de validação
│   │   └── Relatorio.java    # Interface de relatórios
│   └── Main.java             # Classe principal
├── adotaPet.iml              # Arquivo do módulo IntelliJ
├── .gitignore                # Arquivos ignorados pelo Git
└── README.md                 # Este arquivo
```

## 🔄 Fluxo de Uso

### Cenário Típico de Uso

1. **Preparação**
   ```
   Menu Principal → [1] Gestão de Adotantes
   → Cadastrar alguns adotantes
   ```

2. **Cadastro de Animais**
   ```
   Menu Principal → [2] Gestão de Animais
   → Adicionar cães e gatos disponíveis
   ```

3. **Processo de Adoção**
   ```
   Menu Principal → [3] Gestão de Adoções
   → [1] Gerar Adoção (vincular adotante + animal)
   → [2] Realizar Adoção (assinar termo)
   → [3] Listar Adoções (acompanhar status)
   ```

### Exemplo Prático
```bash
# 1. Cadastrar adotante
Nome: Maria Silva
CPF: 123.456.789-00
Endereço: Rua das Flores, 123
Preferências: Cães de pequeno porte

# 2. Cadastrar animal
ID: C001
Nome: Rex
Idade: 3
Porte: Pequeno
Necessita passeio: true

# 3. Gerar adoção
CPF do adotante: 123.456.789-00
ID do animal: C001
✅ Adoção gerada com sucesso!

# 4. Realizar adoção
ID da adoção: A001
✅ Termo assinado - Adoção concluída!
```

## 🎓 Conceitos Aplicados

### Programação Orientada a Objetos

- **🔸 Herança**: `Cao` e `Gato` herdam de `Animal`
- **🔸 Polimorfismo**: Métodos `gerarRelatorio()` personalizados
- **🔸 Abstração**: Classe `Animal` abstrata
- **🔸 Encapsulamento**: Atributos privados com getters/setters
- **🔸 Interfaces**: `Validavel` e `Relatorio` implementadas

### Boas Práticas

- **✅ Validação de Dados**: Verificação de CPF/ID duplicados
- **✅ Tratamento de Exceções**: InputMismatchException
- **✅ Código Limpo**: Métodos com responsabilidade única
- **✅ Experiência do Usuário**: Menus intuitivos e mensagens claras

### Estruturas de Dados

- **📋 ArrayList**: Gerenciamento dinâmico de listas
- **🔍 Busca Linear**: Localização de registros por ID/CPF
- **📊 Classificação**: Separação de dados por categoria

### Ideias para expansão:
- 💾 Persistência em banco de dados
- 🌐 Interface web com Spring Boot
- 📱 API REST para aplicativo mobile
- 📈 Dashboard com estatísticas
- 📧 Sistema de notificações por email

---

## 👨‍💻 Autor

**Daniele Tavares Lobo**
- GitHub: [@danitavareslobo](https://github.com/danitavareslobo)
- LinkedIn: [Daniele Tavares Lobo](https://linkedin.com/in/danitavareslobo)
- Email: danitavares.dev@gmail.com

---

<div align="center">

**💜 Desenvolvido com carinho para ajudar nossos amigos de quatro patas! 🐕🐱**

[⬆ Voltar ao topo](#-adotapet)

</div>

