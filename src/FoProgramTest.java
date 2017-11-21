import org.junit.Assert;
import org.junit.Test;

public class FoProgramTest {
    FoProgram fo = new FoProgram();
    @Test
    public void tesztekPozitivEsNulla() {
        Assert.assertEquals(fo.add("12,14,13"), "39");
        Assert.assertEquals(fo.add("33;44&55"),"132");
        Assert.assertEquals(fo.eldontes(""),"0");
    }
    @Test
    public void tesztekMinuszra(){
        Assert.assertEquals(fo.add("12,-14,13"), "Negatives not allowed: -14");
        Assert.assertEquals(fo.add("12+-14/-13"), "Negatives not allowed: -14 -13");
    }
    @Test
    public void tesztekElvalasztoKarakterekre(){
        Assert.assertEquals(fo.add("10+10/10%10,10~10*10_10;10:10&10"), "110");
    }
}