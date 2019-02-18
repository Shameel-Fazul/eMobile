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
public class Payments 
{
    private String InvoiceNo;
    private String ItemCode;
    private String ItemName;
    private int Quantity;
    private double UnitPrice;
    private double Total;

    /**
     * @return the InvoiceNo
     */
    public String getInvoiceNo() {
        return InvoiceNo;
    }

    /**
     * @param InvoiceNo the InvoiceNo to set
     */
    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
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
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
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
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }
       public void addPayments(Payments obj) throws Exception
    {
       String  SQL="insert into Item values('"+obj.InvoiceNo+"','"+obj.ItemCode+
               "','"+obj.ItemName+"','"+obj.Quantity+"','"+obj.UnitPrice+"','"+obj.Total+"')";
        DBConnection objcon=new DBConnection();
       System.out.println(" "+SQL);
       objcon.addValue(SQL);
    }       
}




