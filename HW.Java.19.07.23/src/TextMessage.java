public class TextMessage {
    public String word1;
    public String word2;
    public String word3;


    public TextMessage(String message) {
        word1 = message.replaceAll("fuck", "fk ").replaceAll("bullshit", "b****t").replaceAll("asshole", "as***le");
        System.out.println(word1);
        word2 = message.replaceAll("fuck", "fk ").replaceAll("bullshit", "b****t").replaceAll("asshole", "as***le");
        System.out.println(word2);
        word3 = message.replaceAll("fuck", "fk ").replaceAll("bullshit", "b****t").replaceAll("asshole", "as***le");
        System.out.println(word3);

    }

}