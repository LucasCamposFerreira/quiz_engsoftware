public class Questions {
    public static void main(String[] args) {

        String nome = args.length > 0 ? args[0] : "Aluno";
        int correct = 0;
        int error = 0;

        Ask[] questions = new Ask[15];

        questions[0] = new Ask();
        questions[0].pergunta = "1 - Como criar um gradiente de cores no CorelDRAW?";
        questions[0].opcaoA = "a) Usando a ferramenta Preenchimento Uniforme";
        questions[0].opcaoB = "b) Utilizando a ferramenta Transparência";
        questions[0].opcaoC = "c) Aplicando um efeito de Contorno";
        questions[0].opcaoD = "d) Usando a ferramenta Preenchimento Gradiente";
        questions[0].opcaoE = "e) Editando diretamente na barra de propriedades";
        questions[0].correta = "d";

        questions[1] = new Ask();
        questions[1].pergunta = "2 - Qual a melhor maneira de converter uma imagem em vetor no CorelDRAW?";
        questions[1].opcaoA = "a) Desenhar manualmente por cima";
        questions[1].opcaoB = "b) Usar a ferramenta PowerTRACE";
        questions[1].opcaoC = "c) Usar a ferramenta Bézier";
        questions[1].opcaoD = "d) Aplicar a ferramenta Contorno";
        questions[1].opcaoE = "e) Converter em bitmap antes";
        questions[1].correta = "b";

        questions[2] = new Ask();
        questions[2].pergunta = "3 - O que faz a ferramenta 'Forma' no CorelDRAW?";
        questions[2].opcaoA = "a) Adiciona novos elementos ao projeto";
        questions[2].opcaoB = "b) Edita pontos de nó em curvas e linhas";
        questions[2].opcaoC = "c) Cria formas geométricas automaticamente";
        questions[2].opcaoD = "d) Aplica efeitos de transparência";
        questions[2].opcaoE = "e) Mescla objetos vetoriais";
        questions[2].correta = "b";

        questions[3] = new Ask();
        questions[3].pergunta = "4 - Qual ferramenta no CorelDRAW permite mesclar objetos suavemente?";
        questions[3].opcaoA = "a) Ferramenta de Contorno";
        questions[3].opcaoB = "b) Ferramenta de Distorção";
        questions[3].opcaoC = "c) Ferramenta de Extrusão";
        questions[3].opcaoD = "d) Ferramenta de Mesclagem";
        questions[3].opcaoE = "e) Ferramenta de Transformação";
        questions[3].correta = "d";

        questions[4] = new Ask();
        questions[4].pergunta = "5 - Como posso criar um efeito de transparência em um objeto no CorelDRAW?";
        questions[4].opcaoA = "a) Aplicando a ferramenta de Preenchimento Gradiente";
        questions[4].opcaoB = "b) Usando a ferramenta Transparência";
        questions[4].opcaoC = "c) Aplicando a ferramenta PowerTRACE";
        questions[4].opcaoD = "d) Usando a ferramenta Contorno";
        questions[4].opcaoE = "e) Alterando o modo de mesclagem";
        questions[4].correta = "b";

        questions[5] = new Ask();
        questions[5].pergunta = "6 - Qual o atalho para duplicar um objeto no CorelDRAW?";
        questions[5].opcaoA = "a) Ctrl + D";
        questions[5].opcaoB = "b) Ctrl + C";
        questions[5].opcaoC = "c) Ctrl + V";
        questions[5].opcaoD = "d) Ctrl + X";
        questions[5].opcaoE = "e) Alt + D";
        questions[5].correta = "a";

        questions[6] = new Ask();
        questions[6].pergunta = "7 - Qual é o formato padrão de arquivo para salvar projetos no CorelDRAW?";
        questions[6].opcaoA = "a) .ai";
        questions[6].opcaoB = "b) .eps";
        questions[6].opcaoC = "c) .cdr";
        questions[6].opcaoD = "d) .pdf";
        questions[6].opcaoE = "e) .svg";
        questions[6].correta = "c";

        questions[7] = new Ask();
        questions[7].pergunta = "8 - Como posso alinhar objetos no CorelDRAW?";
        questions[7].opcaoA = "a) Usando o menu Organizar > Alinhar e Distribuir";
        questions[7].opcaoB = "b) Usando a ferramenta de Bézier";
        questions[7].opcaoC = "c) Criando uma camada de ajuste";
        questions[7].opcaoD = "d) Ajustando manualmente no teclado";
        questions[7].opcaoE = "e) Usando a ferramenta Transparência";
        questions[7].correta = "a";

        questions[8] = new Ask();
        questions[8].pergunta = " 9 - Como posso exportar um projeto do CorelDRAW para um formato compatível com a web?";
        questions[8].opcaoA = "a) Salvar como .cdr";
        questions[8].opcaoB = "b) Exportar como .png ou .jpg";
        questions[8].opcaoC = "c) Salvar como .pdf";
        questions[8].opcaoD = "d) Usar a ferramenta de Impressão";
        questions[8].opcaoE = "e) Exportar como .ai";
        questions[8].correta = "b";

        questions[9] = new Ask();
        questions[9].pergunta = "10 - Qual ferramenta do CorelDRAW permite criar perspectivas em objetos?";
        questions[9].opcaoA = "a) Ferramenta de Contorno";
        questions[9].opcaoB = "b) Ferramenta de Extrusão";
        questions[9].opcaoC = "c) Ferramenta de Distorção";
        questions[9].opcaoD = "d) Ferramenta de Sombreamento";
        questions[9].opcaoE = "e) Ferramenta de Mesclagem";
        questions[9].correta = "b";

        questions[10] = new Ask();
        questions[10].pergunta = "11 - Qual ferramenta no CorelDRAW permite adicionar sombras a objetos?";
        questions[10].opcaoA = "a) Ferramenta de Distorção";
        questions[10].opcaoB = "b) Ferramenta de Extrusão";
        questions[10].opcaoC = "c) Ferramenta de Sombreamento";
        questions[10].opcaoD = "d) Ferramenta de Transparência";
        questions[10].opcaoE = "e) Ferramenta de Mesclagem";
        questions[10].correta = "c";

        questions[11] = new Ask();
        questions[11].pergunta = "12 - Como posso adicionar texto ao redor de um objeto circular no CorelDRAW?";
        questions[11].opcaoA = "a) Usando a ferramenta Texto Artístico";
        questions[11].opcaoB = "b) Usando a ferramenta Texto de Parágrafo";
        questions[11].opcaoC = "c) Aplicando a opção Ajustar Texto ao Caminho";
        questions[11].opcaoD = "d) Usando a ferramenta Contorno";
        questions[11].opcaoE = "e) Usando a ferramenta Mesclagem";
        questions[11].correta = "c";

        questions[12] = new Ask();
        questions[12].pergunta = "13 - Qual ferramenta no CorelDRAW permite criar padrões repetidos automaticamente?";
        questions[12].opcaoA = "a) Ferramenta Preenchimento Padrão";
        questions[12].opcaoB = "b) Ferramenta de Transparência";
        questions[12].opcaoC = "c) Ferramenta de Extrusão";
        questions[12].opcaoD = "d) Ferramenta Preenchimento Gradiente";
        questions[12].opcaoE = "e) Ferramenta de Distorção";
        questions[12].correta = "a";

        questions[13] = new Ask();
        questions[13].pergunta = "14 - Como posso bloquear um objeto no CorelDRAW para que ele não seja movido acidentalmente?";
        questions[13].opcaoA = "a) Usando a ferramenta Bloqueio";
        questions[13].opcaoB = "b) Aplicando a opção Organizar > Bloquear Objeto";
        questions[13].opcaoC = "c) Usando a ferramenta de Mesclagem";
        questions[13].opcaoD = "d) Editando na barra de propriedades";
        questions[13].opcaoE = "e) Usando a ferramenta de Transparência";
        questions[13].correta = "b";

        questions[14] = new Ask();
        questions[14].pergunta = "15 - Qual é o processo para alinhar múltiplos objetos centralmente no CorelDRAW?";
        questions[14].opcaoA = "a) Usar a ferramenta de Transparência";
        questions[14].opcaoB = "b) Usar o comando Organizar > Alinhar e Distribuir > Centralizar em Página";
        questions[14].opcaoC = "c) Aplicar o efeito de Extrusão";
        questions[14].opcaoD = "d) Usar a ferramenta de Contorno";
        questions[14].opcaoE = "e) Usar a ferramenta de Distorção";
        questions[14].correta = "b";

        for (int i = 0; i < 15; i++) {
            questions[i].escrevaQuestao();
            String userResponse = questions[i].leiaResposta();
            if (questions[i].isCorreta(userResponse)) {
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
