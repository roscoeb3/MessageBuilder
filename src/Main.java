public class Main {
    public static void main(String[] args) {
        MessageBuilder m = new MessageBuilder("s");
        System.out.println(m.getMessage());
        System.out.println(m.getAbbreviation());
        System.out.println(m.getNumWords());
    }
}