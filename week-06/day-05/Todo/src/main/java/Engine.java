
class Engine {

  static void engine(String[] args) {

    NoArgument.noArgument(args);
    PrintList.printList(args);
    AddTask.addTask(args);
    TaskRemove.taskRemove(args);
    TaskCheck.taskCheck(args);
    UnsupportedArgument.unsupported(args);
  }
}
