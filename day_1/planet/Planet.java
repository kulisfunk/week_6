class Planet{
  private String name;
  private int size;

  public Planet(String name, int size){
    this.name = name;
    this.size = size;
  }

  public String getName(){
    return this.name;
  }

  public int getSize(){
    return this.size;
  }

  public String explode(){ //either void here or string but return the string below, not use println

    return "Boom! " + this.name + " has exploded.";
    // System.out.println("Boom! " + this.name + " has exploded.");
    // String gas = "Oxygen"
    // return String.format("Boom!  %s has exploded because of all the %s was size %d.", this.name, gas, this.size)
  }
}
