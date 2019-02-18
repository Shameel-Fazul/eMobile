/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
