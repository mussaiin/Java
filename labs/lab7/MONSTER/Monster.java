class Monster{
  private String name;
  private int health;
  public Monster(String name){this.name=name;}
  public Monster(){}

  public String toString(){
    return "Monster "+name;
  }
  public String attack(){
    return "I dont know how to attack!";
  }
  public int getHealth(){
    return health;
  }
}
