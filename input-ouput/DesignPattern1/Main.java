package DesignPattern1;

import java.util.ArrayList;
import java.util.List;

//The genealogy tree in this code
/*         Jame --- Hana
                 |
               -----
              |     |
    Lyly-----Hans  Anna
          |
       --------
      |   |    |
     Bob Harry Jack
*/
public class Main {
    private static int maxGeneration = 0; // static variables to store which is the latest generation

    public static void main(String[] args) {

        Person James = new Person("James", "M", 50, "2/3/1975");
        Person Hana = new Person("Hana", "F", 45, "2/3/1980");
        Person Anna = new Person("Anna", "F", 14, "2/9/2009");
        Person Hans = new Person("Hans", "M", 20, "3/4/2004");
        Person Lyly = new Person("Lyly", "F", 20, "3/4/2004");
        Person Bob = new Person("Bob", "M", 1, "1/1/2022");
        Person Harry = new Person("Harry", "M", 1, "1/1/2022");
        Person Jack = new Person("Jack", "M", 1, "1/1/2022");

        //Marry
        James.isMarriedTo(Hana);
        James.haveChildren(Hans);
        James.haveChildren(Anna);

        Hans.isMarriedTo(Lyly);
        Hans.haveChildren(Bob);
        Hans.haveChildren(Harry);
        Hans.haveChildren(Jack);


        //uncomment this part to print the latest generation
        /*List<Person> latestGeneration = getTheLatestGeneration(James);
        for (var i : latestGeneration){
            System.out.println(i.getName() + " ");
        }*/


        //uncommented this part to print the list of unmarried person
        /*
        List<Person> notMarried = getNotMarried(James);
        for (var i : notMarried){
            System.out.println(i.getName() + " ");
        }*/

        //uncomment this part to print the couple who have two children
        //(NOTE: A person who have 2 children but not married won't have a partner name)
        /*
        List<Person> have2child = getHave2Child(James);
        for (var i : have2child){
            if(i.getPartner != null){
                System.out.println(i.getName() + " and " + i.getPartner().getName());
            } else {
                System.out.println(i.getName());
            }
        }*/

    }

    /**
     * call to a recursive method {@link #findTheLatestGeneration(Person, List, int)}
     *
     * @param root root of the family tree
     * @return list of latest generation
     */
    public static List<Person> getTheLatestGeneration(Person root) {
        List<Person> latestGeneration = new ArrayList<>();
        findTheLatestGeneration(root, latestGeneration, 0);
        return latestGeneration;
    }

    /**
     * This method will be recursively called to get all the person node
     * who are in the latest generation.
     *
     * @param p                 person node
     * @param list              add latest generation to this list
     * @param currentGeneration to know which generation is the person node in.
     */
    private static void findTheLatestGeneration(Person p, List<Person> list, int currentGeneration) {
        if (p == null) {
            return;
        }

        if (p.getChildren().isEmpty()) {
            if (list.isEmpty()) {
                maxGeneration = currentGeneration;
            }
            if (currentGeneration == maxGeneration) {
                list.add(p);
            }
        } else {
            for (int i = 0; i < p.getChildren().size(); i++) {
                findTheLatestGeneration(p.getChildren().get(i), list, currentGeneration + 1);
            }
        }
    }

    /**
     * call to a recursive method {@link #findNotMarried(Person, List)}
     *
     * @param root root of the family tree
     * @return list of unmarried person
     */
    public static List<Person> getNotMarried(Person root) {
        List<Person> notMarried = new ArrayList<>();
        findNotMarried(root, notMarried);
        return notMarried;
    }

    /**
     * This method will be recursively called to get all the person node
     * who doesn't have a partner.
     *
     * @param p    person node
     * @param list add unmarried peron to this list
     */
    private static void findNotMarried(Person p, List<Person> list) {
        if (p == null) {
            return;
        }

        if (p.getPartner() == null) {
            list.add(p);
        } else {
            for (int i = 0; i < p.getChildren().size(); i++) {
                findNotMarried(p.getChildren().get(i), list);
            }
        }
    }

    //have the same logic as 2 methods above but different condition
    public static List<Person> getHave2Child(Person root) {
        List<Person> have2Child = new ArrayList<>();
        findHave2Child(root, have2Child);
        return have2Child;
    }

    private static void findHave2Child(Person p, List<Person> list) {
        if (p == null) {
            return;
        }

        if (p.getChildren().size() >= 2) {
            list.add(p);
        }
        for (int i = 0; i < p.getChildren().size(); i++) {
            findHave2Child(p.getChildren().get(i), list);
        }
    }

}
