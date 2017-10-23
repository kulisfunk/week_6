class Runner{
  public static void main(String[] args){
    // Bear bear = new Bear("Balu");
    Bear bear = new Bear("Baloo", 25, 95.62);
    // bear.setName("Baloo");
    // String name = bear.getName();
    // System.out.println(name);
    // System.out.println(bear.name); //allows us to access bear name variable without accessor which is dangerous
    System.out.println(bear.getName());
    bear.setName("Gary");
    System.out.println(bear.getName());//so now we use getters and setters to access private class instance variables

  }
}
