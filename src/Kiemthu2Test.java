import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Kiemthu2Test {

    @Test
    void testIsPrime_BoundaryValues() {
        assertFalse(kiemthu2.isPrime(-5));  // Negative number
        assertFalse(kiemthu2.isPrime(0));   // Zero
        assertFalse(kiemthu2.isPrime(1));   // One
        assertTrue(kiemthu2.isPrime(2));    // Smallest prime
        assertTrue(kiemthu2.isPrime(3));    // Next prime
        assertFalse(kiemthu2.isPrime(4));   // Non-prime
    }

    @Test
    void testIsPrime_RandomValues() {
        assertTrue(kiemthu2.isPrime(29));   // Prime number
        assertFalse(kiemthu2.isPrime(30)); // Non-prime
    }

    @Test
    void testQuickSort_RandomData() {
        List<Integer> input = Arrays.asList(5, 3, 8, 6, 2);
        List<Integer> expected = Arrays.asList(2, 3, 5, 6, 8);
        assertEquals(expected, kiemthu2.quickSort(input));
    }

    @Test
    void testQuickSort_EmptyList() {
        assertEquals(Collections.emptyList(), kiemthu2.quickSort(Collections.emptyList()));
    }

    @Test
    void testQuickSort_LargeData() {
        List<Integer> input = new ArrayList<>();
        for (int i = 1000000; i > 0; i--) {
            input.add(i);
        }
        List<Integer> sorted = kiemthu2.quickSort(input);
        for (int i = 1; i < sorted.size(); i++) {
            assertTrue(sorted.get(i - 1) <= sorted.get(i));
        }
    }

    @Test
    void testBinarySearch_Found() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(2, kiemthu2.binarySearch(sortedList, 3)); // Found at index 2
    }

    @Test
    void testBinarySearch_NotFound() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(-1, kiemthu2.binarySearch(sortedList, 6)); // Not found
    }

    @Test
    void testBinarySearch_LargeData() {
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            sortedList.add(i);
        }
        assertEquals(999999, kiemthu2.binarySearch(sortedList, 1000000)); // Found at the last index
    }

    @Test
    void testMostFrequentWord_ValidInput() {
        String input = "apple banana apple orange banana apple";
        assertEquals("apple", kiemthu2.mostFrequentWord(input)); // "apple" appears the most
    }

    @Test
    void testMostFrequentWord_EmptyString() {
        assertEquals("", kiemthu2.mostFrequentWord("")); // No words in the string
    }

    @Test
    void testFindObjectWithProperty_ValidProperty() throws Exception {
        class Dummy {
            String name;
            int age;
            Dummy(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        List<Dummy> objects = Arrays.asList(new Dummy("Alice", 25), new Dummy("Bob", 30));
        Dummy result = kiemthu2.findObjectWithProperty(objects, "name", "Alice");
        assertNotNull(result);
        assertEquals("Alice", result.name);
    }

    @Test
    void testFindObjectWithProperty_InvalidProperty() {
        class Dummy {
            String name;
            int age;
            Dummy(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        List<Dummy> objects = Arrays.asList(new Dummy("Alice", 25), new Dummy("Bob", 30));

        assertThrows(NoSuchFieldException.class, () -> {
            kiemthu2.findObjectWithProperty(objects, "height", "someValue"); // Thuộc tính 'height' không tồn tại
        });
    }


    @Test
    void testFindObjectWithProperty_NullValue() {
        class Dummy {
            String name;
            int age;
            Dummy(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        List<Dummy> objects = Arrays.asList(new Dummy("Alice", 25), new Dummy("Bob", 30));

        assertThrows(NullPointerException.class, () -> {
            kiemthu2.findObjectWithProperty(objects, "name", null); // value == null
        });
    }


}
