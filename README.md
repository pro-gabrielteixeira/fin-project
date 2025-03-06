📊 Bitcoin Indicators API
✅ Backend: API REST desenvolvida em Java + Spring Boot, focada em buscar e interpretar indicadores essenciais para o mercado de Bitcoin, como preço atual, MVRV, Fear and Greed Index e Mayer Multiple.
✅ Frontend: Aplicação Angular para consumir a API e exibir os dados de forma amigável

📌 Objetivo
Centralizar dados de diversas fontes sobre o Bitcoin, processar essas informações e fornecer uma interpretação clara e objetiva para cada indicador, exibidos de forma visual e interpretativa no frontend em Angular. Ideal para investidores e entusiastas que querem insights rápidos e confiáveis. 

💻 Backend - Bitcoin Indicators API

🛠️ Tecnologias Utilizadas
Linguagem: Java 17+
Framework: Spring Boot 3
Consumo de APIs Externas: RestTemplate ou WebClient
Documentação: Springdoc OpenAPI (Swagger)
Logs: Logback
Testes: JUnit 5 + Mockito
Gerenciamento de Dependências: Maven

📈 Funcionalidades
✅ Consulta do preço atual do Bitcoin
✅ Recuperação de indicadores relevantes (MVRV, Fear and Greed Index, Mayer Multiple)
✅ Normalização e tratamento de dados de múltiplas fontes
✅ Análise interpretativa com explicação simplificada de cada indicador
✅ Exposição via endpoints REST
✅ Documentação automática com Swagger (OpenAPI)

📊 Exemplo de Resposta da API

{
   "precoAtual": 63000,
   "mvrv": {
      "valor": 2.8,
      "interpretacao": "Neutro - Bitcoin está próximo de seu valor justo"
   },
   "fearAndGreedIndex": {
      "valor": 72,
      "interpretacao": "Ganância - Mercado otimista, possível sinal de alta especulativa"
   },
   "mayerMultiple": {
      "valor": 2.2,
      "interpretacao": "Acima da média histórica - Bitcoin pode estar sobrevalorizado"
   }
}


🔗 Endpoints Planejados
Método
GET

Endpoint
/

Descrição
Retorna dados e análises sobre o Bitcoin


🌐 Frontend - Bitcoin Indicators Dashboard

🛠️ Tecnologias
Angular 17+
Typescript
Bootstrap ou Angular Material (opcional)
Consumo de API via HttpClient
Gráficos com Chart.js (ou outra lib gráfica)
Deploy no GitHub Pages (ou outra plataforma gratuita)

📋 Funcionalidades
✅ Tela principal com resumo dos indicadores
✅ Botão para atualizar dados em tempo real
✅ Exibição dos indicadores em cards ou gráficos
✅ Explicação interpretada para cada métrica

🗺️ Fluxo Completo da Aplicação
1️⃣ Frontend faz requisição para o backend (GET /).
2️⃣ Backend busca dados de fontes externas (CoinGecko, Alternative.me, etc).
3️⃣ Backend trata, interpreta e responde com JSON consolidado.
4️⃣ Frontend exibe os dados em cards, gráficos e/ou tabelas, com interpretações amigáveis.

✨ Diferenciais
✅ Dados centralizados em uma só API
✅ Interpretação simplificada para facilitar decisões rápidas
✅ Ideal para dashboards, alertas ou notificações
