package Com.QATechTesting.Mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class TestCalculator {
	
	CalculatorService calService= Mockito.mock(CalculatorService.class);
	Calculator calc= new Calculator(calService);
	
	@Test
	public void testPerform()
	{
		when(calService.add(2, 3)).thenReturn(5);
		System.out.println(calService.add(2, 3));
		assertEquals(10,calc.perform(2, 3));
		//Verify if the response is coming from Mock service
		//verify(calService).add(2, 3);
	}

}
