package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ActiveProfiles;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ActiveProfiles("test")

public class BlocServiceMockTest {

  @BeforeAll
  void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Order(1)
  @Test
  void test() {
    // test unitaire simulé
  }

  @Order(2)
  @Test
  void test3() {
    // test 3
  }

  @Order(3)
  @Test
  void test4() {
    // test 4
  }

  @Order(4)
  @Test
  void test2() {
    // test 2
  }
}
