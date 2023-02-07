import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IncorrectArgumentException extends Exception {
    private String argument;

    public String getArgument() {
        return argument;
    }

    public IncorrectArgumentException(String argument) {
        super(argument);
    }

    @Override
    public String toString() {
        return "Параметр " + super.getMessage() + argument +
                " задан не коректно ";
    }
}
