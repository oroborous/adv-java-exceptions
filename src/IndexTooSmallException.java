public class IndexTooSmallException extends Exception {
    public IndexTooSmallException(int index) {
        super("Index too small: " + index);
    }
}
