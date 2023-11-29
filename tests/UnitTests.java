
import com.bridgelabz.LinkedList;
import org.junit.Test;

import java.io.ObjectInput;

import static org.junit.Assert.*;
public class UnitTests {
    @Test
    public void search(){
        LinkedList<Integer> list = new LinkedList<>(56);
        list.insertAtEnd(30);
        list.insertAtEnd(70);
        assertEquals(30,(int)list.search(30).data);
        assertNull(list.search(100));
    }

    @Test
    public void insertAtPosition(){
        LinkedList<Integer> list = new LinkedList<>(56);
        list.insertAtEnd(30);
        list.insertAtEnd(70);
        list.insertAtPosition(40,2);
        assertEquals(40, (int) list.search(30).next.data);
    }
}
