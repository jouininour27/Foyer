package tn.esprit.spring;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Ajouté pour autoriser les méthodes non-static
@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Important pour que @Order fonctionne
@ActiveProfiles("test")

public class BlocServiceTest {

  @BeforeAll
  void bedore() {
    // initialisation avant tous les tests
  }

  @AfterAll
  void after() {
    // nettoyage après tous les tests
  }

  @BeforeEach
  void beforeEach() {
    // avant chaque test
  }

  @AfterEach
  void afterEach() {
    // après chaque test
  }

  @Order(1)
  @RepeatedTest(4)
  void test() {
    // test répété
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
