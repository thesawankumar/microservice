package thesawan.in.quizService.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thesawan.in.quizService.entities.Quiz;
import thesawan.in.quizService.repository.QuizRepository;
import thesawan.in.quizService.services.QuizService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {
    private final QuizRepository quizRepository;

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getById(Long id) {
        return quizRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Quiz for this id not found"));
    }
}
