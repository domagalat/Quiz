import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuestionFile implements QuestionGenerator {

    private String fileName;

    public QuestionFile() {
        fileName = "questions.txt";
    }

    public QuestionFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Question> generate() {

        List<Question> questions = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.endsWith("tak")) {
                    questions.add(new Question(line.replace("tak", "").trim(), true));
                }
                if (line.endsWith("nie")) {
                    questions.add(new Question(line.replace("nie", "").trim(), false));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return questions;
    }

    public static void main(String[] args) {
        QuestionFile questionFile = new QuestionFile();
        System.out.println(questionFile.generate().size());
    }
}
