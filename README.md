### Instalação do Prometheus
* Acessar o site oficial do Prometheus e baixar o zip que contém o executável. Nesse projeto utilizamos a versão **2.39.0**, que já vem com exporters para monitoramento de sistemas e banco de dados
* Extrair o zip e executar o arquivo **prometheus.exe**, que faz subir o servidor do Prometheus na **porta 9090**
* Acessar o endereço **http://locahost:9090** no navegador, o console do Prometheus deve ser exibido com sucesso

### Instalação do Grafana
* Acessar o site oficial do Grafana e baixar o zip que contém o executável. Nesse projeto utilizamos a versão **9.1.7**
* Extrair o zip e executar o arquivo **bin/grafana-server.exe**, que faz subir o servidor do Grafana na **porta 3000**
* Acessar o endereço **http://locahost:3000** no navegador, o console do Grafana deve ser exibido com sucesso

**Obs:** o usuário e senha padrão para primeiro acesso é "admin"

### Integração Prometheus x Grafana
* Acessamos o console do Grafana e criamos um novo **Data Source**
* Na sua configuração, informamos o **tipo** "Prometheus", a **URL** do Prometheus local (http://locahost:9090) e o **access** com a opção "Server"
* As outras configurações (autenticação, alertas, etc) deixamos com o valor padrão

**Obs:** Como temos acesso ao servidor do Prometheus podemos usar o access "Server", caso contrário precisaríamos usar o access "Browser"

### Referências:
https://prometheus.io/docs/prometheus/latest/installation/
https://github.com/prometheus/prometheus/releases/download/v2.39.0/prometheus-2.39.0.windows-amd64.zip
https://grafana.com/docs/grafana/v9.0/setup-grafana/installation/
https://dl.grafana.com/oss/release/grafana-9.1.7.windows-amd64.zip
https://programmersought.com/article/37905525090/