package duke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DukeTest {
    @Test
    public void empty(){
        Duke d = new Duke();
        assertEquals(2, 2);
    }
}