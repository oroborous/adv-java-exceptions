public class ArrayIndexTest {
    public static void main(String[] args) {
        try {
            accessArray(new int[]{4, 6, 2, 1}, -1);
        } catch (IndexTooBigException e) {
            System.out.println(e.getMessage());
        } catch (IndexTooSmallException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void accessArray(int[] theArray, int index) throws IndexTooBigException, IndexTooSmallException {
        if (index < 0) {
            IndexTooSmallException e = new IndexTooSmallException(index);
            throw e;
        } else if (index >= theArray.length) {
            IndexTooBigException e = new IndexTooBigException(index);
            throw e;
        } else {
            System.out.println(theArray[index]);
        }
    }
}
