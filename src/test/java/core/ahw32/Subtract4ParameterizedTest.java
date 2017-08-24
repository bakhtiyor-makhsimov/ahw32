package core.ahw32;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import org.junit.runners.Parameterized.Parameters;

import core.ahw32.Calculator;

@RunWith(Parameterized.class)

public class Subtract4ParameterizedTest {
	@Parameters(name = "Parameter # {index}: {1} - {2} - {3} - {4} = {0}")

    public static Collection<Double[]> subtractNumbers() {
	
    	return Arrays.asList(new Double[][] {
        { 4.0, 10.0, 2.0, 3.0, 1.0 },  // { 0.5, 1.0, 2.0 }, 
        { 4.0, 15.0, 5.0, 4.0, 2.0 },  // { 0.66, 2.0, 3.0 }, 
        { 1.0, 9.0, 5.0, 1.0, 2.0 },  // { 0.75, 3.0, 4.0 }, 
        { 0.25, 5.0, 3.5, 1.0, 0.25 },  // { 0.8, 4.0, 5.0 },
    	});
    }

	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;
	@Parameter(value = 4) public Double four;

	@Test
	public void subtract() {
       System.out.println(first + " - " + second + " - " + third + " - " + four + " = " + expected);
       assertEquals("Not correct", Calculator.subtract(first, second, third, four), expected, 0.09);
	}
}
