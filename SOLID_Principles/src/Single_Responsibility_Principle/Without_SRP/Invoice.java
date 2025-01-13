package Single_Responsibility_Principle.Without_SRP;

public class Invoice {
    public void addInvoice(){
        System.out.println("Adding invoice");
    }

    public void deleteInvoice(){
        System.out.println("Deleting invoice");
    }

    public void generateReport(){
        System.out.println("Generating report");
    }

    public void emailReport(){
        System.out.println("Email report");
    }
}
