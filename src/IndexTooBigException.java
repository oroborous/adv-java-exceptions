public class IndexTooBigException extends Exception {
    public IndexTooBigException(int index) {
        super("Index too big: " + index);
    }
}
