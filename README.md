## 💳 Simulador de Carnê de Pagamento

Projeto desenvolvido em Java como parte dos meus estudos. O programa simula a geração de um carnê de pagamento parcelado, com aplicação de juros e validação de entrada.

---

## 📋 Funcionalidades

- Solicita nome do cliente, valor total da compra e número de parcelas
- Valida se o número de parcelas está entre 2 e 12 (repete a solicitação enquanto o valor for inválido)
- Aplica **juros de 2% ao mês** por parcela quando o número de parcelas for maior que 6
- Exibe o carnê completo com o valor de cada parcela
- Exibe o total pago ao final

---

## 🖥️ Exemplo de Saída

```
Digite seu nome: Isaque
Qual é o valor total da compra? 1000
Quer parcelar em quantas vezes (2 a 12)? 8

Cliente: Isaque
Parcela: 1/8: R$127,50
Parcela: 2/8: R$127,50
Parcela: 3/8: R$127,50
Parcela: 4/8: R$127,50
Parcela: 5/8: R$127,50
Parcela: 6/8: R$127,50
Parcela: 7/8: R$127,50
Parcela: 8/8: R$127,50
Total: R$1020,00
```

---

## 🧠 Conceitos Praticados

- Estruturas de repetição (`for`, `while`)
- Estruturas de condição (`if`)
- Leitura de dados com `Scanner`
- Cálculo de porcentagem e aplicação de juros
- Formatação de saída com `printf`

---


## 👨‍💻 Autor

**Isaque Costa da Cunha**  
Projeto parte da jornada de aprendizado em Java.
