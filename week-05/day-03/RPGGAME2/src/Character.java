
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

  void characterMove() {
    int random = (int) (Math.random() * 4);
    if ((random == 0) && (posX < 9)) {
      if (myArray.IsWall(posX + 1, posY)) {
        posX += 1;
      }
    } else if ((random == 1) && (posX > 0)) {
      if (myArray.IsWall(posX - 1, posY)) {
        posX -= 1;
      }
    } else if ((random == 2) && (posY < 9)) {
      if (myArray.IsWall(posX, posY + 1)) {
        posY += 1;
      }
    } else if ((random == 3) && (posY > 0)) {
      if (myArray.IsWall(posX, posY - 1)) {
        posY -= 1;
      }
    }
  }

  int dice() {
    return (int) Math.ceil(Math.random() * 6);
  }
}