# :coffee: Fundamentos de Java
Esse projeto utiliza conceitos de abstração para criar classes em Java, implementa getters e setters para acessar e modificar atributos e usa os tipos primitivos e não primitivos, estrutura de repetição em conjuntos e herança para criar classes derivadas de outras classes.

## ⚙️ Instalação das dependências
Para instalar as dependências do projeto, execute o comando `mvn install`. Isso fará o download das dependências configuradas no `pom.xml`, além de baixar as dependências indiretas.

## :mag: Testes
Para executar os testes, execute o comando `mvn test`.

## 🧹 Linter (Checkstyle)
O Checkstyle é usado para fazer a análise estática do código. Este projeto já vem com as dependências relacionadas ao linter configuradas no arquivo `pom.xml`. O Checkstyle já é executado juntamente aos testes. No entanto, caso deseje rodar o Checkstyle manualmente, basta executar o comando `mvn checkstyle:check`.

## :white_check_mark: Funcionalidades Implementadas
### (1) Controle da Lâmpada
Algoritmo para controlar o estado de uma lâmpada com os seguintes métodos:
- `ligarLampada`: muda o estado da lâmpada para ligada.
- `desligarLampada`: muda o estado da lâmpada para desligada.
- `isLampadaLigada`: verifica e informa se a lâmpada está ligada ou desligada.

### (2) Monitoramento do Residente
A Classe `Residente` foi criada com os seguintes atributos:
- nome: do tipo String.
- idade: do tipo int.
- peso: do tipo double.
- altura: do tipo double.

### (3) Cálculo do IMC
Para calcular o IMC, foi criado o método `calcularImc`, que armazena o resultado em uma variável do tipo double e o imprime no terminal.

### (4) Conexão à Internet
A classe `SmartHouse` possui o método `conectarInternet` que simula a tentativa de conexão à internet. A taxa de sucesso da conexão é fornecida como argumento e o método retorna true se a conexão for bem-sucedida ou false caso contrário.

## :information_source: Considerações finais
Este projeto é apenas para fins educacionais. Qualquer dúvida ou sugestão, sinta-se à vontade para entrar em contato.
