import org.example.Creature;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test {
    @Test
    public void Test() {
        Creature creture = new Creature("dfs","fds",5,5,65,true,true,true,65,true);
        assertEquals("fds",creture.getSexe()
        );

    }
}
