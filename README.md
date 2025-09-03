# Abstraindo um Bootcamp Usando Orientação a Objetos em Java 🚀
---

## Desafio de Projeto: Aprendendo na Prática Programação Orientada a Objetos

Este projeto pertence ao desafio de código da Bootcamp da GFT na DIO, focado em colocar em prática os principais conceitos da Programação Orientada a Objetos (POO) em Java.

## Visão Geral do Projeto ✨
Este projeto Java simula a dinâmica de um bootcamp de programação para demonstrar os conceitos fundamentais da Programação Orientada a Objetos (POO). O sistema é composto por um conjunto de classes que interagem para gerenciar conteúdos, desenvolvedores e o progresso de aprendizado.

### Classes do Projeto 📂
Conteudo.java: Esta é uma classe abstrata que serve como base para todos os tipos de conteúdo de aprendizado. Ela define atributos comuns, como titulo e descricao, e estabelece um método abstrato calcularXp(), que obriga as classes filhas a implementarem sua própria lógica de cálculo de experiência.

Curso.java: Esta classe representa um curso dentro do bootcamp. Ela herda de Conteudo e adiciona um atributo específico: cargaHoraria. A classe implementa o método calcularXp() para calcular a experiência com base na carga horária.

Mentoria.java: Esta classe representa uma mentoria. Assim como Curso, ela herda de Conteudo e inclui um atributo exclusivo: data. Ela também implementa o método calcularXp(), mas com um valor fixo.

Dev.java: Esta classe representa um desenvolvedor inscrito no bootcamp. Ela gerencia dois conjuntos de conteúdos: os inscritos e os concluídos. O método inscreverBootcamp() adiciona todos os conteúdos do bootcamp à lista de inscritos. O método progredir() move um conteúdo da lista de inscritos para a de concluídos. O método calcularTotalXp() soma a experiência de todos os conteúdos concluídos.

Bootcamp.java: Esta classe atua como um agregador, reunindo um conjunto de conteudos e um conjunto de devsInscritos. O método inscreverBootcamp() na classe Dev utiliza esta classe para ter acesso aos conteúdos disponíveis.

Main.java: Esta é a classe principal do projeto. Nela, os objetos de Curso, Mentoria, Dev e Bootcamp são criados. A classe Main orquestra todas as interações do sistema, como a inscrição de desenvolvedores no bootcamp e o registro do progresso de cada um.

### Aplicação dos Pilares da POO 💡
O projeto utiliza os quatro pilares da Programação Orientada a Objetos:

Abstração: A classe Conteudo é uma abstração de um elemento de aprendizado, definindo o que é essencial (titulo, descricao, cálculo de XP) e ignorando detalhes específicos.

Encapsulamento: Os atributos de todas as classes são declarados como private para proteger seus dados, e o acesso e a manipulação são controlados por meio de métodos públicos (getters e setters).

Herança: As classes Curso e Mentoria herdam de Conteudo, reutilizando seus atributos e métodos, o que evita a duplicação de código.

Polimorfismo: O método calcularXp() se comporta de maneira diferente em cada classe filha (Curso e Mentoria), mesmo sendo chamado de forma genérica. Quando o método calcularTotalXp() na classe Dev é executado, ele chama o método calcularXp() de cada objeto de conteúdo, e o sistema executa a implementação correta para cada tipo (curso ou mentoria).
