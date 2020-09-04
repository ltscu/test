public class Regex {
    public static void main(String[] args) {
        String s="ss./中文.s8899";
        System.out.println(s.isEmpty());
        String regex = "^[a-z0-9A-Z\\u4e00-\\u9fa5./]+$";
        System.out.println(s.matches(regex));
    }
}

