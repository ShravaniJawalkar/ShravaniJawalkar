public class BillingSupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("Billing")){
            System.out.println("Handling Billing request.");
        }else{
            if(nextHandler != null){
                nextHandler.handleRequest(requestType);
            }
        }
    }
}