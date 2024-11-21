package koschei.models;

public class Deth8 {
    private String lastWords;

    public Deth8(String lastWord) {
        this.lastWords = lastWord;
    }

    public String getLastWords() {
        return lastWords;
    }

    public void setLastWords(String lastWords) {
        this.lastWords = lastWords;
    }

    @Override
    public String toString() {
        return "Последние слова Кощея: " + lastWords;
    }
}
