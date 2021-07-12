# JuizAgenda
Agenda de compromissos em JSF e SPRING

## Passo a passo
1- execute o comando mvn clean install na raiz do projeto
2- Configure servidor wildfly 16
3- Instale o war gerado pelo maven no wildfly

## Observações: 

1- Na tela compromissosCadastrados, no campo de filtrar por data é preciso colocar no seguinte formato ano/mes/dia, exemplo: "2021-07-28".
estou pesquisando e procurando uma forma de corrigir e deixar padronizado "dia/mes/ano" porem no momento é a única forma de filtrar o campo data.
2- O banco de dados utilizado foi o H2 
3- O servidor de aplicação utilizado foi o wildfly 16
