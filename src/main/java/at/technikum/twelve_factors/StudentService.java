package at.technikum.twelve_factors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public Student store(Student student) {
    return studentRepository.save(student);
  }

  public Student findById(Long id) {
    return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No student found for id"));
  }

  public List<Student> findAll() {
    return studentRepository.findAll();
  }

}
