class Bear{
  private String name; //private means getter and setter have to be used to get and change variable
  private int age;
  private double weight;

  public Bear(String name, int age, double weight){ //this initializes class with variable this.name similar to @name in ruby
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public String getName(){ //getter
    return this.name;
  }

  public void setName(String newName){ //setter
    this.name = newName;
  }

  public int getAge(){
    return this.age;
  }

  public double getWeight(){
    return this.weight;
  }

  public boolean readyToHibernate(){
    if (this.weight > 80){
    return true;
  } else {
    return false;
  }
}
}
