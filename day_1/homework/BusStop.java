public class BusStop{

  Bus bus;

  private Person[] busStop;

  public BusStop(){
    this.busStop = new Person[5];
  }


  public int busStopCount(){
    int count = 0;
    for (Person person : this.busStop){
      if (person != null){
        count++;
      }
    }
      return count;
  }

  public boolean isStopFull(){
    return busStopCount() == busStop.length;
  }


  public void addPersonToStop(Person person){
    if (!isStopFull()){
      int personCount = busStopCount();
      this.busStop[personCount] = person;
    }
  }


  public void boardBus(Person person, Bus bus){
      if(busStopCount() > 0){
      int personCount = busStopCount();
      bus.addPassenger(person);
      this.busStop[personCount-1] = null;
      }
  }

  public Person remove(){ //removes a person from the the array, but returns that instance of person so can be added to bus
    Person person = null; //allows us to return null if bus top empty to start with
    if(busStopCount() > 0){
    int index = busStopCount() - 1;
    Person person = this.busStop[index];//create temporary person so we can delete from array but return instance
    this.busStop[index] = null;
    return person;
    }
  }
}
