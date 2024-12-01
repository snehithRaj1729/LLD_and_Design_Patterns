//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
//        logProcessor.log(LogProcessor.INFO,"Message for infor level");
//        logProcessor.log(LogProcessor.DEBUG,"This is from debug level");
        logProcessor.log(LogProcessor.ERROR,"Exception happens");
    }
}