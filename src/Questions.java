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
