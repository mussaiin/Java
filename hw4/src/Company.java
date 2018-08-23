public class Company implements Cloneable{
    private int companyID;
    private String companyName;
    
    public Company(int companyID, String companyName){
        this.companyID=companyID;
        this.companyName=companyName;
    }
    
    public String getcompanyName(){
        return companyName;
    }
    
    public void setcompanyName(String compName){
        this.companyName=compName;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}