# 🪙 Cara ou Coroa - Simulador de Sorteio

O **Cara ou Coroa** é um aplicativo Android desenvolvido em **Java** que utiliza a navegação entre telas para exibir o resultado de um sorteio aleatório. O projeto foca no uso de `Intents` para transporte de dados e na manipulação dinâmica de recursos visuais (Imagens) de acordo com a lógica do sistema.

## 🎯 Funcionalidades e Estrutura
O sistema gera um valor aleatório e direciona o usuário para uma tela de resultado personalizada, permitindo o retorno para novas tentativas.

| Recurso | Descrição | Componente Envolvido |
| :--- | :--- | :--- |
| **Interface Inicial** | Tela de entrada com identidade visual e botão de ação. | `ImageView` e `Button` |
| **Lógica de Sorteio** | Algoritmo que gera números aleatórios para decidir o resultado. | `java.util.Random` |
| **Navegação (Intent)** | Transição de dados entre a Activity principal e a de resultado. | `Intent` (putExtras / getSerializable) |
| **Exibição Dinâmica** | Renderização da imagem da moeda (Cara ou Coroa) conforme o sorteio. | `ImageView` (setImageResource) |

## 📊 Regras de Negócio (Lógica de Decisão)
O aplicativo segue critérios simples para garantir a imparcialidade do sorteio:
* **Acionamento**: O usuário inicia o evento através do botão "Jogar".
* **Sorteio**: O sistema gera um número entre **0 e 1**.
* **Resultado**: 
  * Se o resultado for **0**: O app carrega o recurso `@drawable/moeda_cara`.
  * Se o resultado for **1**: O app carrega o recurso `@drawable/moeda_coroa`.

## 🛠️ Configurações e Tecnologias
* **Linguagem:** Java.
* **Plataforma:** Android (SDK Nativa).
* **Compatibilidade:** Android 7.0+ (API 24).
* **Interface:** XML (LinearLayout com elementos centralizados).
* **Ícones:** Adaptive Icons configurados com `Image Asset` para compatibilidade com temas de dispositivos modernos.
* **IDE:** Android Studio.

## ⚙️ Instruções de Instalação (Setup)
Para rodar o projeto em sua máquina local ou emular no Android Studio:

1. **Clone o Repositório:**
   ```bash
   git clone [https://github.com/rossinoli/cara-ou-coroa.git]
