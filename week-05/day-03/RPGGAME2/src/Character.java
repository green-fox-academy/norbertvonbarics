
public class Character extends GameObject {
  Board myArray = new Board();
  int hp;
  int dp;
  int sp;


  public Character(int posX, int posY, String costume, int hp, int dp, int sp) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
    this.hp = hp;
    this.dp = dp;
    this.sp = sp;
  }

  Character(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
  }

  Character() {

  }

  void monsterMove(int posX, int posY) {
    int random = (int) (Math.random() * 4);
    if (random == 0) {
      if (myArray.ifThereIsWall(posX + 1, posY) && posX <= 8) {
        posX += 1;
      }
    } else if (random == 1) {
      if (myArray.ifThereIsWall(posX - 1, posY) && posX <= 1) {
        posX -= 1;
      }
    } else if (random == 2) {
      if (myArray.ifThereIsWall(posX, posY + 1) && posX <= 8) {
        posY += 1;
      }
    } else if (random == 3) {
      if (myArray.ifThereIsWall(posX, posY - 1) && posX <= 1) {
        posY -= 1;
      }
    }
  }
}