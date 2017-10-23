public class Bus{

  private int number;
  private Person[] passengers;


  public Bus(int number){
    this.number = number;
    this.passengers = new Person[5];
  }

  public int getBusNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for (Person person : this.passengers){
      if (person != null){
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

  public void addPassenger(Person person){
    if (!isBusFull()){
      int passengerCount = passengerCount();
      this.passengers[passengerCount] = person;
    }
  }
}
