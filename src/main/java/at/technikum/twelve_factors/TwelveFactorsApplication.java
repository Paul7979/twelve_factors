package at.technikum.twelve_factors;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@RequiredArgsConstructor
public class TwelveFactorsApplication implements CommandLineRunner {

  private final StudentService studentService;

  public static void main(String[] args) {
    SpringApplication.run(TwelveFactorsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Stream.of(
      new Student(null, "Test1", "Student1", "tes1t@mail.com"),
      new Student(null, "Test2", "Student2", "test2@mail.com"),
      new Student(null, "Test3", "Student3", "test3@mail.com")
      ).forEach(studentService::store);
  }
}
