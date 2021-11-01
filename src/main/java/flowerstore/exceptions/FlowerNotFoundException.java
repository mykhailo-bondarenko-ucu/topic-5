package flowerstore.exceptions;

public class FlowerNotFoundException extends Exception {
    public FlowerNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
