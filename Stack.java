public class Stack{

    private Element oberstesElement;
    int hoehe = 0;

    public Stack(){

    }
    
    public boolean isEmpty(){
       if (oberstesElement == null){
           return true;
       }
       return false;
    }
    
    public void push(Element e){
        e.setNachfolger(oberstesElement);
        oberstesElement = e;
    }

    public void push(int i){
        Element e = new Element(i);
        //Element e = new Element();
        //e.wert = i;
        e.setNachfolger(oberstesElement);
        oberstesElement = e;
    }
    
    public void pop(){
        oberstesElement = oberstesElement.getNachfolger();
    }
    
    public int top(){
        return oberstesElement;
    }
}
