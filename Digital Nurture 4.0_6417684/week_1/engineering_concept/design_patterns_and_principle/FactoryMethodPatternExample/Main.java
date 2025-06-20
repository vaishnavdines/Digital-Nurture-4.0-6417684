package week_1.engineering_concept.design_patterns_and_principle.FactoryMethodPatternExample;

public class Main {
    public static void main(String[]args){
        DocumentFactory wordFactory = new WordFactory();
        Document WordDoc = wordFactory.createdocument();
        WordDoc.open();
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc=excelFactory.createDocument();
        excelDoc.open();

    }
    
}
