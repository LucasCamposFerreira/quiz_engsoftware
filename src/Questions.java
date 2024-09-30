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

        questoes[3] = new Ask();
        questoes[3].pergunta = "4 - Qual ferramenta no CorelDRAW permite mesclar objetos suavemente?";
        questoes[3].opcaoA = "a) Ferramenta de Contorno";
        questoes[3].opcaoB = "b) Ferramenta de Distorção";
        questoes[3].opcaoC = "c) Ferramenta de Extrusão";
        questoes[3].opcaoD = "d) Ferramenta de Mesclagem";
        questoes[3].opcaoE = "e) Ferramenta de Transformação";
        questoes[3].correta = "d";

        questoes[4] = new Ask();
        questoes[4].pergunta = "5 - Como posso criar um efeito de transparência em um objeto no CorelDRAW?";
        questoes[4].opcaoA = "a) Aplicando a ferramenta de Preenchimento Gradiente";
        questoes[4].opcaoB = "b) Usando a ferramenta Transparência";
        questoes[4].opcaoC = "c) Aplicando a ferramenta PowerTRACE";
        questoes[4].opcaoD = "d) Usando a ferramenta Contorno";
        questoes[4].opcaoE = "e) Alterando o modo de mesclagem";
        questoes[4].correta = "b";

        questoes[5] = new Ask();
        questoes[5].pergunta = "6 - Qual o atalho para duplicar um objeto no CorelDRAW?";
        questoes[5].opcaoA = "a) Ctrl + D";
        questoes[5].opcaoB = "b) Ctrl + C";
        questoes[5].opcaoC = "c) Ctrl + V";
        questoes[5].opcaoD = "d) Ctrl + X";
        questoes[5].opcaoE = "e) Alt + D";
        questoes[5].correta = "a";

        questoes[6] = new Ask();
        questoes[6].pergunta = "7 - Qual é o formato padrão de arquivo para salvar projetos no CorelDRAW?";
        questoes[6].opcaoA = "a) .ai";
        questoes[6].opcaoB = "b) .eps";
        questoes[6].opcaoC = "c) .cdr";
        questoes[6].opcaoD = "d) .pdf";
        questoes[6].opcaoE = "e) .svg";
        questoes[6].correta = "c";

        questoes[7] = new Ask();
        questoes[7].pergunta = "8 - Como posso alinhar objetos no CorelDRAW?";
        questoes[7].opcaoA = "a) Usando o menu Organizar > Alinhar e Distribuir";
        questoes[7].opcaoB = "b) Usando a ferramenta de Bézier";
        questoes[7].opcaoC = "c) Criando uma camada de ajuste";
        questoes[7].opcaoD = "d) Ajustando manualmente no teclado";
        questoes[7].opcaoE = "e) Usando a ferramenta Transparência";
        questoes[7].correta = "a";

        questoes[8] = new Ask();
        questoes[8].pergunta = " 9 - Como posso exportar um projeto do CorelDRAW para um formato compatível com a web?";
        questoes[8].opcaoA = "a) Salvar como .cdr";
        questoes[8].opcaoB = "b) Exportar como .png ou .jpg";
        questoes[8].opcaoC = "c) Salvar como .pdf";
        questoes[8].opcaoD = "d) Usar a ferramenta de Impressão";
        questoes[8].opcaoE = "e) Exportar como .ai";
        questoes[8].correta = "b";

        

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
