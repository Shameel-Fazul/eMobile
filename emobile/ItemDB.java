/*
MIT License

Copyright (c) 2019 Shameel Fazul

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package emobile;

/**
 *
 * @author hnd
 */
public class ItemDB 
{
    private String ItemCode;
    private String ItemName;
    private String ItemDescription;
    private int Reorderlevel;
    private double UnitPrice;
    private String Remarks;

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param Itemcode the ItemCode to set
     */
    public void setItemcode(String Itemcode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     * @param ItemName the ItemName to set
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return ItemDescription;
    }

    /**
     * @param ItemDescription the ItemDescription to set
     */
    public void setItemDescription(String ItemDescription) {
        this.ItemDescription = ItemDescription;
    }

    /**
     * @return the Reorderlevel
     */
    public int getReorderlevel() {
        return Reorderlevel;
    }

    /**
     * @param Reorderlevel the Reorderlevel to set
     */
    public void setReorderlevel(int Reorderlevel) {
        this.Reorderlevel = Reorderlevel;
    }

    /**
     * @return the UnitPrice
     */
    public double getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the Remarks
     */
    public String getRemarks() {
        return Remarks;
    }

    /**
     * @param Remarks the Remarks to set
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }
    
    
    
    
       public void addItem(ItemDB obj) throws Exception
    {
       String  SQL="insert into Item values('"+obj.ItemCode+"','"+obj.ItemCode+
               "','"+obj.ItemDescription+"','"+obj.Reorderlevel+"','"+obj.UnitPrice+"','"+obj.Remarks+"')";
        DBConnection objcon=new DBConnection();
       System.out.println(" "+SQL);
       objcon.addValue(SQL);
    }       
}
