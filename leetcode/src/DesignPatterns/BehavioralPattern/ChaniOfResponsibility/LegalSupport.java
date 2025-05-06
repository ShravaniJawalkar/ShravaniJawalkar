public class LegalSupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("Legal")){
            System.out.println("Handling legal support request.");
        }else {
            if(nextHandler != null)
                nextHandler.handleRequest(requestType);
        }
    }
}