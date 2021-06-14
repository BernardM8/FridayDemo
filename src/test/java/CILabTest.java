import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //-----------Pass cases-------------

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assert(myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assert (myString.detectCapitalUse());
    }
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Google");
        assert(myString.detectCapitalUse());
    }


    //-----------Fail cases-------------


    @Test
    public void detectCapitalUseTest4() {
        myString.setString("FlaG");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("failuRe");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest6() {
        myString.setString("GOOGLe");
        assertFalse(myString.detectCapitalUse());
    }

}
