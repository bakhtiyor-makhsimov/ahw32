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

public class Multiply3ParameterizedTest {
	
	@Parameters(name = "Parameter # {index}: {1} * {2} * {3} = {0}")

    public static Collection<Double[]> multiplyNumbers() {
	
    	return Arrays.asList(new Double[][] {
        { 48.0, 6.0, 4.0, 2.0 },  // { 0.5, 1.0, 2.0 }, 
        { 54.0, 9.0, 2.0, 3.0 },  // { 0.66, 2.0, 3.0 }, 
        { 48.0, 8.0, 2.0, 3.0 },  // { 0.75, 3.0, 4.0 }, 
        { 37.5, 5.0, 5.0, 1.5 },  // { 0.8, 4.0, 5.0 },
    	});
    }

	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;

	@Test
	public void multiply() {
       System.out.println(first + " * " + second + " * " + third + " = " + expected);
       assertEquals("Not correct", Calculator.multiply(first, second, third), expected, 0.09);
	}
}
