package model;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IPrey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PuffinTest {
    public Puffin puffin;
    public Class<?> puffinClass;

    @BeforeEach
    public void setUp(){
        this.puffin = new Puffin();
        this.puffinClass = Puffin.class;
    }

    @Test
    public void implementsIFly(){
        // Hint: you need to create IFly interface, assign it to eagle, and import it above to pass the test
        assertThat(IFly.class.isAssignableFrom(puffinClass)).isTrue();
    }

    @Test
    public void implementsIAnimal(){
        assertThat(IAnimal.class.isAssignableFrom(puffinClass)).isTrue();
    }

    @Test
    public void implementsIPrey() {
        assertThat(IPrey.class.isAssignableFrom(puffinClass)).isTrue();
    }

    @Test
    public void canEat() throws NoSuchMethodException {
        assertThat(puffinClass.getMethod("eat")).isNotNull();
    }

    @Test
    public void canSleep() throws NoSuchMethodException {
        assertThat(puffinClass.getMethod("sleep")).isNotNull();
    }

    @Test
    public void canFly() throws NoSuchMethodException {
        assertThat(puffinClass.getMethod("fly")).isNotNull();
    }

    @Test
    public void canFlee() throws NoSuchMethodException {
        assertThat(puffinClass.getMethod("flee")).isNotNull();
    }
}
