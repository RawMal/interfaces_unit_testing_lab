package model;

import model.interfaces.IAnimal;
import model.interfaces.ISwim;
import model.interfaces.IHunt;
import model.interfaces.IRun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TigerTest {
    public Tiger tiger;
    public Class<?> tigerClass;

    @BeforeEach
    public void setUp(){
        this.tiger = new Tiger();
        this.tigerClass = Tiger.class;
    }

    @Test
    public void implementsIRun(){
        // Hint: you need to create IFly interface, assign it to eagle, and import it above to pass the test
        assertThat(IRun.class.isAssignableFrom(tigerClass)).isTrue();
    }

    @Test
    public void implementsIAnimal(){
        assertThat(IAnimal.class.isAssignableFrom(tigerClass)).isTrue();
    }

    @Test
    public void implementsIHunt() {
        assertThat(IHunt.class.isAssignableFrom(tigerClass)).isTrue();
    }

    @Test
    public void implementsISwim() {
        assertThat(ISwim.class.isAssignableFrom(tigerClass)).isTrue();
    }


    @Test
    public void canEat() throws NoSuchMethodException {
        assertThat(tigerClass.getMethod("eat")).isNotNull();
    }

    @Test
    public void canSleep() throws NoSuchMethodException {
        assertThat(tigerClass.getMethod("sleep")).isNotNull();
    }

    @Test
    public void canRun() throws NoSuchMethodException {
        assertThat(tigerClass.getMethod("run")).isNotNull();
    }

    @Test
    public void canSwim() throws NoSuchMethodException {
        assertThat(tigerClass.getMethod("swim")).isNotNull();
    }
}
