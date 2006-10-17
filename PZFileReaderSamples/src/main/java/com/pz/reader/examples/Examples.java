/**
 * 
 */
package com.pz.reader.examples;

import java.lang.reflect.Method;

import com.pz.reader.examples.createsamplecsv.CSVTestFileCreator;
import com.pz.reader.examples.csvheaderandtrailer.CSVHeaderAndTrailer;
import com.pz.reader.examples.csvperformancetest.CSVPerformanceTest;
import com.pz.reader.examples.delimiteddynamiccolumns.DelimitedWithPZMap;
import com.pz.reader.examples.delimiteddynamiccolumnswitherrors.DelimitedWithPZMapErrors;
import com.pz.reader.examples.exporttoexcel.DelimitedFileExportToExcel;
import com.pz.reader.examples.fixedlengthdynamiccolumns.FixedLengthWithPZMap;
import com.pz.reader.examples.fixedlengthheaderandtrailer.FixedLengthHeaderAndTrailer;
import com.pz.reader.examples.largedataset.delimiteddynamiccolumns.LargeDelimitedWithPZMap;
import com.pz.reader.examples.largedataset.fixedlengthdynamiccolumns.LargeFixedLengthWithPZMap;
import com.pz.reader.examples.largedataset.largecsvperformancetest.CSVLarge;
import com.pz.reader.examples.lowlevelparse.LowLevelParse;
import com.pz.reader.examples.multilinedelimitedrecord.DelimitedMultiLine;
import com.pz.reader.examples.numericsanddates.NumericsAndDates;

/**
 * @author Benoit Xhenseval
 */
public class Examples implements Repeater {

    public void tearDown() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Examples examples = new Examples();
        examples.run();
    }

    public void repeat(Method target) {
    }

    public void doCall() {
        System.out.println("");
        System.out.println("           ___  _     _           _   _          _");
        System.out.println("          / _ \\| |__ (_) ___  ___| |_| |    __ _| |__");
        System.out.println("         | | | | '_ \\| |/ _ \\/ __| __| |   / _` | '_ \\");
        System.out.println("         | |_| | |_) | |  __/ (__| |_| |__| (_| | |_) |");
        System.out.println("          \\___/|_.__// |\\___|\\___|\\__|_____\\__,_|_.__/");
        System.out.println("                   |__/");
        System.out.println("");
        System.out.println("             w w w . O b j e c t L a b . c o . u k");
    }

    private void run() {
        final ConsoleMenu menu = new ConsoleMenu(this);
        menu.addMenuItem("CSVTestFileCreator", "doCSVTestFileCreator", false);
        menu.addMenuItem("CSVHeaderAndTrailer", "doCSVHeaderAndTrailer", false);
        menu.addMenuItem("CSVPerformanceTest", "doCSVPerformanceTest", false);
        menu.addMenuItem("DelimitedWithPZMap", "doDelimitedWithPZMap", false);
        menu.addMenuItem("DelimitedWithPZMapErrors", "doDelimitedWithPZMapErrors", false);
        menu.addMenuItem("DelimitedFileExportToExcel", "doDelimitedFileExportToExcel", false);
        menu.addMenuItem("FixedLengthWithPZMap", "doFixedLengthWithPZMap", false);
        menu.addMenuItem("FixedLengthHeaderAndTrailer", "doFixedLengthHeaderAndTrailer", false);
        menu.addMenuItem("LargeDelimitedWithPZMap", "doLargeDelimitedWithPZMap", false);
        menu.addMenuItem("LargeFixedLengthWithPZMap", "doLargeFixedLengthWithPZMap", false);
        menu.addMenuItem("CSVLarge", "doCSVLarge", false);
        menu.addMenuItem("LowLevelParse", "doLowLevelParse", false);
        menu.addMenuItem("DelimitedMultiLine", "doDelimitedMultiLine", false);
        menu.addMenuItem("NumericsAndDates", "doNumericsAndDates", false);
        
        menu.addMenuItem("Who you gonna call?", "doCall", false);
        menu.displayMenu();
    }

    public void doCSVTestFileCreator() {
        final int cols = ConsoleMenu.getInt("Number of cols", 10);
        final int rows = ConsoleMenu.getInt("Number of rows", 100);
        CSVTestFileCreator.createFile(cols, rows);
    }

    public void doCSVHeaderAndTrailer() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", CSVHeaderAndTrailer.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", CSVHeaderAndTrailer.getDefaultDataFile());
            CSVHeaderAndTrailer.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doCSVPerformanceTest() {
        try {
            final String mapping = ConsoleMenu.getString("CSV File ", "SampleCSV.csv");
            final boolean data = ConsoleMenu.getBoolean("Verbose", false);
            CSVPerformanceTest.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doDelimitedWithPZMap() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", DelimitedWithPZMap.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", DelimitedWithPZMap.getDefaultDataFile());
            DelimitedWithPZMap.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doDelimitedWithPZMapErrors() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", DelimitedWithPZMapErrors.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", DelimitedWithPZMapErrors.getDefaultDataFile());
            DelimitedWithPZMapErrors.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doDelimitedFileExportToExcel() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", DelimitedFileExportToExcel.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", DelimitedFileExportToExcel.getDefaultDataFile());
            DelimitedFileExportToExcel.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doFixedLengthWithPZMap() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", FixedLengthWithPZMap.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", FixedLengthWithPZMap.getDefaultDataFile());
            FixedLengthWithPZMap.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public void doFixedLengthHeaderAndTrailer() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", FixedLengthHeaderAndTrailer.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", FixedLengthHeaderAndTrailer.getDefaultDataFile());
            FixedLengthHeaderAndTrailer.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doLargeDelimitedWithPZMap() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", LargeDelimitedWithPZMap.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", LargeDelimitedWithPZMap.getDefaultDataFile());
            LargeDelimitedWithPZMap.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void doLargeFixedLengthWithPZMap() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", LargeFixedLengthWithPZMap.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", LargeFixedLengthWithPZMap.getDefaultDataFile());
            LargeFixedLengthWithPZMap.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doCSVLarge() {
        try {
            final int cols = ConsoleMenu.getInt("Number of cols", 10);
            final int rows = ConsoleMenu.getInt("Number of rows", 2000000);
            String filename = "LargeSampleCSV.csv";
            CSVTestFileCreator.createFile(cols, rows, filename);
            
            System.out.println("Large file created");

            CSVLarge.call(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public void doLowLevelParse() {
        try {
            final String data = ConsoleMenu.getString(    "Data   ", LowLevelParse.getDefaultDataFile());
            LowLevelParse.call(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doDelimitedMultiLine() {
        try {
            final String data = ConsoleMenu.getString(    "Data   ", DelimitedMultiLine.getDefaultDataFile());
            DelimitedMultiLine.call(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doNumericsAndDates() {
        try {
            final String mapping = ConsoleMenu.getString("Mapping ", NumericsAndDates.getDefaultMapping());
            final String data = ConsoleMenu.getString(    "Data   ", NumericsAndDates.getDefaultDataFile());
            NumericsAndDates.call(mapping,data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
