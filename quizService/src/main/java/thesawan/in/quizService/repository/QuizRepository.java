package thesawan.in.quizService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thesawan.in.quizService.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
