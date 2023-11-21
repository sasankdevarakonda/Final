class superclass{
    final int age;

   public superclass(int age) {
        this.age = age;
    }

    void run(int abc){
        age=abc;
    }
    public static void main(String args[]){
       superclass obj=new  superclass(age);
        obj.run();
    }
}
