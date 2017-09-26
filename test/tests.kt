import junit.framework.Assert.assertEquals
import org.junit.Test

class Tests {

    @Test
    fun test() {
        assertEquals(listOf(0,2,6), searching(listOf(1,2,3)))
        assertEquals(listOf(2,3,5), searching(listOf(1,-2,2,3)))
        assertEquals(listOf(3,3,15), searching(listOf(2,3,-10,15)))
        assertEquals(listOf(0,1,5),searching(listOf(2,3,-15,4)))
    }
}
