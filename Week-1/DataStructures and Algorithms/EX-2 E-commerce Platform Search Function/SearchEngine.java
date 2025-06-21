public class SearchEngine {

    // Linear Search by Product Name
    public static Product linearSearch(Product[] arr, String name) {
        name = name.toLowerCase();
        for (Product p : arr) {
            if (p.getProductName().contains(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by Product ID
    public static Product binarySearch(Product[] arr, String id) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int temp = arr[mid].getProductId().compareTo(id);

            if (temp == 0) return arr[mid];
            else if (temp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }
}