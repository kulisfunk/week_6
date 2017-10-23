public class Bear{
  private String name;
  private Salmon[] belly;

  public Bear(String name){
    this.name = name;
    this.belly = new Salmon[5];
  }
  public String getName(){
    return this.name;
  }

  public int foodCount(){
    int count = 0;
    for (Salmon salmon : this.belly){
      if (salmon != null){
        count++;
      }
    }
    return count;
  }

  public void eat(Salmon salmon){
    if(!isBellyFull()){
    int foodCount = foodCount();
    this.belly[foodCount] = salmon;
    }
  }

  public boolean isBellyFull(){
    return foodCount() == belly.length;
  }

  public void sleep(){
    for(int i=0; i < this.belly.length; i++){
    this.belly[i] = null;
    }
  }
}
