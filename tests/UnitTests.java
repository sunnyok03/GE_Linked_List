
import com.bridgelabz.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
public class UnitTests {
    @Test
    public void search(){
        LinkedList<Integer> list = new LinkedList<>(56);
        list.insertAtEnd(30);
        list.insertAtEnd(70);
        assertTrue(list.search(30));
        assertFalse(list.search(100));
    }
}
