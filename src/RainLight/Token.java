package RainLight;

public abstract class Token {
    public static final Token EOF = new Token(-1) {}; // 文件末尾
    public static final String EOL = "\\n"; // 表示换行符
    private int lineNumber;
    protected  Token(int line) {
        lineNumber = line;
    }
}
