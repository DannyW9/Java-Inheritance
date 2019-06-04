import org.junit.Before;
import org.junit.Test;
import staff.Management.Director;

import static org.junit.Assert.assertEquals;


public class DirectorTest{

    private Director director;

    @Before
    public void setUp() {
        director = new Director("Pablo", "PB7890", 50000, "Operations", 100000);
    }

    @Test
    public void hasName() {
        assertEquals("Pablo", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("PB7890", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget() {
        assertEquals(100000, director.getBudget(), 0.1);
    }
}
