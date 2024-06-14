# Projeto E2E Talks - Automação de Testes

Este projeto é utilizado para os desafios do E2E Talks e foi desenvolvido em Java, utilizando Selenium e JUnit, seguindo o padrão Page Objects.

## Visão Geral

O objetivo deste projeto é fornecer uma estrutura básica para automação de testes, utilizando as tecnologias Java, Selenium e JUnit, e seguindo as práticas recomendadas de design de automação de testes, como o padrão Page Objects.

## Tecnologias Utilizadas

- Java
- Selenium
- JUnit

## Configuração do Ambiente

Para executar este projeto localmente, você precisará ter o Java Development Kit (JDK) instalado em sua máquina. Além disso, certifique-se de ter o Maven configurado em seu ambiente.

### Instruções Detalhadas para Configuração do Ambiente

1. **Instalar o JDK**: Baixe e instale o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) na sua máquina, se ainda não o tiver.
2. **Configurar o Maven**: Se você ainda não tem o Maven configurado, siga as [instruções de instalação](https://maven.apache.org/install.html) no site oficial do Maven.
3. **Clonar o Repositório**: Clone este repositório em sua máquina local usando o comando `git clone`.
4. **Abrir o Projeto na IDE**: Abra o projeto em sua IDE preferida (por exemplo, IntelliJ IDEA, Eclipse).
5. **Baixar Dependências do Maven**: Certifique-se de que todas as dependências do Maven foram baixadas. Você pode fazer isso executando o comando `mvn clean install` no diretório raiz do projeto.


## Executando os Testes

Para executar os testes, você pode usar sua IDE para executar os testes JUnit ou executar o Maven na linha de comando.

### Usando Maven

Para executar os testes usando Maven na linha de comando, use o seguinte comando:

```bash
mvn test -Dtest=Execute

