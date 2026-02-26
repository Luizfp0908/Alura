# 🚀 De Lógica a Arquitetura de APIs

Este repositório contém a evolução dos meus estudos em Java, abrangendo desde a lógica essencial até a implementação de padrões de projeto voltados para o consumo de APIs REST.

---

## 📂 Projetos em Destaque

### 🌐 3. Multi-API Consumer (Novo!)
Um framework modular para consulta de múltiplos serviços web via protocolo HTTP.
* **O que faz:** Realiza buscas em tempo real no **Google Books**, **CoinGecko** (Cripto) e **TheMealDB** (Receitas).
* **Destaques Técnicos:**
    * **Abstração & Herança:** Classe mãe `Request` centraliza a lógica de conexão (`HttpClient`).
    * **Polimorfismo:** Uso de referências genéricas para instanciar diferentes APIs em tempo de execução via `switch case`.
    * **Resiliência:** Tratamento de exceções e manipulação de strings para URLs seguras.



### 🎬 2. ScreenMatch
Catálogo de títulos de entretenimento focado em OO.
* **O que faz:** Gerencia filmes e séries, calculando médias e classificações.
* **Destaques Técnicos:** **Encapsulamento** rigoroso e modelagem de classes para representar entidades do mundo real.

### 💳 1. Gerenciador de Compras
Aplicação de controle financeiro via console.
* **O que faz:** Gerencia o limite de um cartão de crédito e ordena o extrato de compras.
* **Destaques Técnicos:** Manipulação de coleções com `ArrayList` e algoritmos de ordenação com `Comparable`.

---

## 🛠️ Stack Tecnológica

* **Linguagem:** Java 17/24 (OpenJDK)
* **Bibliotecas:** `java.net.http` (HttpClient), `java.util` (Collections/List)
* **Conceitos de Engenharia:**
    * POO Avançada (Herança, Polimorfismo, Classes Abstratas)
    * Consumo de APIs REST (JSON)
    * Princípios DRY (*Don't Repeat Yourself*)



---

## 🚀 Como Executar

1. Clone o repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Importe o projeto no **IntelliJ IDEA**.
3. Navegue até o pacote `APIS` e execute a classe `Main.java` para testar o novo buscador de APIs.

---

**Luiz Francisco**
*Estudante de Engenharia de Software - 5º Período na Unicesumar*
