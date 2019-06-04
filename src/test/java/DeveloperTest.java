import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Lauren", "JL4321", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Lauren", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("JL4321", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(32000, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, developer.payBonus(), 0.1);
    }
}
