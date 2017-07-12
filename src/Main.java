import Constructors.Om;
import Constructors.Student;

import java.util.*;

public class Main {



    public static void main(String[] args) {


        PropagationUnchecked propagationUnchecked=new PropagationUnchecked();
        propagationUnchecked.Trydevidebyzero();

        PropagationCheked propagationCheked =new PropagationCheked();

        try {
            propagationCheked.propaationMethodcall();
        } catch (Exception e) {
            System.out.println("mdaaa Aici astea Cheked trebuie sa le declari peste tot pe unde se apeleaza vreo metoda cu vreo execveptie, altfel nu vrea, si apare execptioa doar in prima metoda unde este try cathc-ul");
        }


//System.gc();


        Set<Student> listaStringuri =new TreeSet<>();
        Student a=new Student(3);
        listaStringuri.add(a);
        listaStringuri.add(a);
        listaStringuri.add(new Student(4));





       // listaStringuri.sort(String::compareTo);

        //Collections.sort(listaStringuri,(o1, o2) -> {if (o1.toString().equals(o2.toString())) return 1; return 0;});

        for (Student f: listaStringuri) {
            System.out.println(f.def);
        }


        List<Student> listalista=new ArrayList<>();
        listalista.add(new Student(10));
        listalista.add(new Student(11));
        System.out.println(listalista.get(1).def);


        List<Student> linkedlista=new LinkedList<>();
        linkedlista.add(new Student(12));
        linkedlista.add(new Student(13));
        System.out.println(linkedlista.get(1).def);


        Map<Integer,String> map=new HashMap<>();
        map.put(new Integer(10), new String("mama"));
        System.out.println(map.get(new Integer(10)));

/*int x= 'A';
System.out.print(x);//will results 65*/



    }
}