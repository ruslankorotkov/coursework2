import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IncorrectArgumentException extends Exception {
    private String argument;

    @Override
    public String getMessage() {
        return " Параметр " +
                super.getMessage() + " задан не коректно. ";
    }

    public IncorrectArgumentException(String argument) {
        super(argument);
    }
}
