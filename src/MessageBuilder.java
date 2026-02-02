public class MessageBuilder {
    private String message;
    private int numWords = 1;

    public MessageBuilder(String startingWord) {
        message = startingWord;
        String nextWord;
        boolean isNull = false;
        while (!isNull) {
            nextWord = getNextWord(startingWord);
            if (nextWord == null) isNull = true;
            else {
                message += " " + nextWord;
                startingWord = nextWord;
                numWords++;
            }
        }
    }

    public String getNextWord(String s) {
        if (Math.random() < 0.1) return null;
        if (Math.random() < 0.5) return "rah";
        else return "sah";
    }

    public String getAbbreviation() {
        String abr = message.substring(0, 1);
        for (int i = 0; i < message.length(); i++)
            if (message.charAt(i) == ' ') abr += message.charAt(i + 1);
        return abr;
    }

    public String getMessage() {return message;}
    public int getNumWords() {return numWords;}
}
