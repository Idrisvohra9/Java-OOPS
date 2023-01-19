public class Encapsulation {
    private String Hidden_msg="Hello world";// Making a variable store a msg that can not be accessed by other class if we want to access them we need to use getter/setter methods.
    
    public void setHidden_msg(String msg){
        this.Hidden_msg = msg;
    }
    
    public String getHidden_msg(){
        return Hidden_msg;
    }
}