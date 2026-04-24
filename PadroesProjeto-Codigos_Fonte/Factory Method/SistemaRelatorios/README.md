# Design Patterns GoF — Factory Method em Java
### Trabalho Acadêmico — Design Patterns em Java

## Descrição do Padrão

O **Factory Method** é um padrão de projeto criacional que define uma interface para criar objetos, mas permite que subclasses decidam quais classes instanciar. O padrão substitui chamadas diretas ao construtor por um método de fábrica polimórfico, promovendo desacoplamento e extensibilidade.

**Participantes:**

- `Relatorio` (Product): interface que define o contrato dos objetos criados.
- `PdfRelatorio`, `ExcelRelatorio`, `HtmlRelatorio` (ConcreteProduct): implementações.
- `RelatorioCreator` (Creator): declara o Factory Method e o algoritmo de negócio.
- `PdfRelatorioCreator`, `ExcelRelatorioCreator`, `HtmlRelatorioCreator` (ConcreteCreator).

## Estrutura do Projeto

```
factory-method/
├── src/
│   ├── product/
│   │   ├── Relatorio.java
│   │   ├── PdfRelatorio.java
│   │   ├── ExcelRelatorio.java
│   │   └── HtmlRelatorio.java
│   ├── creator/
│   │   ├── RelatorioCreator.java
│   │   ├── PdfRelatorioCreator.java
│   │   ├── ExcelRelatorioCreator.java
│   │   └── HtmlRelatorioCreator.java
│   └── Main.java
└── README.md
```

## Pré-requisitos

- Java SE 11 ou superior
- Eclipse IDE for Java Developers (2023-09+) ou IntelliJ IDEA
- (Opcional) Maven 3.8+ para build automatizado

## Instruções para Compilação e Execução

### Eclipse IDE

1. `File > New > Java Project` — nome: `factory-method`
2. Criar pacotes `product` e `creator` em `src/`
3. Criar as classes conforme os Quadros 1–5 do capítulo
4. Selecionar `Main.java` > `Run As > Java Application`

### Linha de Comando (javac)

```bash
cd factory-method/src
javac product/*.java creator/*.java Main.java
java Main
```

## Exemplo de Saída Esperada

```
=== Iniciando processamento: Vendas_Q2_2025 ===
[PDF] Gerando relatório: Vendas_Q2_2025
[PDF] Conteúdo: Total: R$ 1.250.000 │ Crescimento: 18%
[PDF] Arquivo salvo: Vendas_Q2_2025.pdf
=== Relatório [.pdf] concluído. ===

=== Iniciando processamento: Vendas_Q2_2025 ===
[XLSX] Gerando planilha: Vendas_Q2_2025
[XLSX] Dados: Total: R$ 1.250.000 │ Crescimento: 18%
[XLSX] Arquivo salvo: Vendas_Q2_2025.xlsx
=== Relatório [.xlsx] concluído. ===

=== Iniciando processamento: Vendas_Q2_2025 ===
[HTML] Gerando página: Vendas_Q2_2025
[HTML] Conteúdo: <p>Total: R$ 1.250.000 │ Crescimento: 18%</p>
[HTML] Arquivo salvo: Vendas_Q2_2025.html
=== Relatório [.html] concluído. ===
```

## Referências

- GAMMA et al. *Padrões de Projeto*. Bookman, 2000.
- REFACTORING.GURU. <https://refactoring.guru/design-patterns/factory-method>
- MARTIN, R. C. *Arquitetura Limpa*. Alta Books, 2019.
- ORACLE. Java SE 17 Docs. <https://docs.oracle.com/en/java/javase/17/>
- ILUWATAR. java-design-patterns. <https://github.com/iluwatar/java-design-patterns>

## 👥 Membros do Grupo

| Membro | Responsabilidade |
|---|---|
| Ana Beatriz | Factory Method 
| Evandro Portes | Facede
| Carlos Eduardo | Observer

---

*Trabalho produzido para a disciplina de Arquitetura e Construção de Software / Padrões de Projeto — [UNIPAC], [2026].*