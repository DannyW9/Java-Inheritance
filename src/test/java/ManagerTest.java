import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Dave", "JW1234", 25000, "R&D");
    }

    @Test
    public void hasName() {
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JW1234", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("R&D", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000);
        assertEquals(27000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(250, manager.payBonus(), 0.1);
    }

    @Test
    public void canChangeName() {
        manager.setName("David");
        assertEquals("David", manager.getName());
    }

    @Test
    public void cannotChangeName__Null() {
        manager.setName(null);
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void cannotChangeName__EmptyString() {
        manager.setName("");
        assertEquals("Dave", manager.getName());
    }
}
