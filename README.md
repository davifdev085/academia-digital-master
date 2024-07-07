# Conhecendo o Projeto Spring Data JPA na Prática

Projeto de LAB oferecido gratuitamente pela [Digital Innovation One](https://dio.me/).

## 🎯 Objetivo

Conhecer os conceitos de mapeamento objeto-relacional (ORM) usando **Spring Data JPA** através do desenvolvimento de uma **API RESTful** para modelagem de entidades de uma academia de ginástica.

## 🛑 Pré-requisitos

- Fundamentos do Spring Boot
- Noções de SQL

## 🚦 Guia

1. Apresentação do Projeto Base
2. Configuração do banco de dados (**PostgreSQL**)
3. Aplicação das **annotations**
4. Fluxo back-end: **Controller - Service - Repository**
5. Validação com **Hibernate Validator**
6. Consultas Avançadas: **Derived Query - Native Query**

## 🛠 Tecnologias Utilizadas

- IDE IntelliJ
- Java 11
- Maven
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL Driver**
- **Hibernate Validator**
- Lombok
- Postman

## 📖 Anotações de Mapeamento

- **@Entity**: Marca a classe como entidade.
- **@Table**: Define a tabela principal da entidade.
- **@Id**: Especifica o identificador da entidade.
- **@GeneratedValue**: Gera automaticamente o valor do identificador.
- **@Column**: Mapeia um atributo de entidade para uma coluna de tabela.
- **@JoinColumn**: Define a coluna de FOREIGN KEY.
- **@OneToMany**: Relacionamento um-para-muitos.
- **@OneToOne**: Relacionamento um-para-um.
- **@ManyToOne**: Relacionamento muitos-para-um.
- **cascade**: Operações em cascata.
- **mappedBy**: Indica o lado inverso da relação.

## 🔗 Links Úteis

- [Spring Initializr](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.1&packaging=jar&jvmVersion=11&groupId=me.dio.academia&artifactId=academia-digital&name=academia-digital&description=Tutorial%20API%20RESTful%20modelando%20sistema%20de%20academia%20de%20gin%C3%A1stica&packageName=me.dio.academia.digital&dependencies=web,data-jpa,postgresql,validation,lombok)
- [Common application properties](https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/common-application-properties.html)
- [Spring Data JPA - Reference Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.repositories)
- [Validation Reference Guide](https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#validator-gettingstarted)

---

Serialização
O que é:
Serialização é o processo de transformar um objeto (como uma instância de uma classe em Java) em um formato que pode ser facilmente armazenado ou enviado, como um texto ou uma sequência de bytes.

Por que usamos:

Para salvar o estado de um objeto em um arquivo.
Para enviar um objeto através de uma rede (por exemplo, enviar dados entre um cliente e um servidor).
Exemplo:
Imagine que você tem um objeto que representa uma pessoa. Serializar esse objeto significa transformá-lo em algo como um texto JSON:

json
Copiar código
{
"nome": "João",
"idade": 30
}
Este texto pode ser salvo em um arquivo ou enviado para outro computador.

Desserialização
O que é:
Desserialização é o processo inverso da serialização. É transformar o formato armazenado ou enviado de volta em um objeto que podemos usar no programa.

Por que usamos:

Para carregar um objeto salvo de um arquivo.
Para receber um objeto enviado por outro sistema e usá-lo no nosso programa.
Exemplo:
Usando o texto JSON da serialização, desserializar significa transformá-lo de volta em um objeto Pessoa que você pode usar no seu código:

java
Copiar código
Pessoa pessoa = new Pessoa("João", 30);
Por que isso é útil?
Serialização e desserialização são úteis para persistir (salvar e recuperar) dados e para comunicação entre diferentes partes de um sistema ou entre sistemas diferentes.

Resumindo:
Serializar é transformar um objeto em um formato fácil de salvar ou enviar.
Desserializar é transformar esse formato de volta em um objeto que você pode usar no seu programa.

---

[Disponibilizado por Davi-Felipe](https://www.linkedin.com/in/devdavifelipe/ "Davi-Felipe")
