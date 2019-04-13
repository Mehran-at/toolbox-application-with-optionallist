package toolbox;

public class ToolMaker {
  public void fillStorageWithTool(Storage toolBox) {
    toolBox.addTool(new Tool("Hammer"));
    toolBox.addTool(new Tool("Screw driver"));
    toolBox.addTool(new Tool("Axe"));
    toolBox.addTool(new Tool("Nails"));
  }
}
