import model.Eagle;
import model.Puffin;
import model.Seal;
import model.Tiger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ZooTest {

    private Zoo zoo;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
    }

    @Test
    public void canAddAllAnimalTypes() {
        zoo.addAnimal(new Eagle());
        zoo.addAnimal(new Puffin());
        zoo.addAnimal(new Seal());
        zoo.addAnimal(new Tiger());
        assertThat(zoo.allAnimals.size()).isEqualTo(4);
    }
}
