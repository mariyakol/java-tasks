package ru.mail.polis.homework.analyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private long maxLength;

    public TooLongTextAnalyzer(long maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public FilterType analyze(String text) {
        if (text.length() > maxLength) {
            return FilterType.TOO_LONG;
        }

        return FilterType.GOOD;
    }
}
