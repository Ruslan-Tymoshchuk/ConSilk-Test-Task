package pl.com.consilk;

import static org.junit.jupiter.api.Assertions.*;
import static  java.lang.System.lineSeparator;
import org.junit.jupiter.api.Test;

class FormatterTest {

    private final Formatter formatter = new Formatter();
    
    @Test
    void given_6_whenFormat_thenStars() {
        StringBuilder expected = new StringBuilder();
        expected.append("*" + lineSeparator()
                      + "***" + lineSeparator()
                      + "**" + lineSeparator()
                      + "****" + lineSeparator()
                      + "***" + lineSeparator()
                      + "*****" + lineSeparator()
                      + "****" + lineSeparator()
                      + "******" + lineSeparator());        
        assertEquals(expected.toString(), formatter.format(6));
    }
    
    @Test
    void given_20_whenFormat_thenStars() {
        StringBuilder expected = new StringBuilder();
        expected.append("*" + lineSeparator()
                      + "***" + lineSeparator()
                      + "**" + lineSeparator()
                      + "****" + lineSeparator()
                      + "***" + lineSeparator()
                      + "*****" + lineSeparator()
                      + "****" + lineSeparator()
                      + "******" + lineSeparator()
                      + "*****" + lineSeparator()
                      + "*******" + lineSeparator()
                      + "******" + lineSeparator()
                      + "********" + lineSeparator()
                      + "*******" + lineSeparator()
                      + "*********" + lineSeparator()
                      + "********" + lineSeparator()
                      + "**********" + lineSeparator()
                      + "*********" + lineSeparator()
                      + "***********" + lineSeparator()
                      + "**********" + lineSeparator()
                      + "************" + lineSeparator()
                      + "***********" + lineSeparator()
                      + "*************" + lineSeparator()
                      + "************" + lineSeparator()
                      + "**************" + lineSeparator()
                      + "*************" + lineSeparator()
                      + "***************" + lineSeparator()
                      + "**************" + lineSeparator()
                      + "****************" + lineSeparator()
                      + "***************" + lineSeparator()
                      + "*****************" + lineSeparator()
                      + "****************" + lineSeparator()
                      + "******************" + lineSeparator()
                      + "*****************" + lineSeparator()
                      + "*******************" + lineSeparator()
                      + "******************" + lineSeparator()
                      + "********************" + lineSeparator());        
        assertEquals(expected.toString(), formatter.format(20));
    }
    
    @Test
    void given_0_whenFormat_thenEmptyResult() {
       assertEquals("", formatter.format(0));
    }
}