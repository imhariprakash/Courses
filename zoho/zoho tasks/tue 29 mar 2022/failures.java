public static void Finder(Person[] array, String match){        
    for(int i = 0; i < array.length; i++){
        if(array[i].getName().equals(match)){
            for(int j = 0; j < array.length; j++){
                if((array[i].getFather()).equals(array[j].getName())){
                    for(int k = 0; k < array.length; k++){
                        if(array[j].getFather().equals(array[k].getName())){
                            for(int l = 0; l < array.length; l++){
                                
                            }
                        }
                    }

                    for(String str : array[j].Mchildren){
                        System.out.println(str);
                    }
                }
            }
            break;
        }
    }
}

public static Person[] initialize(int num){

    Person[] array = new Person[num];

    for(int i = 0; i < array.length; i++){
        array[i] = new Person();
    }
    return(array);
}











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


        // System.out.print("Enter name to match : ");
        // String match = sc.next();
        // Finder(array, match);


        
    }

    
    public static void getPersons(ArrayList <Person> family){
        Scanner sc1 = new Scanner(System.in);
        boolean choice = true;
        while(choice){
            System.out.print("Enter name : ");
            String name = sc1.next();
            System.out.print("Enter gender : ");
            String gender = sc1.next();
            if(Person.hasMember(name)){
                Person.getMember(name).setGender(gender);
            }
            else{
                Person obj = new Person(name, gender);
                family.add(obj);
                Person.addMember(name, obj); 
            }
            System.out.print("Enter father : ");
            String father = sc1.next();
            if(!Person.hasMember(father)){
                Person obj = new Person(father, "male");
                family.add(obj);
                Person.addMember(father, obj);
            }
            System.out.print("Enter mother : ");
            String mother = sc1.next();
            if(!Person.hasMember(mother)){
                Person obj = new Person(father, "female");
                family.add(obj);
                Person.addMember(mother, obj);
            }
            if(Person.getMember(name).getGender().equals("male")){
                Person.getMember(father).addSons(Person.getMember(name));
                Person.getMember(mother).addSons(Person.getMember(name));
            }
            else{
                Person.getMember(father).addDaughters(Person.getMember(name));
                Person.getMember(mother).addDaughters(Person.getMember(name));
            }
            if(Person.getMember(father).getSpouse() == null){
                Person.getMember(father).setSpouse(Person.getMember(mother));
            }
            if(Person.getMember(mother).getSpouse() == null){
                Person.getMember(mother).setSpouse(Person.getMember(father));
            }
            if(Person.getMember(name).getGender().equals("male")){
                if(Person.getMember(name).getMother().getSons() != null){
                    for(Person obj : Person.getMember(name).getMother().getSons()){
                        if(!obj.hasBrother(Person.getMember(name))){
                            obj.setBrothers(Person.getMember(name));
                        }
                    }
                }
                if(Person.getMember(name).getMother().getDaughters() != null){
                    for(Person obj : Person.getMember(name).getMother().getDaughters()){
                        if(!obj.hasBrother(Person.getMember(name))){
                            obj.setBrothers(Person.getMember(name));
                        }
                    }
                }
            }
            else{
                for(Person obj : Person.getMember(name).getMother().getSons()){
                    if(!obj.hasSister(Person.getMember(name))){
                        obj.setSisters(Person.getMember(name));
                    }
                }

                for(Person obj : Person.getMember(name).getMother().getDaughters()){
                    if(!obj.hasSister(Person.getMember(name))){
                        obj.setSisters(Person.getMember(name));
                    }
                }
            }
            System.out.print("Continue : ");
            char ch = sc1.next().charAt(0);
            choice = (ch == 'y') ? true : false;
        }
        sc1.close();
    }

    public static void printFamily(Person[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getName() + " " + array[i].getGender() + " " + array[i].getFather() + " " + array[i].getMother());
        }
    }
}