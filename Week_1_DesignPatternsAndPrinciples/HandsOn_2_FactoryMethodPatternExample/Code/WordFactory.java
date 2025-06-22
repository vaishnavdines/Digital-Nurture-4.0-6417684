package Week_1_DesignPatternsAndPrinciples.HandsOn_2_FactoryMethodPatternExample.Code;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

