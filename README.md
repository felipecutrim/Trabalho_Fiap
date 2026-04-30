# 📊 Fintech MeuControle - Evolução e Base para Análise de Dados

**MeuControle** é um sistema financeiro evolutivo, desenvolvido como parte do Trabalho da FIAP. O objetivo principal desta aplicação não é apenas fornecer uma interface amigável, mas **estruturar uma base de dados sólida e padronizada** para futura extração de insights, métricas e análise de dados (Data Analytics).

---

## 🚀 O Projeto

Este projeto foi construído em fases para demonstrar a evolução de uma interface estática para um sistema back-end robusto orientado a objetos, capaz de persistir e organizar dados relacionais.

### Fase 1: Interface Front-End
A fase inicial concentrou-se na construção da interface do usuário (UI) focada em usabilidade e responsividade.
* **Tecnologias:** HTML5, CSS3, Bootstrap.
* **Localização:** Pasta `/frontend`.

### Fase 2: Back-End e Engenharia de Dados (Java & Oracle)
Nesta segunda fase, o projeto ganhou sua inteligência. Toda a lógica de negócios, o mapeamento objeto-relacional e as conexões com o banco de dados Oracle foram desenvolvidos. Essa camada é a **responsável por capturar, tratar e armazenar os dados de forma estruturada**, garantindo que fiquem prontos para consumo analítico.
* **Tecnologias:** Java (Orientação a Objetos), Padrão DAO, JDBC, Banco de Dados Oracle.
* **Estrutura:** 
  * `Usuario`, `Conta`, `Transacao`, `Categoria`, `Receita`, `Despesa`.
  * Classes estruturadas para facilitar consultas e extrações (ETL).
* **Localização:** Pasta `/backend-java`.

---

## 📁 Estrutura do Repositório

```text
/
├── backend-java/   # Camada lógica, classes DAO, Models e conexões com o Oracle Database
├── database/       # Scripts SQL e documentações de modelagem de dados
├── frontend/       # Interface de usuário (telas de cadastro e visualização)
└── README.md       # Esta documentação
```

---

## 📈 Próximos Passos (Data Analytics)

Como o sistema agora possui um back-end funcional e um banco de dados relacional estruturado, as próximas etapas focarão na extração de valor e inteligência desses dados:

1. **Métricas Financeiras:** Criação de queries SQL complexas para cálculo de KPIs (indicadores-chave de desempenho), como taxa de poupança mensal e média de gastos por categoria.
2. **Dashboards Interativos:** Conexão do banco de dados (ou exportação de datasets) para ferramentas como **Power BI** ou **Streamlit** (Python) para criar painéis visuais.
3. **Geração de Insights:** Uso de bibliotecas de análise (ex: Pandas, Plotly) para identificar padrões de comportamento financeiro, sazonalidade de gastos e previsões (forecasting).

---

## 🛠️ Como Executar

### Pré-requisitos
- JDK 11 ou superior instalado.
- Banco de Dados Oracle configurado (ou acesso ao Oracle cloud).
- IDE (IntelliJ IDEA, Eclipse ou VSCode).

### Configuração
1. Navegue até a pasta `/backend-java`.
2. Edite o arquivo `ConnectionFactory.java` (em `src/br/com/meucontrole/dao/`) e insira as credenciais do seu banco Oracle nas constantes correspondentes (substituindo `SEU_USUARIO` e `SUA_SENHA`).
3. Compile e execute as classes de teste.
