package com.medunna.stepDef.DBSteps;

import com.medunna.utilities.DatabaseUtility;
import org.junit.Test;

public class DBTest01 {

    @Test
    public void test01(){

        DatabaseUtility.createConnection();

        String query = "select * from physician";

        //Physician tablosundaki kolon(sütun) isimlerini verir
        System.out.println(DatabaseUtility.getColumnNames(query) + "\n");

        //Physican tablosundaki first_name sütunundaki dataları verir
        System.out.println(DatabaseUtility.getColumnData(query, "first_name") + "\n");

        //Physican tablosundaki 100. satır, 16. hücredeki datayı verir
        System.out.println(DatabaseUtility.getCellValuewithRowsAndCells(query, 100,16) + "\n");

        String query1 = "select * from physician where id =147333";
        // 14733 id li datanın bilgilerini List olarak verir
        System.out.println("14733 id'li Data: " + DatabaseUtility.getRowList(query1) + "\n");

        // 14733 id li datanın ilk hücresindeki datayı verir
        System.out.println("First Cell: " + DatabaseUtility.getCellValue(query1) + "\n");

        // 14733 id li datanın ikinci hücresindeki datayı verir
        System.out.println("Second Cell: " + DatabaseUtility.getSecondCellValue(query1) + "\n");

        // 14733 id li datanın bilgilerini map olarak verir.
        System.out.println("DatabaseUtility.getRowMap(query1) : " + DatabaseUtility.getRowMap(query1) + "\n");

        System.out.println("DatabaseUtility.getQueryResultList(query1) : " + DatabaseUtility.getQueryResultList(query1) + "\n");

        System.out.println("DatabaseUtility.getQueryResultMap(query1) : " + DatabaseUtility.getQueryResultMap(query1) + "\n");

        DatabaseUtility.closeConnection();
    }


}
