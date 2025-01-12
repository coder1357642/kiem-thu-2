import java.util.*;

public class kiemthu2 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        int pivot = list.get(list.size() / 2);
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for (int num : list) {
            if (num < pivot) less.add(num);
            else if (num > pivot) greater.add(num);
            else equal.add(num);
        }
        List<Integer> sorted = quickSort(less);
        sorted.addAll(equal);
        sorted.addAll(quickSort(greater));
        return sorted;
    }

    public static int binarySearch(List<Integer> sortedList, int target) {
        int left = 0, right = sortedList.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedList.get(mid) == target) return mid;
            if (sortedList.get(mid) < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Not found
    }

    public static String mostFrequentWord(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        String mostFrequent = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequent;
    }

    public static <T> T findObjectWithProperty(List<T> objects, String propertyName, Object value) throws Exception {
        if (value == null) {
            throw new NullPointerException("Value cannot be null"); // Ném ngoại lệ khi value là null
        }

        for (T obj : objects) {
            Object propertyValue = obj.getClass().getDeclaredField(propertyName).get(obj);
            if (propertyValue.equals(value)) {
                return obj;
            }
        }
        return null;
    }






}
