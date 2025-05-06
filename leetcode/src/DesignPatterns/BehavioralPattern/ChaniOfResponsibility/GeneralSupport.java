public class GeneralSupport extends SupportHandler{

    @Override
    public void handleRequest(String requestType){
        if(requestType.equals("General")){
            System.out.println("General support is handling the request.");
        }else {
            if(nextHandler != null)
                nextHandler.handleRequest(requestType);
        }
    }
}