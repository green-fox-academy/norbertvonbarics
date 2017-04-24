
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

  private int fight() {
    int maxDamage = this.ammo *this.damage;
    this.ammo = 0;
    return maxDamage;
  }

  int refill(int numberRefill) {
    this.ammo = this.maxAmmo;
    return numberRefill - this.maxAmmo;
  }

  String getType() {
    return this.type;
  }

  @Override
  public String toString() {
    return "Type: " + type + ", Ammo: " + ammo + ", damage: " + damage
        + ", All Damage: " + this.ammo *this.damage;
  }

  int getAmmo() {
    return ammo;
  }

  int getDamage() {
    return damage;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;
  }
}
