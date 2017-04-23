
public class Todo {

  int id;
  String todo;
  boolean checked;


  Todo(String todo, int id, boolean checked) {
    this.id = id;
    this.todo = todo;
    this.checked = false;
  }

  public Todo() {
    this("defaultTodo", 0, true);
  }

  @Override
  public String toString() {
    return this.id + this.todo;
  }
}
