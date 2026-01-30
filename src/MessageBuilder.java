public class MessageBuilder {
    private String message;
    private int numWords;

    public MessageBuilder(String startingWord) {
        message = "";
        message += startingWord;
        String nextWord = "";
        while (!nextWord.equals(null)) {
            nextWord = getNextWord(startingWord);
            message += " " + nextWord;
            startingWord = nextWord;
            numWords++;
        }
    }

    public String getNextWord(String s)
    { /* implementation not shown */ }

    public String getAbbreviation() {
        String abr = message.substring(0, 1);
        for (int i = 0; i < message.length(); i++)
            if (message.charAt(i) == ' ') abr += message.charAt(i + 1);
        return abr;
    }
}
