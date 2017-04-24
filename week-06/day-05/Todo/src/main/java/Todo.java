
public class Todo {

  int id;
  String todo;
  boolean checked;


  Todo(boolean checked, int id, String todo) {
    this.id = id;
    this.todo = todo;
    this.checked = checked;
  }

  @Override
  public String toString() {
    return this.checked + " " + this.id + " " + this.todo;
  }
}
