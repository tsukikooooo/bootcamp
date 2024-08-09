public class Person { //relationship with nested-class
    private String name;
    private int age;
    
    //Reason of builder
// 20 attributes : like form.

//Builder person shouldn't contain any public constructor
    public Person(){

    }
//對比 平時同builder construtor 分別....正常唔會兩個寫晒
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Builder builder(){ //static!!!
        return new Person.Builder(); //Builder construtor  <<<new!! builder static method to call themself, builder hv empty construtor
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setName (String name){
        this.name = name;
    }


    //Builder 同OBJECT 無關係
    public static class Builder{
        private String name;
        private int age;

        public Builder age(int age) {//return Builder self
        this.age = age;
        return this; //return  builder object...(好產... can ...)
    }

        public Builder name(String name){
            this.name = name;
            return this;
        }
    
///finally want to new person...so write like this.
    public Person build(){
     //   return new Person(this.name, this.age);
     return new Person(this);//再靚仔D版本 
    }
}
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("John"); 
        Person person3 = new Person("Sally",10); //what is 20 attributes? -> careless mistakes 次序重要, 用SET都要對齊..先得

        Person person2 = Person.builder()// create new Builder Object
        .age(18)// 次序唔重要 //retrun current builder object
        .name("John")// return current builder object
        .build(); //create Person object

        System.out.println(person2.getAge() + " " + person.getName() );
    }
}
//1. with all argument constructor
//2. 
//3.本質封晒D empty constructor ,, 對方只可用construtor..encapsulate