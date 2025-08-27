package thesawan.in.questionService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thesawan.in.questionService.entities.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuizId(Long quizId);
}
