import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;
  BusStop busstop;

  @Before
  public void before(){
    bus = new Bus(25);
    person = new Person();
    busstop = new BusStop();
  }

  @Test
  public void hasNumber(){
    assertEquals(25, bus.getBusNumber());
  }

  @Test
  public void busIsEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void addPassengerToBus(){
    bus.addPassenger(person);
    bus.addPassenger(person);
    assertEquals(2, bus.passengerCount());
  }

  @Test
  public void noMorePassengersFull(){
    for (int i=0; i < 10; i++){
      bus.addPassenger(person);
    }
    assertEquals(5, bus.passengerCount());
  }
  
  @Test
  public void addToStop(){
    busstop.addPersonToStop(person);
    assertEquals(1, busstop.busStopCount());
  }

  @Test
  public void personLeaveBusStop(){
    // bus.addPassenger(person);
    busstop.addPersonToStop(person);
    busstop.boardBus(person, bus);
    assertEquals(0, busstop.busStopCount());
  }

  @Test
  public void personBoardBus(){
    bus.addPassenger(person);
    busstop.addPersonToStop(person);
    busstop.boardBus(person, bus);
    assertEquals(2, bus.passengerCount());
  }
}
