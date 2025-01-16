import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {    
    
    // Tests are always public void
    @Test
    public void testLAppearsThreeTimesInHelloWorld() {
        // Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello world");
        // Act
        int actualCount = counter.getFrequency('l');
        // Assert
        assertEquals(3, actualCount);
    }

    @Test
    public void testNonOccuringCharacterPercentageIsZero() {
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");
        double actualPercentage = counter.getRelativePercentage('z');
        assertEquals(0.0, actualPercentage, 0.0001);
    }

}