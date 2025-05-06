public class ChainOfResponsibilityDemo {
    public static void main(String args[]){
        SupportHandler generalSupport = new GeneralSupport();
        SupportHandler technicalSupport = new TechnicalSupport();
        SupportHandler billingSupport = new BillingSupport();
        SupportHandler legalSupport = new LegalSupport();
        generalSupport.setNextHandler(technicalSupport);
        technicalSupport.setNextHandler( billingSupport);
        billingSupport.setNextHandler(legalSupport);

       generalSupport.handleRequest("Technical");
       // generalSupport.handleRequest("Legal");
     //  generalSupport.handleRequest("Billing");
    }
}