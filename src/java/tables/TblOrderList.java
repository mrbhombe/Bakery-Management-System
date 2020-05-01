package tables;
// Generated 20 Apr, 2020 12:31:14 PM by Hibernate Tools 4.3.1



/**
 * TblOrderList generated by hbm2java
 */
public class TblOrderList  implements java.io.Serializable {


     private Integer lid;
     private TblOrder tblOrder;
     private TblProduct tblProduct;
     private int qty;

    public TblOrderList() {
    }

    public TblOrderList(TblOrder tblOrder, TblProduct tblProduct, int qty) {
       this.tblOrder = tblOrder;
       this.tblProduct = tblProduct;
       this.qty = qty;
    }
   
    public Integer getLid() {
        return this.lid;
    }
    
    public void setLid(Integer lid) {
        this.lid = lid;
    }
    public TblOrder getTblOrder() {
        return this.tblOrder;
    }
    
    public void setTblOrder(TblOrder tblOrder) {
        this.tblOrder = tblOrder;
    }
    public TblProduct getTblProduct() {
        return this.tblProduct;
    }
    
    public void setTblProduct(TblProduct tblProduct) {
        this.tblProduct = tblProduct;
    }
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }




}

