package Constructors;

import java.util.Comparator;

/**
 * Created by acalancea on 6/21/2017.
 */
public class Student extends Om implements Comparable<Student> {
    public int def;
public Student( int param){
this.def=param;


}

    @Override
    public void ShowSomething() {
        System.out.println("This is A STUDNET");
    }

    @Override
    public int compareTo(Student o) {
        if(this.def>o.def) return 1;
                else if(this.def<o.def) return -1;
return 0;
}
}
