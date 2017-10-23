class Runner{

  public static void main(String[] args){
    Cat myCat = new Cat();
    // myCat = new Dog(); fails in java as myCat variable assigned as a Cat class variable
    System.out.println(myCat.meow()) //only works if myCat.meow has other then void to allow a return;

  }
}
