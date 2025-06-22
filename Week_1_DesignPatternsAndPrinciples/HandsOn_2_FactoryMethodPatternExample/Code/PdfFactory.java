package Week_1_DesignPatternsAndPrinciples.HandsOn_2_FactoryMethodPatternExample.Code;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

