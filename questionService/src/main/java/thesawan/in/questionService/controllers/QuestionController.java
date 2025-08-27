package thesawan.in.questionService.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thesawan.in.questionService.entities.Question;
import thesawan.in.questionService.services.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping("/create")
    public Question create(@RequestBody Question question) {
        return questionService.create(question);
    }

    // Get all Questions
    @GetMapping("/all")
    public List<Question> getAll() {
        return questionService.get();
    }

    // Get Question by ID
    @GetMapping("/{id}")
    public Question getById(@PathVariable Long id) {
        return questionService.getById(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionOfQuiz(quizId);

    }
}
