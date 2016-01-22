import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.EmptyStackException;
import java.io.*;

public class TestRunner throw FileNotFoundException {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Main.class);
      int total = result.getRunCount();
      int failed = result.getFailureCount();
      int succeeded = total - failed;
      /*
      System.out.println("Total Test Cases Runned : "+total);
      System.out.println("Total Test Cases Failed : "+failed);
      System.out.println("Total Test Cases Successful : "+succeeded);
      if (failed>0) {
         System.out.println("Failed Cases : \n\t "+result.getFailures());
      }*/
      PrintWriter writer = new PrintWriter("Report.txt", "UTF-8");
      writer.println("Total Test Cases Runned : "+total);
      writer.println("Total Test Cases Failed : "+failed);
      writer.println("Total Test Cases Successful : "+succeeded);
      if (failed>0) {
         writer.println("Failed Cases : \n\t "+result.getFailures());
      }
      writer.close();
      if (failed>2) {
        throw new EmptyStackException();
      }
   }
}
