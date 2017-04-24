
class Aircraft {

  private String type;
  private int ammo;
  private int maxAmmo;
  private int damage;

  Aircraft(String type, int ammo, int maxAmmo, int damage) {
    this.type = type;
    this.ammo = ammo;
    this.maxAmmo = maxAmmo;
    this.damage = damage;
  }

  int fight() {
    int temp = this.ammo;
    this.ammo = 0;
    return temp * this.damage;
  }

  int refill(int numberRefill) {
    this.ammo = this.maxAmmo;
    return numberRefill - this.maxAmmo;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return "Type " + this.type + ", Ammo: " + this.ammo + ", Base Damage: " + this.damage
        + ", All Damage: " +
        fight();
  }

  @Override
  public String toString() {
    return "Type: " + type + ", Ammo: " + ammo + ", MaxAmmo: " + maxAmmo + ", damage: " + damage
        + "All Damage: " + fight() +"\n";
  }
}
