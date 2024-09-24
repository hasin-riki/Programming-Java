
public class BaseClass {

    
    public static void main(String args[]) {
        Doctor obj[]=new Doctor[4];
        obj[0]=new Doctor();
        obj[1]=new Surgeon();
        obj[2]=new Orthodontist();
        obj[3]=new Neurologist();
        
        for(int i=0;i<obj.length;i++){
            obj[i].treatPatient();
        }
        
    }
}
