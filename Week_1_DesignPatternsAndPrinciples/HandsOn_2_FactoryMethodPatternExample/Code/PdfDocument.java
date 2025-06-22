package Week_1_DesignPatternsAndPrinciples.HandsOn_2_FactoryMethodPatternExample.Code;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
