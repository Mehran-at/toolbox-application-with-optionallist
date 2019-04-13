package toolbox;

import java.util.Optional;

public class ToolboxApplication {
  public static void main(String[] args) {
    Storage storage = new Storage();
    ToolMaker toolMaker = new ToolMaker();
    toolMaker.fillStorageWithTool(storage);
    Optional<Tool> hammer = storage.getTools("Hammer");
    if (hammer.isPresent()) {
      System.out.println("Start working with: " + hammer.get().getName());
    } else {
      System.out.println("We do not have that tool!");
    }
  }
}
