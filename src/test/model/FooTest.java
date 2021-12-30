package test.model;

import main.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FooTest {

    private Foo foo;

    @BeforeEach
    public void runBefore() {
        foo = new Foo();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(2, foo.add(1,1));
        Assertions.assertEquals(0, foo.add(-1,1));
        Assertions.assertEquals(5, foo.add(2,3));
    }
}
