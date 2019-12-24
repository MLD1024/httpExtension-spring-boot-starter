package lz.com.http.spring.boot.builder;

/**
 * 〈BuilderException〉
 *
 * @author LZ
 * @create 2019/11/26
 * @since 1.0.0
 */
public class BuilderException extends RuntimeException {
    private static final long serialVersionUID = -3885164021020443281L;

    public BuilderException() {
        super();
    }

    public BuilderException(String message) {
        super(message);
    }

    public BuilderException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuilderException(Throwable cause) {
        super(cause);
    }
}
