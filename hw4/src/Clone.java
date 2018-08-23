public class Clone {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Company comp = new Company(1, "ALTEL");
        Products pr1 = new Products(1, "SIM", comp);
        
        try{
            Products clone = (Products) pr1.clone();
            System.out.println("SHALLOW CLONING IMPLEMENTATION FOR PRODUCT NAME");
            System.out.println(pr1.getName());
            System.out.println(clone.getName());
            pr1.setName("TELEPHONE");
            System.out.println("AFTER CLONING-----------");
            System.out.println(pr1.getName());
            System.out.println(clone.getName());
            System.out.println("SHALLOW CLONING HAS BEEN FINISHED");
            System.out.println("*************");
            System.out.println("*************");
            
            
            System.out.println("DEEP CLONING IMPLEMENTATION FOR COMPANIES");
            System.out.println(pr1.getCompany().getcompanyName());
            System.out.println(clone.getCompany().getcompanyName());
            clone.getCompany().setcompanyName("TELE2");
            System.out.println("AFTER CLONING-----------");
            System.out.println(pr1.getCompany().getcompanyName());
            System.out.println(clone.getCompany().getcompanyName());
            System.out.println("DEEP CLONING HAS BEEN FINISHED");
            System.out.println("*************");
            System.out.println("*************");
        }
        catch(CloneNotSupportedException cnse){
            System.out.println("Cloneable should be implemented " + cnse);
        }
    }
    
}