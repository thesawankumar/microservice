package thesawan.in.quizService.services;

import thesawan.in.quizService.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz getById(Long id);
}
