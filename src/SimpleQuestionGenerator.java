import java.util.ArrayList;
import java.util.List;


public class SimpleQuestionGenerator implements QuestionGenerator {
    @Override
    public List<Question> generate() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Czy Polska leży w Europie?", true));
        questions.add(new Question("Czy 2 + 2 = 4?", true));
        questions.add(new Question("Czy Wisła to rzeka w Europie?", true));
        questions.add(new Question("Czy Polska leży na kontynencie azjatyckim?", false));
        questions.add(new Question("Czy programowanie jest łatwe?", false));
        questions.add(new Question("Czy programowanie jest super?", true));
        return questions;
    }
}
