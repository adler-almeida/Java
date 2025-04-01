# ☕️ Java
 Repositório de aprendizado e referência sobre Java! Contém exemplos práticos, conceitos fundamentais e comparações entre linguagens para facilitar a transição e o aprendizado.

# 🚀 Aprendendo Java do Zero

Este repositório tem como objetivo armazenar atividades e ensinamentos sobre Java, servindo como material de consulta tanto para quem está aprendendo do zero quanto para aqueles que estão migrando de outra linguagem de programação.

## 📌 Sumário

- [📖 Introdução ao Java](#-introdução-ao-java)
- [🔍 Estrutura básica de uma classe Java](#-estrutura-básica-de-uma-classe-java)
- [🛠 Criando seu primeiro programa no IntelliJ IDEA](#-criando-seu-primeiro-programa-no-intellij-idea)
- [🎨 Convenções de nomenclatura e CamelCase](#-convenções-de-nomenclatura-e-camelcase)

---

## 📖 Introdução ao Java

O **Java** é uma linguagem de programação orientada a objetos e multiplataforma. Seu código é compilado para **bytecode**, que é interpretado pela **Java Virtual Machine (JVM)**, tornando-o independente de sistema operacional.

### 🔹 Características do Java:

✅ Sintaxe clara e estruturada  
✅ Linguagem fortemente tipada  
✅ Suporte à orientação a objetos  
✅ Escrito uma vez, executado em qualquer lugar (*Write Once, Run Anywhere*)

---

## 🔍 Estrutura básica de uma classe Java

No Java, todo código precisa estar dentro de uma **classe**. O primeiro comando essencial em qualquer arquivo Java é o **cabeçalho da classe**.

```java
public class PrimeiroPrograma { // Nome da classe deve começar com letra maiúscula
    public static void main(String[] args) { // Método principal (main)
        System.out.print("Olá, Mundo!"); // Exibe mensagem na tela
    }
}
```

### 🛑 Regras básicas:
✔ O nome da classe deve começar com letra maiúscula.  
✔ Deve estar dentro de um **arquivo .java** com o mesmo nome da classe.  
✔ O método `main` é o ponto de entrada da aplicação.

---

## 🛠 Criando seu primeiro programa no IntelliJ IDEA

### 📌 Passo a passo para criar um **package** e uma **classe** no IntelliJ IDEA:

1. **Abrir o IntelliJ IDEA Community**
2. **Criar um novo projeto Java**
3. **Dentro da pasta `src`, criar um "package"** (exemplo: `meuprimeiropacote`)
4. **Dentro do package, criar uma nova classe Java**
5. **Nomeie a classe como `PrimeirosContatos`**
6. **Escreva o código abaixo:**

```java
package primeiroscontatos; // Nome do pacote deve ser minúsculo

public class PrimeirosContatos {
    public static void main(String[] args) { // psvm + tab (atalho)
        System.out.print("Olá, Mundo!"); // sout + tab (atalho)
    }
}
```

> **Observação:**  
> No IntelliJ IDEA, alguns atalhos podem facilitar sua programação:
> - `psvm + TAB` → Gera automaticamente o método `main`
> - `sout + TAB` → Insere `System.out.print()`

---

## 🎨 Convenções de nomenclatura e CamelCase

No Java, existem algumas regras e convenções para nomear variáveis, classes e métodos.

### 📌 **1. CamelCase**
O **CamelCase** é um padrão de nomenclatura no qual cada palavra dentro do nome começa com uma letra maiúscula, **sem espaços ou underscores**.

Existem duas variações:

✔ **PascalCase** → Usado para classes e arquivos Java:
   ```java
   public class NomeDaClasse { }
   ```  
✔ **camelCase** → Usado para variáveis e métodos:
   ```java
   int minhaVariavel = 10;
   void meuMetodo() { }
   ```  

### 📌 **2. Regras básicas de nomenclatura**

- **Nomes de classes** → Sempre começam com **letra maiúscula** (`PrimeiroPrograma`).
- **Nomes de variáveis e métodos** → Começam com **letra minúscula** e seguem **camelCase** (`minhaVariavel`, `executarProcesso()`).
- **Constantes** → São escritas em **letras maiúsculas** com **underscores** (`TAMANHO_MAXIMO`).
- **Pacotes** → Devem ser escritos **em minúsculo** (`primeiroprograma`).

---

## 📚 Conclusão

Esse repositório servirá como um guia de aprendizado para iniciantes em Java, abordando desde conceitos básicos até tópicos mais avançados. Se você está migrando de outra linguagem, encontrará comparações e explicações para facilitar essa transição.

💡 **Sugestão:**  
Caso tenha alguma dúvida ou queira contribuir com melhorias, fique à vontade para abrir uma issue ou enviar um pull request! 🚀

---

📌 **Autor:** Adler Almeida  
📅 **Última atualização:** 01/04/2025  
