package testExcel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.apache.tools.ant.types.resources.First;
import java.io.File;
   //Data Driven Testing #1
   // Create, Write and Apending on XL file!
    public class ExcelTester{
    public static void main(String[] args){
        File file = new File("firstexcel.xls");
        if(!file.exists())
        {
            createExcel(file);
        }
        writingExcel();
    }
    public static void createExcel(File file) {
        try {
            WritableWorkbook workbook = Workbook.createWorkbook(new File("firstexcel.xls"));
            workbook.createSheet("first sheet", 0);
            workbook.write();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writingExcel() {
        try {
            Workbook wb = Workbook.getWorkbook(new File("firstexcel.xls"));
            WritableWorkbook copy = Workbook.createWorkbook(new File("firstexcel.xls"), wb);
            WritableSheet copySheet = copy.getSheet(0);
           // First time written on cell 0, 0, (This is MGK) followed by below one:
            Label label1 = new Label(0, 0, "This is MGK, How you're doing?");
            copySheet.addCell(label1);
            copy.write();
            copy.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

