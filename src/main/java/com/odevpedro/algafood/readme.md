# Ementa do Curso de Spring Framework 🌱

## 1. Introdução
- Introdução ao treinamento 💻
- Como usar o suporte da AlgaWorks 🌟
- Por que desenvolver REST APIs? 🌐
- Conhecendo o modelo de domínio do projeto do curso 📊
- Preparando o ambiente de desenvolvimento: JDK e STS for Eclipse 🛠️

## 2. Spring e Injeção de Dependências
- Por que aprender e usar Spring? 🍃
- Conhecendo o ecossistema Spring 🌿
- Spring vs Jakarta EE (Java EE) 🤝
- Conhecendo o Spring Boot 🚀
- Criando um projeto Spring Boot com Spring Initialize 🌱
- Conhecendo o Maven e o pom.xml de um projeto Spring Boot 📦
- Criando um controller com Spring MVC 🎮
- Restart mais rápido da aplicação com DevTools 🔄
- O que é injeção de dependências? 🔌
- Conhecendo o IoC Container do Spring 🔄
- Definindo beans com @Component 🏭
- Injetando dependências (beans Spring) 💉
- Usando @Configuration e @Bean para definir beans ☕
- Conhecendo os pontos de injeção e a anotação @Autowired 🎯
- Dependência opcional com @Autowired ❓
- Ambiguidade de beans e injeção de lista de beans ❓
- Desambiguação de beans com @Primary ✅
- Desambiguação de beans com @Qualifier ✅
- Desambiguação de beans com anotação customizada ✅
- Mudando o comportamento da aplicação com Spring Profiles ⚙️
- Criando métodos de callback do ciclo de vida dos beans 🔃
- Publicando e consumindo eventos customizados 📢
- Configurando projetos Spring Boot com o application.properties 📄
- Substituindo propriedades via linha de comando e variáveis de ambiente 🌐
- Criando e acessando propriedades customizadas com @Value 🎨
- Acessando propriedades com @ConfigurationProperties 🛠️
- Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles) 🏭
- Ativando o Spring Profile por linha de comando e variável de ambiente 🚀

## 3. Introdução ao JPA e Hibernate
- Instalando o MySQL Server e MySQL Workbench 🗃️
- O que é JPA e Hibernate? 📦
- Adicionando JPA e configurando o Data Source ⚙️
- Mapeando entidades com JPA 🗺️
- Criando as tabelas do banco a partir das entidades 🏢
- Mapeando o id da entidade para autoincremento 🔄
- Importando dados de teste com import.sql 📂
- Consultando objetos do banco de dados 🔍
- Adicionando um objeto no banco de dados ➕
- Buscando um objeto pelo id no banco de dados 🆔
- Atualizando um objeto no banco de dados 🔄
- Excluindo um objeto do banco de dados ❌
- Conhecendo o padrão Aggregate do DDD 🧱
- Conhecendo e implementando o padrão Repository 🗄️
- Conhecendo e usando o Lombok ✂️
- Desafio: Lombok e repositório de restaurantes 🍽️
- Mapeando relacionamento com @ManyToOne 👫
- A anotação @JoinColumn 🏘️
- Propriedade nullable de @Column e @JoinColumn 🚧
- Desafio: mapeando entidades 📁

## 4. REST com Spring
- O que é REST? 🔄
- Conhecendo as constraints do REST 📐
- Diferença entre REST e RESTful 🔄
- Desenvolvedores de REST APIs puristas e pragmáticos 👷
- Conhecendo o protocolo HTTP 🌐
- Usando o protocolo HTTP 🚀
- Instalando e testando o Postman 📬
- Entendendo o que são Recursos REST 📦
- Identificando recursos REST 🎯
- Modelando e requisitando um Collection Resource com GET 📁
- Desafio: collection resource de estados 🌍
- Representações de recursos e content negotiation 📦
- Implementando content negotiation para retornar JSON ou XML 📜
- Consultando Singleton Resource com GET e @PathVariable 🆔
- Customizando as representações XML e JSON com @JsonIgnore, @JsonProperty e
  @JsonRootName 🎨
- Customizando a representação em XML com Wrapper e anotações do Jackson 📄
- Conhecendo os métodos HTTP 📭
- Conhecendo os códigos de status HTTP 🚥
- Definindo o status da resposta HTTP com @ResponseStatus 📢
- Manipulando a resposta HTTP com ResponseEntity 🚚
- Corrigindo o Status HTTP para resource inexistente 🚨
- Status HTTP para collection resource vazia: qual usar? 🗄️
- Modelando e implementando a inclusão de recursos com POST ➕
- Negociando o media type do payload do POST com Content-Type 📜
- Modelando e implementando a atualização de recursos com PUT 🔄
- Modelando e implementando a exclusão de recursos com DELETE ❌
- Implementando a camada de domain services (e a importância da linguagem ubíqua) 🏢
- Refatorando a exclusão de cozinhas para usar domain services 🥘
- Desafio: modelando e implementando a consulta de recursos de restaurantes 🍽️
- Modelando and implementando a inclusão de recursos de restaurantes 🏢
- Desafio: Modelando and implementando a atualização de recursos de restaurantes 🍽️
- Desafio: implementando serviços REST de cidades and estados 🌍
- Analisando solução para atualização parcial de recursos with PATCH 📈
- Finalizando a atualização parcial with a API de Reflections do Spring 🎨
- Introdução ao Modelo de Maturidade de Richardson (RMM) 📈
- Conhecendo o nível 0 do RMM 📶
- Conhecendo o nível 1 do RMM 📶
- Conhecendo o nível 2 do RMM 📶
- Conhecendo o nível 3 do RMM 📶

## 5. Super poderes do Spring Data JPA
- Implementando consultas JPQL em repositórios 🔍
- Conhecendo o projeto Spring Data