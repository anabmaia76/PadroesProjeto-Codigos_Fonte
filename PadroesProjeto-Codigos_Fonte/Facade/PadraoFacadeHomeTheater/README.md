# Padrão de Projeto — Facade (GoF)
### Trabalho Acadêmico — Design Patterns em Java

---

## 📋 Descrição do Padrão

O **Facade** é um padrão de projeto estrutural catalogado pela Gang of Four (GoF) em *Design Patterns: Elements of Reusable Object-Oriented Software* (GAMMA et al., 1995). Ele fornece uma **interface simplificada e unificada** para um conjunto de interfaces de um subsistema complexo, desacoplando os clientes dos componentes internos.

**Problema que resolve:** quando um sistema possui um subsistema com muitas classes inter-relacionadas, o código-cliente se torna altamente acoplado e difícil de manter. A Facade age como uma "fachada" — um ponto de acesso único que oculta a complexidade interna.

**Aplicabilidade:**
- Fornecer interface simples para subsistema complexo
- Desacoplar clientes de implementações internas
- Estruturar sistemas em camadas bem definidas

---

## 🗂️ Estrutura do Projeto

```
FacadePattern/
│
├── src/
│   ├── facade/
│   │   └── HomeTheaterFacade.java     ← Classe Facade (interface simplificada)
│   │
│   ├── subsystem/
│   │   ├── Amplifier.java             ← Classe de subsistema
│   │   ├── Projetor.java              ← Classe de subsistema
│   │   ├── LeitorDeDVD.java           ← Classe de subsistema
│   │   └── SistemaDeIluminacao.java   ← Classe de subsistema
│   │
│   └── Main.java                      ← Classe cliente (ponto de entrada)
│
└── README.md
```

**Papéis dos componentes:**

| Componente | Papel |
|---|---|
| `HomeTheaterFacade` | Facade — coordena o subsistema, interface para o cliente |
| `Amplifier`, `Projetor`, `LeitorDeDVD`, `SistemaDeIluminacao` | Classes de subsistema — implementam a funcionalidade real |
| `Main` | Cliente — usa apenas a Facade, sem conhecer o subsistema |

---

## ⚙️ Pré-requisitos

| Ferramenta | Versão Recomendada |
|---|---|
| Java JDK | 11 ou superior |
| Eclipse IDE | 2022-09 ou superior |
| Astah Community | 9.x (para diagrama UML) |

---

## 🚀 Instruções de Compilação e Execução

### Via Eclipse IDE

1. Abra o Eclipse e acesse **File > New > Java Project**
2. Nomeie o projeto como `FacadePattern` e clique em **Finish**
3. Dentro de `src`, crie os pacotes:
   - Clique direito em `src` > **New > Package** → `facade`
   - Clique direito em `src` > **New > Package** → `subsystem`
4. Crie cada arquivo `.java` conforme a estrutura acima:
   - Clique direito no pacote correspondente > **New > Class**
   - Copie o código de cada classe do capítulo do trabalho
5. Crie `Main.java` na raiz de `src` (sem pacote)
6. Execute: clique direito em `Main.java` > **Run As > Java Application**

### Via Linha de Comando (Terminal)

```bash
# 1. Crie a estrutura de diretórios
mkdir -p FacadePattern/src/facade
mkdir -p FacadePattern/src/subsystem

# 2. Copie os arquivos .java para os diretórios correspondentes

# 3. Compile (a partir de FacadePattern/src/)
cd FacadePattern/src
javac subsystem/*.java facade/*.java Main.java

# 4. Execute
java Main
```

---

## 📤 Exemplo de Saída Esperada

Ao executar `Main.java`, a saída no console deve ser:

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

## 📐 Diagrama UML

O diagrama de classes UML do padrão pode ser reproduzido no **Astah Community** seguindo as instruções detalhadas na **Seção 3.7** do capítulo acadêmico (`facade_capitulo.docx`).

**Resumo dos relacionamentos:**
- `Main` → `HomeTheaterFacade`: **Dependência** (seta tracejada)
- `HomeTheaterFacade` ◆→ `Amplifier`: **Composição**
- `HomeTheaterFacade` ◆→ `Projetor`: **Composição**
- `HomeTheaterFacade` ◆→ `LeitorDeDVD`: **Composição**
- `HomeTheaterFacade` ◆→ `SistemaDeIluminacao`: **Composição**

---

## 📚 Referências

- GAMMA, E. et al. *Padrões de Projeto*. Porto Alegre: Bookman, 2000.
- MARTIN, R. C. *Arquitetura Limpa*. Rio de Janeiro: Alta Books, 2019.
- REFACTORING.GURU. *Facade*. Disponível em: https://refactoring.guru/design-patterns/facade
- ILUWATAR. *java-design-patterns*. GitHub: https://github.com/iluwatar/java-design-patterns/tree/master/facade
- ORACLE. *JavaServer Faces Technology*. https://docs.oracle.com/javaee/7/tutorial/jsf-intro.htm

---

## 👥 Membros do Grupo

| Membro | Responsabilidade |
|---|---|
| Ana Beatriz | Factory Method 
| Evandro Portes | Facede
| Carlos Eduardo | Observer

---

*Trabalho produzido para a disciplina de Arquitetura e Construção de Software / Padrões de Projeto — [UNIPAC], [2026].*
