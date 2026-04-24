# Padrão de Projeto Observer — Implementação em Java
### Trabalho Acadêmico — Design Patterns em Java

---

## 📋 Descrição do Padrão

O **Observer** é um padrão de projeto comportamental que define uma dependência um-para-muitos entre objetos: quando um objeto (Subject) muda de estado, todos os seus dependentes (Observers) são notificados e atualizados automaticamente.

**Problema que resolve:** sincronização entre objetos sem acoplamento direto. O Subject não precisa conhecer as implementações concretas dos Observers — depende apenas de uma interface abstrata.

**Referência primária:** GAMMA, E. et al. *Padrões de Projeto*. Porto Alegre: Bookman, 2000. p. 274.

---

## 🗂️ Estrutura do Projeto

```
observer/
│
├── src/
│   └── observer/
│       ├── Observer.java            # Interface Observer (contrato de atualização)
│       ├── Subject.java             # Interface Subject (contrato de notificação)
│       ├── SensorDeTemperatura.java # ConcreteSubject — mantém estado e lista de observers
│       ├── PainelGrafico.java       # ConcreteObserver 1 — exibe temperatura
│       │                            # ConcreteObserver 2 — emite alertas críticos
│       │                            # ConcreteObserver 3 — registra leituras em log
│       └── Main.java                # Classe cliente — demonstração do padrão
│
└── README.md                        # Este arquivo
```

---

## ✅ Pré-requisitos

| Ferramenta | Versão mínima | Link |
|---|---|---|
| Java JDK | 11+ | https://adoptium.net |
| Eclipse IDE | 2022-09+ | https://www.eclipse.org/downloads |

Não há dependências externas — a implementação utiliza exclusivamente a biblioteca padrão do Java (`java.util.ArrayList`, `java.time.LocalTime`).

---

## 🚀 Instruções de Compilação e Execução

### Via Eclipse IDE

1. Abra o Eclipse e vá em **File > New > Java Project**
2. Nomeie o projeto `observer-pattern`
3. Dentro de `src/`, crie o pacote `observer` (clique direito em `src` > **New > Package**)
4. Crie cada arquivo `.java` conforme a estrutura acima (clique direito no pacote > **New > Class**)
5. Cole o conteúdo de cada classe conforme o Capítulo 4 do documento acadêmico
6. Selecione `Main.java` no **Package Explorer**
7. Acesse **Run As > Java Application**
8. Observe a saída no console interno do Eclipse

### Via Linha de Comando

```bash
# Compilar todos os arquivos do pacote
javac -d out src/observer/*.java

# Executar a classe principal
java -cp out observer.Main
```

---

## 📤 Exemplo de Saída Esperada

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

**Interpretação da saída:**
- Na primeira leitura (35.5°C), todos os 3 observers são notificados normalmente
- Na segunda leitura (42.1°C), o SistemaDeAlertas emite alerta crítico (> 40°C)
- Após a remoção do PainelGrafico, a terceira leitura (38.0°C) é notificada apenas para os 2 observers restantes — sem qualquer modificação no SensorDeTemperatura

---

## 🧩 Participantes do Padrão

| Classe/Interface | Papel no Observer | Responsabilidade |
|---|---|---|
| `Observer` | Interface Observer | Define o contrato `atualizar(double)` |
| `Subject` | Interface Subject | Define `registrar`, `remover`, `notificar` |
| `SensorDeTemperatura` | ConcreteSubject | Mantém estado e notifica observers |
| `PainelGrafico` | ConcreteObserver | Exibe temperatura na tela |
| `SistemaDeAlertas` | ConcreteObserver | Emite alertas quando T > 40°C |
| `LogDeDados` | ConcreteObserver | Persiste cada leitura em log |
| `Main` | Cliente | Monta e demonstra o cenário |

---

## 📚 Referências

- GAMMA, E. et al. *Padrões de Projeto*. Porto Alegre: Bookman, 2000.
- REFACTORING.GURU. Observer. Disponível em: https://refactoring.guru/design-patterns/observer
- MARTIN, R. C. *Arquitetura Limpa*. Rio de Janeiro: Alta Books, 2019.
- ORACLE. Java SE Documentation. Disponível em: https://docs.oracle.com/en/java/javase/21/docs/api/
- ILUWATAR. java-design-patterns. GitHub. Disponível em: https://github.com/iluwatar/java-design-patterns/tree/master/observer

---

## 👥 Integrantes do Grupo

| Membro | Responsabilidade |
|---|---|
| Ana Beatriz | Factory Method 
| Evandro Portes | Facede
| Carlos Eduardo | Observer

---

*Trabalho produzido para a disciplina de Arquitetura e Construção de Software / Padrões de Projeto — [UNIPAC], [2026].*