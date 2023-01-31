import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IncorrectArgumentException extends Exception {
    private String argument;

    public IncorrectArgumentException(String argument) {
        super(argument);
    }

    @Override
    public String getMessage() {
        return " Параметр " +
                argument + " задан не коректно. ";
    }


}
