package decorator;

public class HorizontalScrollBarDecorator extends WindowDecorator {
	
	public HorizontalScrollBarDecorator (IWindow windowToBeDecorated){
		super(windowToBeDecorated);
	}
	
	public void draw() {
		super.draw();
		drawHorizontalScrollBar();
	}
	
	private void drawHorizontalScrollBar() {
		// Draw the horizontal scrollbar
	}
	
	public String getDescription() {
		return super.getDescription() + ", including horizontal scrollbars";
	}
}
