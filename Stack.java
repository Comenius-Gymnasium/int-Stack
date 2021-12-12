public class Stack{

    private Element oberstesElement;
    int hoehe = 0;

    public Stack(){

    }
    
    //gibt zurück ob der Stack leer ist
    public boolean isEmpty(){
       if (oberstesElement == null){
           return true;
       }
       return false;
    }
    
    //legt ein als Parameter übergebenes Element oben auf den Stack
    public void push(Element e){
        e.setNachfolger(oberstesElement);
        oberstesElement = e;
        hoehe++;
        //hoehe = hoehe + 1;
    }

    //erzeugt ein neues Element, weist es den als Parameter übergebenen int als neuen wert zu und legt es oben auf den Stack
    public void push(int i){
        Element e = new Element(i);
            //Man könnte es auch in zwei Schritten machen:
            //Element e = new Element();
            //e.wert = i; oder e.setWert(i);
        e.setNachfolger(oberstesElement);
        oberstesElement = e;
    }
    
    //entfernt das oberste Element
    public void pop(){
        oberstesElement = oberstesElement.getNachfolger();
        hoehe--;
    }
    
    //gibt das oberste Element zurück
    public Element topElement(){
        return oberstesElement;
    }
    
    //gibt den wert des obersten Elementes zurück
    public int top(){
        return oberstesElement.wert;
        //oder return oberstesElement.getWert();
    }
}
