package thesawan.in.quizService.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import thesawan.in.quizService.entities.Quiz;
import thesawan.in.quizService.services.QuizService;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @PostMapping("/create")
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }

    @GetMapping("/all")
    public List<Quiz> getAll() {
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id) {
        return quizService.getById(id);
    }
}
