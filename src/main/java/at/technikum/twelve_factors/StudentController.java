package at.technikum.twelve_factors;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping("/students")
  public List<Student> findAll() {
    return studentService.findAll();
  }

  @GetMapping("student/{id}")
  public Student findById(@PathVariable Long id) {
    return studentService.findById(id);
  }

  @PostMapping("student")
  public Student store(@RequestBody Student student) {
    return studentService.store(student);
  }

}
