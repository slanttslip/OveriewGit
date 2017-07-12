/**
 * Created by acalancea on 6/20/2017.
 */
class PropagationUnchecked {

    void devidebyzero(){
        int a=5/0;
    }

    void Trydevidebyzero(){
        try{ devidebyzero();}
        catch (Exception e){
            System.out.println( "A mers propagarea La unckeed");
        }
    }

    protected void finalize(){
System.out.print("iesi afara");
    }

}
