public class Products implements Cloneable{
    private int productId;
    private String productName;
    private Company company;
    
    public Products(int id, String name, Company comp){
        this.productId=id;
        this.productName=name;
        this.company=comp;
    }
    
    public int getId(){
        return productId;
    }
    public String getName(){
        return productName;
    }
    
    public void setName(String name){
        this.productName=name;
    }
    
    public Company getCompany(){
        return this.company;
    }
    
    public void setCompany(Company comp){
        this.company=comp;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}