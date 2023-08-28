package tema15.Exercitiu2;

import org.fasttrack.tema15.Exercitiu2.Person;
import org.fasttrack.tema15.Exercitiu2.PersonService;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceTest {

    private PersonService service;

    @BeforeEach
    public void initialSetUp() {
        List<Person> persons = new ArrayList<>();
        service = new PersonService(persons);
    }
}
