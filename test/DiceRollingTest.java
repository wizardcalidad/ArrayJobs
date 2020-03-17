import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollingTest {
    Dice dice;
    @BeforeEach
    void setUp() throws Exception{
        dice = new Dice();
    }

    @Test
    void test(){
        assertNotNull(dice);
    }

    @Test
    void rollDice(){
        assert(dice.rollDice()<=12);
    }

    @Test
    public void countFrequencyTest(){
        dice.countFrequency();
    }

}