public class Television {
    private static volatile Television OnTV;
    private Television(){
    }
    public static Television watchtv(){

        if(OnTV==null){
            synchronized (Television.class){

                if(OnTV==null){
                    OnTV=new Television();

                }
            }
        }
        return OnTV;
    }
}
