public class Element{
    public int wert;
    public Element nachfolger;

    public Element(int i){
        wert = i;
    }

    public void setWert(int i){
        wert = i;
    }

    public void setNachfolger(Element e){
        nachfolger = e;
    }

    public int getWert(){
        return wert;
    }

    public Element getNachfolger(){
        return nachfolger;
    }
}
