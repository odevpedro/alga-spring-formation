# Ementa do Curso de Spring Framework

## 1. Introdução 🌱
- Introdução ao treinamento
- Como usar o suporte da AlgaWorks
- Por que desenvolver REST APIs?
- Conhecendo o modelo de domínio do projeto do curso
- Preparando o ambiente de desenvolvimento: JDK e STS for Eclipse

## 2. Spring e Injeção de Dependências 🍃
- Por que aprender e usar Spring?
- Conhecendo o ecossistema Spring
- Spring vs Jakarta EE (Java EE)
- Conhecendo o Spring Boot
- Criando um projeto Spring Boot com Spring Initialize
- Conhecendo o Maven e o pom.xml de um projeto Spring Boot
- Criando um controller com Spring MVC
- Restart mais rápido da aplicação com DevTools
- O que é injeção de dependências?
- Conhecendo o IoC Container do Spring
- Definindo beans com @Component
- Injetando dependências (beans Spring)
- Usando @Configuration e @Bean para definir beans
- Conhecendo os pontos de injeção e a anotação @Autowired
- Dependência opcional com @Autowired
- Ambiguidade de beans e injeção de lista de beans
- Desambiguação de beans com @Primary
- Desambiguação de beans com @Qualifier
- Desambiguação de beans com anotação customizada
- Mudando o comportamento da aplicação com Spring Profiles
- Criando métodos de callback do ciclo de vida dos beans
- Publicando e consumindo eventos customizados
- Configurando projetos Spring Boot com o application.properties
- Substituindo propriedades via linha de comando e variáveis de ambiente
- Criando e acessando propriedades customizadas com @Value
- Acessando propriedades com @ConfigurationProperties
- Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles)
- Ativando o Spring Profile por linha de comando e variável de ambiente

## 3. Super poderes do Spring Data JPA 🚀
- Implementando consultas JPQL em repositórios
- Conhecendo o projeto Spring Data JPA (SDJ)
- Criando um repositório com Spring Data JPA (SDJ)
- Refatorando o código do projeto para usar o repositório do SDJ
- Desafio: refatorando todos os repositórios para usar SDJ
- Criando consultas com query methods
- Usando as keywords para definir critérios de query methods
- Conhecendo os prefixos de query methods
- Usando queries JPQL customizadas com @Query
- Externalizando consultas JPQL para um arquivo XML
- Implementando um repositório SDJ customizado
- Implementando uma consulta dinâmica com JPQL
- Implementando uma consulta simples com Criteria API
- Adicionando restrições na cláusula where com Criteria API
- Tornando a consulta com Criteria API com filtros dinâmicos
- Conhecendo o uso do padrão Specifications (DDD) com SDJ
- Implementando Specifications com SDJ
- Criando uma fábrica de Specifications
- Injetando o próprio repositório na implementação customizada e a anotação @Lazy
- Estendendo o JpaRepository para customizar o repositório base

## 4. Explorando mais do JPA e Hibernate 🎯
- Mapeando relacionamento bidirecional com @OneToMany
- Mapeando relacionamento muitos-para-muitos com @ManyToMany
- Analisando o impacto do relacionamento muitos-para-muitos na REST API
- Mapeando classes incorporáveis com @Embedded e @Embeddable
- Testando e analisando o impacto da incorporação de classe na REST API
- Mapeando propriedades com @CreationTimestamp e @UpdateTimestamp
- Desafio: mapeando relacionamento muitos-para-um
- Desafio: mapeando relacionamento um-para-muitos
- Desafio: mapeando relacionamentos muitos-para-muitos
- Entendendo o Eager Loading
- Entendendo o Lazy Loading
- Alterando a estratégia de fetching para Lazy Loading
- Alterando a estratégia de fetching para Eager Loading
- Resolvendo o Problema do N+1 com fetch join na JPQL

## 5. Pool de conexões e Flyway 🏊‍♂️
- Entendendo o funcionamento de um pool de conexões
- Conhecendo o Hikari: a solução padrão de pool de conexões no Spring Boot
- Configurando o pool de conexões do Hikari
- Schema generation em produção não é uma boa prática
- Flyway: ferramenta de versionamento de schemas de banco de dados
- Adicionando o Flyway no projeto e criando a primeira migração
- Evoluindo o banco de dados com novas migrações
- Criando migrações complexas com remanejamento de dados
- Criando migração a partir de DDL gerado por schema generation
- Adicionando dados de testes com callback do Flyway
- Reparando migrações com erros
- Desafio: Criando migrações e mapeando as entidades Pedido e ItemPedido

## 8. Tratamento e modelagem de erros da API 🚧
- Introdução ao tratamento e modelagem de erros
- Lançando exceções customizadas anotadas com @ResponseStatus
- Lançando exceções do tipo ResponseStatusException
- Estendendo ResponseStatusException
- Simplificando o código com o uso de @ResponseStatus em exceptions
- Desafio: refatorando os serviços REST
- Analisando os impactos da refatoração
- Criando a exception NegocioException
- Desafio: usando a exception NegocioException
- Afinando a granularidade e definindo a hierarquia das exceptions de negócios
- Desafio: lançando exceptions de granularidade fina
- Tratando exceções em nível de controlador com @ExceptionHandler
- Tratando exceções globais com @ExceptionHandler e @ControllerAdvice
- Desafio: implementando exception handler
- Criando um exception handler global com ResponseEntityExceptionHandler
- Customizando o corpo da resposta padrão de ResponseEntityExceptionHandler
- Conhecendo a RFC 7807 (Problem Details for HTTP APIs)
- Padronizando o formato de problemas no corpo de respostas com a RFC 7807
- Desafio: usando o formato de problemas no corpo de respostas
- Customizando exception handlers de ResponseEntityExceptionHandler
- Tratando a exception InvalidFormatException na desserialização
- Habilitando erros na desserialização de propriedades inexistentes ou ignoradas
- Desafio - tratando PropertyBindingException na desserialização
- Lançando exception de desserialização na atualização parcial (PATCH)
- Desafio: tratando exception de parâmetro de URL inválido
- Desafio: tratando a exceção NoHandlerFoundException
- Desafio: tratando outras exceções não capturadas
- Estendendo o formato do problema para adicionar novas propriedades
- Desafio: estendendo o formato do problema

## 9. Validações com Bean Validation ✅
- Validação do modelo com Bean Validation
- Adicionando constraints e validando no controller com @Valid
- Desafio: tratando exception de violação de constraints de validação
- Estendendo o Problem Details para adicionar as propriedades com constraints violadas
- Conhecendo e adicionando mais constraints de validação no modelo
- Validando as associações de uma entidade em cascata
- Agrupando e restringindo constraints que devem ser usadas na validação
- Convertendo grupos de constraints para validação em cascata com @ConvertGroup
- Desafio: adicionando constraints de validação no modelo
- Customizando mensagens de validação na anotação da constraint
- Customizando e resolvendo mensagens de validação globais em Resource Bundle
- Desafio: customizando mensagens de validação
- Resolvendo mensagens de validação com Resource Bundle do Bean Validation
- Usando o Resource Bundle do Spring como Resource Bundle do Bean Validation
- Criando constraints de validação customizadas usando composição
- Criando constraints de validação customizadas com implementação de
  ConstraintValidator
- Criando constraints de validação customizadas em nível de classe
- Ajustando Exception Handler para adicionar mensagens de validação em nível de
  classe
- Executando processo de validação programaticamente
- Desafio: tratando a exception customizada de validações programáticas

# 10. Testes de Integração 🚀
- Introdução aos Testes de Integração e Testes de APIs
- Preparando o projeto para testes de integração
- Criando e rodando um teste de integração com Spring Boot, JUnit e AssertJ
- Escrevendo bons nomes de testes
- Desafio: escrevendo testes de integração
- Rodando os testes pelo Maven
- Configurando Maven Failsafe Plugin no projeto
- Implementando Testes de API com REST Assured e validando o código de status HTTP
- Validando o corpo da resposta HTTP
- Criando um método para fazer setup dos testes
- Entendendo o problema da ordem de execução dos testes
- Voltando o estado inicial do banco de dados para cada execução de teste com callback do Flyway
- Configurando um banco de testes e usando @TestPropertySource
- Limpando e populando o banco de dados de teste
- Testando endpoint passando parâmetro de URL
- Desafio: refatorando o código de testes
- Desafio: escrevendo testes de API

# 11. Boas Práticas e Técnicas para APIs 📊
- Analisando e definindo melhor o escopo das transações
- Refinando o payload de cadastro com @JsonIgnoreProperties
- Criando classes de mixin para usar as anotações do Jackson
- Desafio: usando @JsonIgnoreProperties e Jackson Mixin
- Antes de estudar sobre data/hora: relembrando as aulas de geografia e entendendo os fusos horários
- Boas práticas para trabalhar com data e hora em REST APIs
- Configurando e refatorando o projeto para usar UTC
- Desafio - refatorando o código para usar OffsetDateTime
- Isolando o Domain Model do Representation Model com o padrão DTO
- Implementando a conversão de entidade para DTO
- Criando DTOs para entrada de dados na API
- Refatorando e criando um assembler de DTO
- Desafio: Refatorando e criando um disassembler do DTO
- Adicionando e usando o ModelMapper
- Entendendo a estratégia padrão do ModelMapper para correspondência de propriedades
- Customizando o mapeamento de propriedades com ModelMapper
- Mapeando para uma instância destino (e não um tipo) com ModelMapper
- Revisando e ajustando as mensagens de validação com o uso de DTOs
- Estratégias de nomes de propriedades - snake case vs lower camel case
- Desafio: usando DTOs como representation model
- Corrigindo bug de tratamento de exception de integridade de dados com flush do JPA

# 12. Modelagem Avançada e Implementação da API 🏛️
- Modelando sub-recursos para relacionamentos
- Granularidade de recursos: Chatty vs Chunky APIs
- Modelando conceitos abstratos de negócio e ações não-CRUD como recursos
- Implementando os endpoints de ativação e inativação de restaurantes
- Desafio: implementando os endpoints de formas de pagamento
- Adicionando endereço no modelo da representação do recurso de restaurante
- Refatorando serviço de cadastro de restaurante para incluir endereço
- Desafio: implementando os endpoints de grupos
- Desafio: implementando os endpoints de usuários
- Um pouco mais sobre JPA: objeto alterado fora da transação é sincronizado com o banco de dados
- Implementando regra de negócio para evitar usuários com e-mails duplicados
- Implementando os endpoints de associação de formas de pagamento em restaurantes
- Desafio: implementando os endpoints de produtos
- Desafio: Implementando os endpoints de abertura e fechamento de restaurantes
- Desafio: implementando os endpoints de associação de grupos com permissões
- Desafio: implementando os endpoints de associação de usuários com grupos
- Desafio: implementando endpoints de associação de usuários responsáveis com restaurantes
- Implementando ativação e inativação em massa de restaurantes
- Desafio: Implementando os endpoints de consulta de pedidos
- Otimizando a query de pedidos e retornando model resumido na listagem
- Desafio: Implementando o endpoint de emissão de pedidos
- Implementando endpoint de transição de status de pedidos
- Desafio: implementando endpoints de transição de status de pedidos
- Refatorando o código de regras para transição de status de pedidos
- Usando IDs vs UUIDs nas URIs de recursos
