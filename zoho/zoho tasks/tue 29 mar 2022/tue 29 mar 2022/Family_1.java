import java.util.*;
 
class Person{
    private String name;
    private String gender;
    private Person father;
    private Person mother;
    private Person spouse;
    private ArrayList <Person> sons = new ArrayList <Person>();
    private ArrayList <Person> daughters = new ArrayList <Person>();
    private ArrayList <Person> brothers = new ArrayList <Person>();
    private ArrayList <Person> sisters = new ArrayList <Person>();

    private static HashMap <String, Person> members = new HashMap <>();

    public void setBrothers(Person obj){
        brothers.add(obj);
    }

    public ArrayList<Person> getBrothers(){
        return brothers;
    }

    public void setSisters(Person obj){
        sisters.add(obj);
    }

    public ArrayList<Person> getSisters(){
        return sisters;
    }

    public boolean hasSister(Person obj){
        return sisters.contains(obj);
    }

    public boolean hasBrother(Person obj){
        return brothers.contains(obj);
    }

    public void setSpouse(Person obj){
        this.spouse = obj;
    }

    public Person getSpouse(){
        return this.spouse;
    }

    public static boolean hasMember(String name){
        return(members.containsKey(name));
    }

    public static Person getMember(String name){
        return(members.get(name));
    }

    public static void addMember(String name, Person obj){
        members.put(name, obj);
    }


    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public void setMembers(String name, Person obj){
        members.put(name, obj);
    }

    public void setName(String name){
        this.name = name;
    }

    public void addSons(Person son){
        this.sons.add(son);
    }

    public boolean isSonsEmpty(){
        return this.sons.isEmpty();
    }

    public boolean isDaughtersEmpty(){
        return this.daughters.isEmpty();
    }

    public ArrayList<Person> getSons(){
        return this.sons;
    }

    public ArrayList<Person> getDaughters(){
        return this.daughters;
    }

    public void addDaughters(Person daughter){
        this.daughters.add(daughter);
    }


    public void setGender(String gender){
        this.gender = gender;
    }

    public void setFather(Person father){
        this.father = father;
    }

    public void setMother(Person mother){
        this.mother = mother;
    }

    public String getName(){
        return(this.name);
    }

    public String getGender(){
        return(this.gender);
    }

    public Person getFather(){
        return(this.father);
    }

    public Person getMother(){
        return(this.mother);
    }
     
}

class Family{
    public static void main(String[] args){

        ArrayList <Person> family = new ArrayList<Person>();

        getPersons(family);        
    }

    public static void Finder(ArrayList <Person> family, String match){
        Person obj = Person.getMember(match);
        if(obj == null){ //when given name doesn't match - no such object
            System.out.println("No such person");
        }
        else{  // compare mother side brothers and father side sisters : assumption
            if(obj.getMother().getBrothers() != null){ 
                for(Person obj1 : obj.getMother().getBrothers()){
                    for(Person obj2 : obj1.getDaughters()){
                        System.out.println(obj2.getName());
                    }
                }
            }
            if(obj.getFather().getSisters() != null){
                for(Person obj1 : obj.getFather().getSisters()){
                    for(Person obj2 : obj1.getDaughters()){
                        System.out.println(obj2.getName());
                    }
                }
            }
        }
    }

    
    public static void getPersons(ArrayList <Person> family){
        Scanner sc1 = new Scanner(System.in);
        boolean choice = true;
        while(choice){
            Person obj1, obj2, obj3;  // obj1 - name given, obj2 - father, obj3 - mother
            System.out.print("Enter name : ");
            String name = sc1.next();
            System.out.print("Enter gender : ");
            String gender = sc1.next();
            if(Person.hasMember(name)){
                obj1 = Person.getMember(name);         // already there means no need to create object
                obj1.setGender(gender);
            }
            else{
                obj1 = new Person(name, gender);
                family.add(obj1);
                Person.addMember(name, obj1); 
            }
            System.out.print("Enter father : ");
            String father = sc1.next();
            if(!Person.hasMember(father)){
                obj2 = new Person(father, "male");
                family.add(obj2);
                Person.addMember(father, obj2);
            }
            else{
                obj2 = Person.getMember(father);
            }
            obj1.setFather(obj2);                     // set father
            System.out.print("Enter mother : ");
            String mother = sc1.next();
            if(!Person.hasMember(mother)){
                obj3 = new Person(mother, "female");
                family.add(obj3);
                Person.addMember(mother, obj3);
            }
            else{
                obj3 = Person.getMember(mother);
            }
            obj1.setMother(obj3);                 // set mother
            if(obj1.getGender().equals("male")){
                obj2.addSons(obj1);
                obj3.addSons(obj1);
            }
            else{
                obj2.addDaughters(obj1);              // add sons or daughters to parents
                obj3.addDaughters(obj1);
            }
            if(obj2.getSpouse() == null){
                obj2.setSpouse(obj3);
            }
            if(obj3.getSpouse() == null){
                obj3.setSpouse(obj2);
            }
            if(obj1.getGender().equals("male")){                             // set brother and sister
                if(!obj1.getMother().isSonsEmpty()){
                    for(Person obj : obj1.getMother().getSons()){
                        if(!obj.hasBrother(obj1)){
                            obj.setBrothers(obj1);
                            obj1.setBrothers(obj);
                        }
                    }
                }
                if(!obj1.getMother().isDaughtersEmpty()){
                    for(Person obj : obj1.getMother().getDaughters()){              // setting brothers
                        if(!obj.hasBrother(obj1)){
                            obj.setBrothers(obj1);
                            obj1.setSisters(obj);
                        }
                    }
                }
            }
            else{
                for(Person obj : obj1.getMother().getSons()){                        // setting sisters
                    if(!obj.hasSister(obj1)){
                        obj.setSisters(obj1);
                        obj1.setBrothers(obj);
                    }
                }

                for(Person obj : Person.getMember(name).getMother().getDaughters()){
                    if(!obj.hasSister(obj1)){
                        obj.setSisters(obj1);
                        obj1.setSisters(obj);
                    }
                }
            }
            System.out.print("Continue : ");
            char ch = sc1.next().charAt(0);
            choice = (ch == 'y') ? true : false;
        }
        System.out.print("Enter name to match : ");
        String match = sc1.next();
        Finder(family, match);

        sc1.close();
    }

    public static void printFamily(Person[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getName() + " " + array[i].getGender() + " " + array[i].getFather() + " " + array[i].getMother());
        }
    }
}


/*


Enter name : suriya
Enter gender : male
Enter father : siva
Enter mother : sivagami
Continue : y
Enter name : karthi
Enter gender : male
Enter father : siva
Enter mother : sivagami
Continue : y
Enter name : jothika
Enter gender : female
Enter father : jf
Enter mother : jm
Continue : y
Enter name : nagma
Enter gender : female
Enter father : jf
Enter mother : jm
Continue : y
Enter name : siva
Enter gender : male
Enter father : sf
Enter mother : sm
Continue : y
Enter name : jm
Enter gender : female
Enter father : sf
Enter mother : sm
Continue : n
Enter name to match : surya
No such person
PS C:\Users\S HARIPRAKASH\Desktop\Hack day 2> cd "c:\Users\S HARIPRAKASH\Desktop\Hack day 2\" ; if ($?) { javac Family.java } ; if ($?) { java Family }
Enter name : suriya
Enter gender : male
Enter father : siva
Enter mother : sivagami
Continue : y
Enter name : karthi
Enter gender : male
Enter father : siva
Enter mother : sivagami
Continue : y
Enter name : jothika
Enter gender : female
Enter father : jf
Enter mother : jm
Continue : y
Enter name : nagma
Enter gender : female
Enter father : jf
Enter mother : jm
Continue : y
Enter name : siva
Enter gender : male
Enter father : sf
Enter mother : sm
Continue : y
Enter name : jm
Enter gender : female
Enter father : sf
Enter mother : sm
Continue : suriya
Enter name to match : suriya

jothika
nagma

*/

//  suriya male siva sivagami y karthi male siva sivagami y jothika female jf jm y nagma female jf jm y siva male sf sm y jm female sf sm n


/*


Enter name : c
Enter gender : male  
Enter father : a
Enter mother : b
Continue : y
Enter name : e
Enter gender : female
Enter father : a
Enter mother : b
Continue : y
Enter name : g
Enter gender : male
Enter father : a
Enter mother : b
Continue : y
Enter name : i
Enter gender : male
Enter father : c
Enter mother : d
Continue : y
Enter name : j
Enter gender : female
Enter father : c
Enter mother : d
Continue : y
Enter name : k
Enter gender : male 
Enter father : c
Enter mother : d
Continue : y
Enter name : l
Enter gender : male
Enter father : f
Enter mother : e
Continue : y
Enter name : m
Enter gender : female
Enter father : f
Enter mother : e
Continue : y
Enter name : n
Enter gender : female
Enter father : f
Enter mother : e
Continue : y
Enter name : o
Enter gender : male
Enter father : g
Enter mother : h
Continue : y
Enter name : p
Enter gender : female
Enter father : g
Enter mother : h
Continue : y
Enter name : q
Enter gender : female
Enter father : g
Enter mother : h
Continue : n
Enter name to match : i
m
n

*/