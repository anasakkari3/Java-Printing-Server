public class PriorityQueue implements Prioritizable{
    int p;
    Prioritizable[] port;

    public PriorityQueue() {
        this.port = new Prioritizable[100];
    }
    public void insert(Prioritizable element){
        int j = 0;
        while (j < 100 && port[j] != null && port[j].getPriority() >= element.getPriority()){
            j++;
        }
        if (port[99] == null) {
            for (int k = 99; k > j; k--) {
                port[k] = port[k - 1];
            }
            port[j] = element;
        }}

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
    public Prioritizable remove(){
        Prioritizable cop=port[0];
        for (int i = 0; i <port.length-1 ; i++) {
            port[i]=port[i+1];
        }
        port[port.length-1]=null;
        return cop ;
    }
    public String toString(){
         String s= "";
        for (int i = 0; i < port.length; i++) {
            if (port[i]!=null&&port[i+1]!=null){
                s+= port[i].toString()+'\n';
            }
            if (port[i]!=null&&port[i+1]==null){
                s+= port[i].toString();
            }

        }
        return s;
    }
}
