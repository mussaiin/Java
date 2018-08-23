class FireMonster extends Monster{
  int health=100;
  FireMonster(String name){
    super(name);
  }
  @Override
  public String toString(){
    return "Fire "+super.toString();
  }
  public String attack(){
    return "Attack with the Fire!";
  }
  public int getHealth(){
    return health;
  }
}
