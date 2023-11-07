package Part7Builder;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Builder> builders = new HashMap<>();
        String TEXT_BUILDER = "text";
        builders.put(TEXT_BUILDER, new TextBuilder());
        String HTML_BUILDER = "html";
        builders.put(HTML_BUILDER, new HTMLBuilder());
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        Builder builder = builders.get(args[0]);
        Director director = new Director(builder);
        director.construct();
        String result = builder.result();
        System.out.println(result);
    }

    private static void usage() {
        System.out.println("Usage: java Main text   텍스트로 문서 작성");
        System.out.println("Usage: java Main html   HTML 파일로 문서 작성");
    }
}
