# Projeto Final — Programação Orientada a Objetos com Java

## Objetivo

Aplicar os conceitos discutidos durante a disciplina de Orientação a Objetos, desenvolvendo em grupo uma aplicação Java completa. O projeto deverá contemplar documentação, modelagem, implementação com persistência de dados e apresentação final.

---

## Tema do Projeto

O grupo deve identificar um problema do mundo real e propor uma solução automatizada por meio de um sistema orientado a objetos. 

---

## 📄 Entregáveis

### 1. Documentação

A documentação deve ser entregue em formato PDF ou arquivo de markdown e conter:
- **Título do projeto**
- **Integrantes do grupo** (nome completo)
- **Descrição geral do problema e da solução**
- **Requisitos funcionais** (mínimo 4)
- **Casos de uso** (mínimo 4, em diagrama ou descrição textual dos fluxos principais)
- **Diagrama de classes** com:
  - Classes de modelo
  - Relacionamentos (associação, herança, composição, etc.)
  - Atributos e métodos principais

Não há um template padrão para este documento, mas o grupo deve apresentar um documento organizado e bem formatado. 

---

### 2. Protótipo funcional (código)

- Linguagem: Java
- Persistência de dados obrigatória
- Interface com o usuário: textual (menus interativos) ou visual (Swing, JavaFX) — a qualidade da interface **não é** um item de avaliação 
- O projeto deve seguir **boas práticas de programação orientada a objetos**, como:
  - Encapsulamento
  - Herança 
  - Polimorfismo
  - Uso de interfaces
  - Uso de coleções (`List`, `Map`, etc. se fizer sentido)

#### Organização sugerida de pacotes:

O projeto deve estar organizado em pacotes, de acordo com a necessidade do projeto. Um sugestão de árvore do projeto é a seguinte:
```textplan
projeto/
aplicacao/ → Classe principal (main)
modelo/ → Classes de domínio
servico/ → Regras de negócio (casos de uso)
persistencia/ → Salvamento e recuperação de dados
ui/ → Interface com o usuário (menus ou GUI)
```
Considere ainda a estrutura básica do construtor de projeto (Maven, por exemplo).


---

### 3. Apresentação

Cada grupo deverá apresentar o projeto na forma de seminário, com duração máxima de 30 minutos.

A apresentação deve incluir:

- Descrição do problema abordado
- Explicação da modelagem (casos de uso e diagrama de classes)
- Demonstração do protótipo em funcionamento
- Pontos positivos e dificuldades enfrentadas durante o desenvolvimento

---

## Data de Entrega

**Todos os materiais deverão ser entregues no dia 30/07/2025.**

O grupo deverá publicar o projeto no GitHub, incluindo um arquivo `README.md` com instruções de execução do sistema. O projeto deve ser público para consulta, com o link compartilhado com o professor como resposta ao trabalho da disciplina no Suap.

## Avaliação

Esse projeto contempla duas das três avaliações da etapa 2 da disciplina de Orientação a Objetos. As entregas da documentação e do protótipo funcional forma uma avaliação, que tem nota em grupo. A apresentação é outra avaliação, sendo esta individual. 