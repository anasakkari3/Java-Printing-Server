public class PrintJob implements Prioritizable{
    private int p;
   private String text;
    public PrintJob(String text, int priority){
        this.p=priority;
        this.text=text;
    }
    @Override
    public int getPriority() {
        return p;
    }
    @Override
    public void setPriority(int p) {
        if (p<=MAX_PRIORITY&&p>=MIN_PRIORITY){
            this.p=p;
        }
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return  text;
    }
}
