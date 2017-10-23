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
}
