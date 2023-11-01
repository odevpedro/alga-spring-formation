## Estrutura do Repositório ⚠️

Este repositório é organizado de modo a refletir o meu progresso e aprendizado ao longo do curso de Spring Boot. Cada conceito ou tópico que eu estudo é representado por uma branch separada. Isso me ajuda a manter o código organizado e permite o acompanhamehnto do meu progresso e a evolução dos conceitos.
Na branch main ficará apenas o projeto principal do curso.

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

# 13. Modelagem de projeções, pesquisas e relatórios 🚀
- Fazendo projeção de recursos com @JsonView do Jackson
- Limitando os campos retornados pela API com @JsonFilter do Jackson
- Limitando os campos retornados pela API com Squiggly
- Implementando pesquisas simples na API
- Modelando pesquisas complexas na API
- Implementando pesquisas complexas na API
- Tratando BindException ao enviar parâmetros de URL inválidos
- Implementando paginação e ordenação em recursos de coleção da API
- Desafio: implementando paginação e ordenação de pedidos
- Implementando JsonSerializer para customizar representação de paginação
- Implementando um conversor de propriedades de ordenação
- Modelando endpoints de consultas com dados agregados (ideal para gráficos e dashboards)
- Discutindo sobre onde implementar as consultas com dados agregados
- Implementando consulta com dados agregados de vendas diárias
- Desafio: adicionando os filtros na consulta de vendas diárias
- Tratando time offset na agregação de vendas diárias por data
- Conhecendo o JasperSoft Studio
- Criando um layout do relatório JasperReports de vendas diárias
- Estruturando endpoint e serviço de emissão de relatório em PDF
- Preenchendo um relatório JasperReports com JavaBeans e gerando bytes do PDF

# 14. Upload e download de arquivos 📁
- Conhecendo soluções para upload de arquivos em REST APIs
- Implementando upload de arquivo com multipart/form-data
- Validando o tamanho máximo do arquivo
- Desafio: Validando o content type do arquivo
- Mapeando entidade FotoProduto e relacionamento um-para-um
- Implementando serviço de cadastro de foto de produto
- Excluindo e substituindo cadastro de foto de produto
- Implementando o serviço de armazenagem de fotos no disco local
- Integrando o serviço de catálogo de fotos com o serviço de armazenagem
- Implementando a remoção e substituição de arquivos de fotos no serviço de armazenagem
- Desafio: Implementando recuperação de foto no serviço de armazenagem
- Desafio: Implementando endpoint de consulta de foto de produto
- Servindo arquivos de fotos pela API
- Checando media type ao servir arquivos de fotos
- Desafio: implementando endpoint de exclusão de foto de produto
- Corrigindo exception handler de media type não aceita
- Amazon S3: conhecendo o serviço de storage da AWS
- Criando usuário com permissões para adicionar objetos na Amazon S3
- Criando chaves de acesso para a API da AWS
- Criando bean de propriedades de configuração dos serviços de storage
- Adicionando o SDK Java da Amazon S3 no projeto e criando a classe da implementação do serviço de storage
- Definindo bean do client da Amazon S3 e configurando credenciais
- Implementando a inclusão de objetos no bucket da Amazon S3
- Desafio: Implementando a exclusão de objetos do bucket da Amazon S3
- Implementando a recuperação de foto no serviço de storage do S3
- Selecionando a implementação do serviço de storage de fotos

# 15. E-mails transacionais e Domain Events 📧
- Conhecendo soluções para envio de e-mails transacionais
- Configurando o projeto para envio de e-mails usando servidor SMTP
- Implementando o serviço de infraestrutura de envio de e-mails com Spring
- Usando o serviço de envio de e-mails na confirmação de pedidos
- Processando template do corpo de e-mails com Apache FreeMarker
- Melhorando o texto do e-mail com FTL (FreeMarker Template Language)
- Formatando valores monetários com FTL
- Desafio: implementando serviço de envio de e-mail fake
- Desafio: Implementando serviço de envio de e-mail sandbox
- Conhecendo o padrão Domain Events do DDD
- Publicando Domain Events a partir do Aggregate Root
- Observando e reagindo a Domain Events
- Reagindo a Domain Events em fases específicas da transação
- Desafio: enviando e-mails no cancelamento de pedidos
# 16. CORS e consumo da API com JavaScript e Java 🌐
- Implementando uma chamada na REST API com JavaScript
- Testando a requisição na API com JavaScript e entendendo a Same Origin Policy
- Entendendo o funcionamento básico de CORS e habilitando na API
- Habilitando CORS em controladores e métodos com @CrossOrigin
- Entendendo o funcionamento de preflight do CORS
- Habilitando CORS globalmente no projeto da API
- Desafio: implementando uma requisição GET com JavaScript
- Implementando um formulário de cadastro e fazendo requisição POST com JavaScript
- Desafio: implementando uma requisição DELETE com JavaScript
- Implementando um client da REST API com Java e Spring (RestTemplate)
- Tratando respostas com código de erro no client Java
- Desafio: Implementando uma requisição POST no client Java

# 17. Cache de HTTP 📦
- Introdução ao Cache de HTTP
- Habilitando o cache com o cabeçalho Cache-Control e a diretiva max-age
- Desafio: adicionando o cabeçalho Cache-Control na resposta
- Entendendo a validação de representações em cache com ETags
- Implementando requisições condicionais com Shallow ETags
- Adicionando outras diretivas de Cache-Control na resposta HTTP
- Usando a diretiva no-cache no cabeçalho Cache-Control da requisição
- Entendendo e preparando a implementação de Deep ETags
- Implementando requisições condicionais com Deep ETags
- Desafio: implementando requisições condicionais com Deep ETags

# 18. Documentação da API com OpenAPI, Swagger UI e SpringFox 📖
- Introdução à documentação de REST APIs
- Conhecendo a OpenAPI (antes conhecida como Swagger)
- Gerando a definição OpenAPI em JSON com SpringFox
- Gerando a documentação da API em HTML com Swagger UI e SpringFox
- Selecionando os endpoints da API para gerar a documentação
- Descrevendo informações da API na documentação
- Descrevendo tags na documentação e associando com controllers
- Descrevendo as operações de endpoints na documentação
- Descrevendo parâmetros de entrada na documentação
- Descrevendo modelos de representações e suas propriedades
- Descrevendo restrições de validação de propriedades do modelo
- Descrevendo códigos de status de respostas de forma global
- Desafio: descrevendo códigos de status de respostas de forma global
- Descrevendo o modelo de representação de problema
- Referenciando modelo de representação de problema com códigos de status de erro
- Descrevendo códigos de status de respostas em endpoints específicos
- Desacoplando anotações do Swagger dos controladores
- Desafio: descrevendo documentação de endpoints de grupos
- Descrevendo media type da resposta nos endpoints
- Corrigindo documentação com substituição de Pageable
- Corrigindo documentação com substituição Page
- Desafio: descrevendo documentação de endpoints de cozinhas
- Ignorando tipos de parâmetros de operações na documentação
- Desafio: descrevendo documentação de endpoints de formas de pagamento
- Desafio: descrevendo documentação de endpoints de associação de restaurantes com formas de pagamento
- Desafio: descrevendo documentação de endpoints de associação de restaurantes com usuários
- Desafio: descrevendo documentação de endpoints de produtos
- Desafio: descrevendo documentação de endpoints de fotos de produtos
- Corrigindo documentação no Swagger UI para upload de arquivos
- Desafio: descrevendo documentação de endpoints de associação de permissões com grupos
- Desafio: descrevendo documentação de endpoints de usuários
- Desafio: descrevendo documentação de endpoints de associação de grupos com usuários
- Desafio: descrevendo documentação de endpoint de estatísticas


# 19. Discoverability e HATEOAS: A Glória do REST 🌐
- Introdução à Discoverability e HATEOAS
- Adicionando a URI do recurso criado no header da resposta
- Adicionando o Spring HATEOAS no projeto
- Atualizando o projeto para Spring Boot 2.2 (Spring HATEOAS 1.0)
- Resolvendo conflito de dependências com Spring HATEOAS e SpringFox
- Conhecendo especificações para formatos Hypermedia
- Adicionando hypermedia na representação de recurso único com HAL
- Construindo links dinâmicos com WebMvcLinkBuilder
- Construindo links que apontam para métodos
- Adicionando hypermedia na representação de recursos de coleção
- Montando modelo de representação com RepresentationModelAssembler
- Desafio: adicionando hypermedia nos recursos de usuários
- Corrigindo link de coleção de recurso de responsáveis por restaurante
- Desafio: adicionando hypermedia nos recursos de estados
- Adicionando hypermedia em recursos com paginação
- Desafio: adicionando hypermedia em recursos de pedidos (paginação)
- Corrigindo links de paginação com ordenação
- Adicionando links com template variables
- Desafio: adicionando template variables do filtro de pedidos
- Refatorando construção e inclusão de links em representation model
- Desafio: refatorando construção e inclusão de links
- Adicionando links de transições de status de pedidos
- Adicionando links condicionalmente
- Desafio: adicionando hypermedia nos recursos de restaurantes
- Desafio: adicionando links condicionais no recurso de restaurante
- Desafio: adicionando template variable de projeção de restaurantes
- Desafio: adicionando hypermedia nos recursos de formas de pagamento
- Adicionando links para desassociação de formas de pagamento com restaurante
- Adicionando links com template variable de caminho para associação de formas de pagamento com restaurante
- Desafio: adicionando links de associação de restaurantes com responsáveis
- Desafio: adicionando hypermedia nos recursos de produtos
- Desafio: adicionando links para recurso de foto de produto
- Desafio: adicionando hypermedia nos recursos de grupos
- Desafio: adicionando links de associação de grupos com permissões
- Desafio: adicionando links de associação de usuários com grupos
- Implementando o Root Entry Point da API
- Desafio: implementando endpoint com links de recursos de estatísticas
- Comprimindo as respostas HTTP com Gzip
- Corrigindo as propriedades de links na documentação
- Corrigindo a documentação dos endpoints de cidades
- Corrigindo a paginação na documentação
- Desafio: corrigindo a documentação dos endpoints de estados
- Desafio: corrigindo a documentação dos endpoints de formas de pagamento
- Desafio: corrigindo a documentação dos endpoints de grupos
- Desafio: corrigindo a documentação dos endpoint de pedidos (paginação)
- Desafio: corrigindo a documentação dos endpoints de produtos
- Desafio: corrigindo a documentação dos endpoints de restaurantes e usuários
- Removendo modelo de representação inutilizado da documentação

# 20. Evoluindo e versionando a API 🚀
- Evoluindo a API com gestão de mudanças
- Evitando quebrar os clientes: nova propriedade no modelo
- Evitando quebrar os clientes: exclusão de propriedade do modelo
- Evitando quebrar os clientes: alteração de tipo de propriedade do modelo
- Evitando quebrar os clientes: alteração na estrutura de dados do modelo
- Evitando quebrar os clientes: alteração de URL de recurso
- O que é e quando versionar uma API?
- As principais técnicas de versionamento de APIs
- As principais abordagens para manter a base de código de APIs versionadas
- Preparando o projeto para versionamento da API por Media Type
- Implementando o versionamento da API por Media Type
- Definindo a versão padrão da API quando o Media Type não é informado
- Implementando o versionamento da API por URI
- Desafio: Refatorando controladores para adicionar /v1 nas URIs
- Desafio: adicionando os recursos de cozinhas na v2 da API
- Gerando documentação das versões da API com SpringFox e Swagger UI
- Desafio: revisando documentação da v2 da API
- Depreciando uma versão da API
- Desligando uma versão da API

# 21. Logging 📜
- Introdução ao Logback e SLF4J
- Desafio: registrando logs de exceptions não tratadas
- Criando uma conta no Loggly: serviço de gerenciamento de logs na nuvem
- Configurando o appender do Loggly no Logback
- Configurando o Logback para alternar as configurações por Spring Profiles

# 22. Segurança com Spring Security e OAuth2 🔒
- Introdução à segurança de REST APIs
- Adicionando segurança na API com Spring Security
- Configurando Spring Security com HTTP Basic
- Configurando autenticação de usuários em memória
- Introdução ao OAuth2
- Soluções para OAuth2: nova stack do Spring Security vs Spring Security OAuth
- Conhecendo o fluxo Resource Owner Password Credentials
- Criando o projeto do Authorization Server com Spring Security OAuth2
- Configurando o fluxo Authorization Server com Password Credentials e Opaque Tokens
- Configurando o endpoint de introspecção de tokens no Authorization Server
- Configurando o Resource Server com a nova stack do Spring Security
- Conhecendo o fluxo para emitir e usar Refresh Tokens
- Configurando o Refresh Token Grant Type no Authorization Server
- Configurando a validade e não reutilização de Refresh Tokens
- Conhecendo o fluxo Client Credentials
- Configurando o Client Credentials Grant Type no Authorization Server
- Revisando o fluxo Authorization Code
- Configurando o Authorization Code Grant Type
- Testando o fluxo Authorization Code com um client JavaScript
- Conhecendo o fluxo Implicit
- Configurando o fluxo Implicit Grant Type
- Mais segurança com PKCE e Authorization Code Grant
- Implementando o suporte a PKCE com o fluxo Authorization Code
- Testando o fluxo Authorization Code com PKCE com o método plain
- Testando o fluxo Authorization Code com PKCE com o método SHA-256
- Testando um client JavaScript com PKCE e Authorization Code
- Decidindo qual fluxo OAuth2 usar


# 23. OAuth2 avançado com JWT e controle de acesso 🔐
- Armazenando tokens no Redis: um banco de dados NoSQL
- Configurando o RedisTokenStore
- Entendendo a diferença entre Stateful e Stateless Authentication
- Transparent Tokens: conhecendo o JSON Web Tokens (JWT)
- Gerando JWT com chave simétrica (HMAC SHA-256) no Authorization Server
- Configurando o Resource Server para JWT assinado com chave simétrica
- Entendendo a diferença entre assinatura com chave simétrica e assimétrica
- Gerando um par de chaves com keytool
- Assinando o JWT com RSA SHA-256 (chave assimétrica)
- Desafio: criando bean de propriedades de configuração do KeyStore
- Extraindo a chave pública no formato PEM
- Configurando a validação de JWT no Resource Server com a chave pública
- Revisando o fluxo de aprovação do Authorization Code com JWT
- Autenticando usuário com dados do banco de dados
- Desafio: refatorando serviços de usuários para usar BCrypt
- Adicionando claims customizadas no payload do JWT
- Obtendo usuário autenticado no Resource Server
- Definindo e criando as permissões de acesso
- Carregando as permissões concedidas na autenticação
- Carregando as Granted Authorities e restringindo acesso a endpoints na API
- Method Security: Restringindo acesso com @PreAuthorize e SpEL
- Desafio: tratando AccessDeniedException no ExceptionHandler
- Simplificando o controle de acesso em métodos com meta-anotações
- Entendendo os escopos do OAuth2
- Carregando Granted Authorities dos escopos do OAuth2 no Resource Server
- Restringindo acesso a endpoints por escopos do OAuth2
- Desafio: restringindo acesso dos endpoints de restaurantes
- Restringindo acessos de forma contextual (sensível à informação)
- Restringindo acessos com @PostAuthorize
- Desafio: restringindo acessos ao endpoint de pesquisa de pedidos
- Desafio: restringindo acessos aos endpoints de transição de status de pedidos
- Desafio: restringindo acessos aos endpoints de formas de pagamentos
- Desafio: restringindo acessos aos endpoints de cidades e estados
- Desafio: restringindo acessos aos endpoints de usuários, grupos e permissões
- Desafio: restringindo acessos aos endpoints de estatísticas
- Configurando os clientes OAuth2 em um banco de dados SQL
- Cadastrando clientes OAuth2 no banco de dados e testando a emissão de tokens
- Corrigindo lógica de restrição de acessos para Client Credentials Flow
- Gerando links do HAL dinamicamente de acordo com permissões do usuário
- Desafio: gerando links do HAL dinamicamente de acordo com permissões
- Juntando o Resource Server com o Authorization Server no mesmo projeto
- Ajustando a documentação da API para suporte a OAuth2
- Customizando a página de login
- Customizando a página de OAuth2 Approval
- Implementando o endpoint do JSON Web Key Set (JWKS)
- Externalizando o KeyStore: criando um ProtocolResolver para Base64

# 24. Dockerizando a aplicação 🐳
- Conhecendo o Docker
- Instalando o Docker
- Executando um container
- Gerenciando melhor os containers
- Conhecendo a arquitetura do Docker
- Entendendo o que são as imagens e o Docker Hub
- Gerenciando imagens
- Executando um container do MySQL
- Construindo a imagem da aplicação com Dockerfile
- Criando uma network e conectando dois containers
- Construindo a imagem Docker pelo Maven
- Disponibilizando a imagem da aplicação no Docker Hub
- Conhecendo e usando Docker Compose
- Controlando a ordem de inicialização com wait-for-it.sh
- Escalando um serviço com Docker Compose
- Entendendo o Poor Man's Load Balancer (DNS Round Robin)
- Configurando um proxy reverso com Nginx
- Configurando o Spring Session com Redis
- Resolvendo problemas com storage de Authorization Codes
- Configurando o Spring Session Data Redis
- Resolvendo problemas com storage de Authorization Codes

# 25. Deploy em containers Docker na Amazon ☁️
- Introdução ao deployment em produção
- Mais organização das propriedades do projeto com Spring Profiles
- Dependência de JavaMailSender não satisfeita: melhorando o uso da herança
- Conhecendo a Amazon Web Services (AWS)
- Entendendo alguns conceitos fundamentais da nuvem da AWS
- Monitorando e criando um alerta de orçamento da AWS
- Criando o bucket no Amazon S3
- Criando uma instância do MySQL no Amazon RDS
- Criando schema e usuário da aplicação
- Conhecendo e criando uma conta no Redislabs
- Criando uma instância do Redis na nuvem
- Conhecendo o Amazon Elastic Container Service (ECS) e AWS Fargate
- Publicando um container no Amazon ECS
- Subindo a imagem Docker para o Amazon Elastic Container Registry (ECR)
- Organizando as variáveis de ambiente do container da aplicação
- Gerenciando as configurações com AWS Systems Manager Parameter Store
- Configurando Amazon ECS para rodar nossa aplicação
- Permitindo a leitura de parâmetros do Parameter Store pelo serviço do Amazon ECS
- Permitindo o acesso ao MySQL pelo Security Group do serviço do Amazon ECS
- Inserindo dados no banco de dados de produção
- Conhecendo o Elastic Load Balancing da Amazon
- Configurando e provisionando um Load Balancer na Amazon
- Configurando o balanceamento de carga no serviço do Amazon ECS
- Registrando um domínio de internet no Registro.br
- Configurando o domínio para o Application Load Balancer
- Configurando certificado TLS (HTTPS) com AWS Certificate Manager
- Configurando o protocolo HTTPS nos links da API com HATEOAS
- Testando a API em produção
- Conclusão e próximos passos





