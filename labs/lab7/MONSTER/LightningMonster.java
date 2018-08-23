class LightningMonster extends Monster{
  LightningMonster(String name){
    super(name);
  }
  @Override
  public String toString(){
    return "Lightning "+super.toString();
  }
  public String attack(){
    return "Attack with the Lightning!";
  }
}
