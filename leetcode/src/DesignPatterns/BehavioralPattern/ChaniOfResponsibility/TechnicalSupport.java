public class TechnicalSupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("Technical")){
            System.out.println("Handling technical support request.");
        }else{
            if(nextHandler != null){
                nextHandler.handleRequest(requestType);
            }
        }
    }
}