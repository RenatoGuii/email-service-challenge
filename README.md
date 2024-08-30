<h1>Serviço de Email</h1>
Este projeto é uma API desenvolvida para gerenciar o envio de e-mails utilizando múltiplos provedores de serviço de e-mail. A API foi construída utilizando Spring Boot e outras tecnologias do ecossistema Spring. 
<h2>Funcionalidades:</h2> 

- Envio de E-mails: Permite o envio de e-mails utilizando múltiplos provedores de e-mail, com fallback em caso de falha. 

- Configuração Dinâmica: Capacidade de alternar entre provedores de e-mail com base na disponibilidade. 

- Documentação da API: A API está documentada utilizando o Swagger para fácil integração e uso. 

<h2>Tecnologias Utilizadas:</h2> 
- Spring Boot 3: Framework principal para construção da API. 
- Spring Cloud AWS: Integração com o serviço AWS SES para envio de e-mails. 
- Swagger: Ferramenta para documentação da API. 
- Jakarta Validation: Validação de dados no lado do servidor. 

<h2>Requisitos:</h2> 
- Java 17 ou superior - Maven para gerenciamento de dependências 
- Conta AWS com acesso ao SES configurado 

<h2>Configuração do Projeto:</h2> 

<h3>Clonar o Repositório:</h3> 
- Git Clone: https://github.com/RenatoGuii/email-service-challenge.git

<h3>Configurar o AWS SES:</h3> 
- Atualize o arquivo `application.properties` com suas credenciais do AWS SES (Access Key, Secret Key e região). 

<h3>Configurar Provedores de Email Alternativos:</h3> 
- Caso utilize outros provedores de e-mail, configure as credenciais e parâmetros no mesmo arquivo `application.properties`. 

<h3>Executar a Aplicação:</h3> 
- Rode o arquivo `EmailServiceApplication` para iniciar o servidor Spring Boot. 

<h2>Documentação da API:</h2> 
- A documentação da API foi gerada utilizando o Swagger e pode ser acessada no ambiente de desenvolvimento
- Swagger UI: Acesse a documentação da API através do link http://localhost:8080/swagger-ui.html.

<h2>Endpoints:</h2> <h3>Envio de E-mails:</h3>
- POST /api/email: Envia um novo e-mail com base nos dados fornecidos.

<h2>Considerações Finais:</h2> 
- Este projeto foi desenvolvido com o intuito de praticar e implementar um serviço de envio de e-mails utilizando múltiplos provedores. Sinta-se à vontade para contribuir ou sugerir melhorias.