package thesawan.in.questionService.services;

import thesawan.in.questionService.entities.Question;

import java.util.List;

public interface QuestionService {
    Question create(Question question);
    List<Question> get();
    Question getById(Long id);
    List<Question> getQuestionOfQuiz(Long quizId);
}
