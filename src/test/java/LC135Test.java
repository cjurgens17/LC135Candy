import static org.junit.Assert.*;

public class LC135Test {

    @org.junit.Test
    public void minCandies() {

        int actual1 = LC135.minCandies(new int[] {1,0,2});
        int actual2 = LC135.minCandies(new int[] {1,2,2});
        int actual3 = LC135.minCandies(new int[] {1,2,87,87,87,2,1});

        assertEquals(5,actual1);
        assertEquals(4,actual2);
        assertEquals(13,actual3);
    }
}