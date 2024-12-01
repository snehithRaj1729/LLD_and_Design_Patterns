public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==DEBUG){
            System.out.println("Debug: "+message);
        }else {
            super.log(logLevel,message);
        }
    }
}
