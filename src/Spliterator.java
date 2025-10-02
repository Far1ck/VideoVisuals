public class Spliterator {
    public static void main(String[] args) {
        String str = "1234567890";
        split(str, 1,2,3,4,5,6,7);
    }

    public static void split(String str, int ... partSizes) {
        int index = 0;
        for (int partSize : partSizes) {
            if (index >= str.length()) {
                break;
            }
            if (index + partSize >= str.length()) {
                System.out.println(str.substring(index));
                index = str.length();
                break;
            }
            System.out.println(str.substring(index, index + partSize));
            index += partSize;
        }
        if (index < str.length()) {
            System.out.println(str.substring(index));
        }
    }
}