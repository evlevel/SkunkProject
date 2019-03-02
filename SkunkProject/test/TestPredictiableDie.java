import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPredictiableDie
{
	private PredictableDie pd;
	
	@Before
	public void setUp()
	{
		pd = new PredictableDie();
		
	}
	
	@Test
	public void test_predictible_die_one_value()
	{
		pd.setThrowSequence(new int[] {1});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
	}
	
	@Test
	public void test_predictible_die_two_values()
	{
		pd.setThrowSequence(new int[] {1,2});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(2, pd.getLastRoll());
		
	}
	
	@Test
	public void test_predictible_die_two_values_wraparound()
	{
		pd.setThrowSequence(new int[] {1,2});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(2, pd.getLastRoll());
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
	}
	
	@Test (expected=RuntimeException.class)
	
	public void test_predictible_die_empty_initializer()
	{
		pd.setThrowSequence(new int[] {});
		
		pd.roll();
		
		assertEquals(1, pd.getLastRoll());
		
	}
	
	

}
