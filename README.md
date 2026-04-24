# Design Patterns GoF — Implementações em Java
### Trabalho Acadêmico — Arquitetura e Construção de Software / Padrões de Projeto
**UNIPAC — 2026**

---

## 📖 Visão Geral

Este repositório reúne três implementações de padrões de projeto catalogados pela **Gang of Four (GoF)** em *Design Patterns: Elements of Reusable Object-Oriented Software* (GAMMA et al., 1995), desenvolvidas como trabalho acadêmico na linguagem **Java**.

| Padrão | Categoria | Cenário de Demonstração |
|---|---|---|
| [Factory Method](#-factory-method) | Criacional | Gerador de relatórios multi-formato (PDF, XLSX, HTML) |
| [Facade](#-facade) | Estrutural | Sistema de Home Theater |
| [Observer](#-observer) | Comportamental | Sensor de temperatura com múltiplos monitores |

---

## 👥 Membros do Grupo

| Membro | Responsabilidade |
|---|---|
| Ana Beatriz | Factory Method |
| Evandro Portes | Facade |
| Carlos Eduardo | Observer |

---

## ⚙️ Pré-requisitos Gerais

| Ferramenta | Versão Recomendada |
|---|---|
| Java JDK | 11 ou superior |
| Eclipse IDE | 2022-09 ou superior |
| Astah Community | 9.x (para diagramas UML) |

> Nenhum dos três módulos possui dependências externas além da biblioteca padrão do Java.

---

## 🗂️ Estrutura Geral do Repositório

```
design-patterns-gof/
│
├── factory-method/
│   ├── src/
│   │   ├── product/
│   │   │   ├── Relatorio.java
│   │   │   ├── PdfRelatorio.java
│   │   │   ├── ExcelRelatorio.java
│   │   │   └── HtmlRelatorio.java
│   │   ├── creator/
│   │   │   ├── RelatorioCreator.java
│   │   │   ├── PdfRelatorioCreator.java
│   │   │   ├── ExcelRelatorioCreator.java
│   │   │   └── HtmlRelatorioCreator.java
│   │   └── Main.java
│   └── README.md
│
├── facade/
│   ├── src/
│   │   ├── facade/
│   │   │   └── HomeTheaterFacade.java
│   │   ├── subsystem/
│   │   │   ├── Amplifier.java
│   │   │   ├── Projetor.java
│   │   │   ├── LeitorDeDVD.java
│   │   │   └── SistemaDeIluminacao.java
│   │   └── Main.java
│   └── README.md
│
├── observer/
│   ├── src/
│   │   └── observer/
│   │       ├── Observer.java
│   │       ├── Subject.java
│   │       ├── SensorDeTemperatura.java
│   │       ├── PainelGrafico.java
│   │       ├── SistemaDeAlertas.java
│   │       ├── LogDeDados.java
│   │       └── Main.java
│   └── README.md
│
└── README.md   ← este arquivo
```

---

## 🏭 Factory Method

### Descrição

O **Factory Method** define uma interface para criar objetos, mas delega às subclasses a decisão sobre qual classe instanciar. Substitui chamadas diretas ao construtor por um método de fábrica polimórfico, promovendo desacoplamento e extensibilidade.

### Participantes

| Classe/Interface | Papel |
|---|---|
| `Relatorio` | Product — contrato dos objetos criados |
| `PdfRelatorio`, `ExcelRelatorio`, `HtmlRelatorio` | ConcreteProduct — implementações concretas |
| `RelatorioCreator` | Creator — declara o Factory Method |
| `PdfRelatorioCreator`, `ExcelRelatorioCreator`, `HtmlRelatorioCreator` | ConcreteCreator — implementam o Factory Method |

### Compilação e Execução

**Eclipse IDE:**
1. `File > New > Java Project` — nome: `factory-method`
2. Criar pacotes `product` e `creator` em `src/`
3. Criar as classes conforme os Quadros do capítulo acadêmico
4. Selecionar `Main.java` > `Run As > Java Application`

**Linha de Comando:**
```bash
cd factory-method/src
javac product/*.java creator/*.java Main.java
java Main
```

### Saída Esperada

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

---

## 🏠 Facade

### Descrição

O **Facade** fornece uma **interface simplificada e unificada** para um conjunto de interfaces de um subsistema complexo, desacoplando os clientes dos componentes internos. Age como um ponto de acesso único que oculta a complexidade interna do sistema.

**Aplicabilidade:**
- Fornecer interface simples para subsistema complexo
- Desacoplar clientes de implementações internas
- Estruturar sistemas em camadas bem definidas

### Participantes

| Componente | Papel |
|---|---|
| `HomeTheaterFacade` | Facade — coordena o subsistema e expõe interface para o cliente |
| `Amplifier` | Subsistema — controle de áudio |
| `Projetor` | Subsistema — controle de vídeo |
| `LeitorDeDVD` | Subsistema — reprodução de mídia |
| `SistemaDeIluminacao` | Subsistema — controle de luz ambiente |
| `Main` | Cliente — usa apenas a Facade, sem conhecer o subsistema |

**Relacionamentos UML:**
- `Main` → `HomeTheaterFacade`: **Dependência**
- `HomeTheaterFacade` ◆→ subsistemas: **Composição**

### Compilação e Execução

**Eclipse IDE:**
1. `File > New > Java Project` — nome: `FacadePattern`
2. Criar pacotes `facade` e `subsystem` em `src/`
3. Criar cada arquivo `.java` conforme a estrutura
4. Executar: clique direito em `Main.java` > `Run As > Java Application`

**Linha de Comando:**
```bash
cd facade/src
javac subsystem/*.java facade/*.java Main.java
java Main
```

### Saída Esperada

```
=== Preparando sessão: Interestelar ===
[Iluminação] Brilho reduzido para 20%
[Projetor] Ligado.
[Projetor] Entrada definida: HDMI-1
[Amplificador] Ligado.
[Amplificador] Volume ajustado para: 8
[LeitorDeDVD] Ligado.
[LeitorDeDVD] Disco inserido: Interestelar
[LeitorDeDVD] Reproduzindo: Interestelar
=== Sessão iniciada. Aproveite o filme! ===

=== Encerrando sessão ===
[LeitorDeDVD] Reprodução encerrada.
[LeitorDeDVD] Desligado.
[Amplificador] Desligado.
[Projetor] Desligado.
[Iluminação] Brilho restaurado ao normal.
=== Sistema desligado. ===
```

---

## 👁️ Observer

### Descrição

O **Observer** define uma dependência **um-para-muitos** entre objetos: quando um objeto (*Subject*) muda de estado, todos os seus dependentes (*Observers*) são notificados e atualizados automaticamente, sem acoplamento direto entre eles.

### Participantes

| Classe/Interface | Papel | Responsabilidade |
|---|---|---|
| `Observer` | Interface Observer | Define o contrato `atualizar(double)` |
| `Subject` | Interface Subject | Define `registrar`, `remover`, `notificar` |
| `SensorDeTemperatura` | ConcreteSubject | Mantém estado e notifica observers |
| `PainelGrafico` | ConcreteObserver | Exibe temperatura na tela |
| `SistemaDeAlertas` | ConcreteObserver | Emite alertas quando temperatura > 40°C |
| `LogDeDados` | ConcreteObserver | Persiste cada leitura em log com timestamp |
| `Main` | Cliente | Monta e demonstra o cenário |

### Compilação e Execução

**Eclipse IDE:**
1. `File > New > Java Project` — nome: `observer-pattern`
2. Criar pacote `observer` em `src/`
3. Criar cada arquivo `.java` conforme a estrutura
4. Selecionar `Main.java` > `Run As > Java Application`

**Linha de Comando:**
```bash
# Compilar todos os arquivos do pacote
javac -d out observer/src/observer/*.java

# Executar
java -cp out observer.Main
```

### Saída Esperada

```
[Sensor] Nova leitura: 35.5°C
[Painel] Temperatura exibida: 35.5°C
[Alertas] Temperatura normal: 35.5°C
[Log] Registro salvo: 35.5°C em 14:23:07.841

[Sensor] Nova leitura: 42.1°C
[Painel] Temperatura exibida: 42.1°C
[ALERTA] Temperatura crítica: 42.1°C!
[Log] Registro salvo: 42.1°C em 14:23:07.843

[Sistema] Removendo painel gráfico...
[Sensor] Nova leitura: 38.0°C
[Alertas] Temperatura normal: 38.0°C
[Log] Registro salvo: 38.0°C em 14:23:07.845
```

> Na terceira leitura, após a remoção do `PainelGrafico`, apenas os 2 observers restantes são notificados — sem qualquer modificação no `SensorDeTemperatura`.

---

## 📚 Referências

- GAMMA, E. et al. *Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos*. Porto Alegre: Bookman, 2000.
- MARTIN, R. C. *Arquitetura Limpa: O Guia do Artesão para Estrutura e Design de Software*. Rio de Janeiro: Alta Books, 2019.
- REFACTORING.GURU. *Design Patterns*. Disponível em: https://refactoring.guru/design-patterns
- ILUWATAR. *java-design-patterns*. GitHub: https://github.com/iluwatar/java-design-patterns
- ORACLE. *Java SE Documentation*. Disponível em: https://docs.oracle.com/en/java/javase/

---

*Trabalho produzido para a disciplina de Arquitetura e Construção de Software / Padrões de Projeto — UNIPAC, 2026.*
