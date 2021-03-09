import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SimpleTests {

    @Test
    void successTest() {
        assertThat(true, is(true));

    }

    @Test
    void negativeTest() {
        assertThat(true, is(false));

    }
}
