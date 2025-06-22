package Week_1_DesignPatternsAndPrinciples.HandsOn_2_FactoryMethodPatternExample.Code;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}