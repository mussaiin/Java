class WaterMonster extends Monster{
  WaterMonster(String name){
    super(name);
  }
  @Override
  public String toString(){
    return "Water "+super.toString();
  }
  public String attack(){
    return "Attack with the Water!";
  }
}
