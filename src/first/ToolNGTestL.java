/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ToolNGTestL {
    
    public ToolNGTestL() {
    }

    /**
     * Test of toBinary method, of class Tools.
     */
    @Test(enabled = true)
    public void testToBinary() {
    	        Object[][] datas = new Object[][] {{14,1110},
    	            {23,10111}, {45,101101}, {67, 1000011}, {1,1}
    	        };
    	        for (Object[] data : datas) {
    	            String result = ToolsL.toBinary((Integer)data[0]);
    	            String  expResult = data[1].toString();
    	            assertEquals(result, expResult);
    	        }
    }

    /**
     * Test of toOctal method, of class Tools.
     */
    @Test(enabled = true)
    public void testToOctal() {
    	  Object[][] datas = new Object[][] {{89,"131"},
	            {98,"142"}, {88,"130"}, {1, "1"}
	        };
	        for (Object[] data : datas) {
	            String result = ToolsL.toOctal((Integer)data[0]);
	            String  expResult = data[1].toString();
	            assertEquals(result, expResult);
	        }
    }

    /**
     * Test of toHexadecimal method, of class Tools.
     */
    @DataProvider(name="dataFortestToHexadecimal")
    public Object[][] dataFortestToHexadecimal() {
        return new Object[][] { {89, "59"},
                {456, "1C8"},
                {99, "63"},
                {77, "4D"},
                {1,"1"}};
    }
    @Test(dataProvider="dataFortestToHexadecimal")
    public void testToHexadecimal(int exp, String expResult) {
        String result = ToolsL.toHexadecimal(exp);
        assertEquals(result, expResult);
    }
  


    /**
     * Test of toOther method, of class Tools.
     */
    @DataProvider(name="dataFortestToOther")
    public Object[][] dataFortestToOther() {
        return new Object[][] { {89,16,"59"},
                {23,2, "10111"},
                {89,8,"131"},
                {77,16,"4D"},
                {1,2,"1"},
                {1,8,"1"},
                {1,16,"1"}};
    }
    @Test(dataProvider="dataFortestToOther")
    public void testToOther(int num,int d, String expResult) {
        String result = ToolsL.toOther(num,d);
        assertEquals(result, expResult);
    }
 

    /**
     * Test of toChar method, of class Tools.
     */
    @Test
    public void testToChar() {
        Object[][] datas = new Object[][] {{1, '1'},
            {5,'5'}, {10,'A'}, {11, 'B'}, {12, 'C'},
            {13, 'D'}, {14,'E'}, {15,'F'}
        };
        for (Object[] data : datas) {
            char result = ToolsL.toChar((Integer)data[0]);
            char expResult = (Character)data[1];
            assertEquals(result, expResult);
        }
    }
    
    @DataProvider(name="dataForMatch")
    public Object[][] dataForIsMatch() {
        return new Object[][] { {"12+[(12+23)*4)*5", false},
                {"12+[(12+23)+15]*12", true},
                {"[[(])]", false},
                {"([])()[]", true}};
    }

    /**
     * Test of isMatch method, of class Tools.
     */
    @Test(dataProvider="dataForMatch")
    public void testIsMatch(String exp, boolean expResult) {
        System.out.println("isMatch");
        boolean result = Tools.isMatch(exp);
        assertEquals(result, expResult);
    }
    
}

