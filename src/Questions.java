public class Questions {
    public static void main(String[] args) {

        String nome = args.length > 0 ? args[0] : "Aluno";
        int correct = 0;
        int error = 0;

        Ask[] questoes = new Ask[15];

        questoes[0] = new Ask();
        questoes[0].pergunta = "1 - Como criar um gradiente de cores no CorelDRAW?";
        questoes[0].opcaoA = "a) Usando a ferramenta Preenchimento Uniforme";
        questoes[0].opcaoB = "b) Utilizando a ferramenta Transparência";
        questoes[0].opcaoC = "c) Aplicando um efeito de Contorno";
        questoes[0].opcaoD = "d) Usando a ferramenta Preenchimento Gradiente";
        questoes[0].opcaoE = "e) Editando diretamente na barra de propriedades";
        questoes[0].correta = "d";

        questoes[1] = new Ask();
        questoes[1].pergunta = "2 - Qual a melhor maneira de converter uma imagem em vetor no CorelDRAW?";
        questoes[1].opcaoA = "a) Desenhar manualmente por cima";
        questoes[1].opcaoB = "b) Usar a ferramenta PowerTRACE";
        questoes[1].opcaoC = "c) Usar a ferramenta Bézier";
        questoes[1].opcaoD = "d) Aplicar a ferramenta Contorno";
        questoes[1].opcaoE = "e) Converter em bitmap antes";
        questoes[1].correta = "b";

        questoes[2] = new Ask();
        questoes[2].pergunta = "3 - O que faz a ferramenta 'Forma' no CorelDRAW?";
        questoes[2].opcaoA = "a) Adiciona novos elementos ao projeto";
        questoes[2].opcaoB = "b) Edita pontos de nó em curvas e linhas";
        questoes[2].opcaoC = "c) Cria formas geométricas automaticamente";
        questoes[2].opcaoD = "d) Aplica efeitos de transparência";
        questoes[2].opcaoE = "e) Mescla objetos vetoriais";
        questoes[2].correta = "b";

        for (int i = 0; i < 15; i++) {
            questoes[i].escrevaQuestao();
            String userResponse = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(userResponse)) {
                correct++;
            } else {
                error++;
            }
        }

        double percentAnswers = ((double) correct / 15) * 100;

        System.out.println("Resultado Final:");
        System.out.println("Aluno: " + nome);
        System.out.println("Acertos: " + correct + "/15.");
        System.out.println("Erros: " + error + "/15.");
        System.out.printf("Porcentagem de acertos: %.2f%%\n", percentAnswers);
    }
}
