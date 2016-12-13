package decorator;

public class VerticalScrollBarDecorator extends WindowDecorator {
	
	public VerticalScrollBarDecorator (IWindow windowToBeDecorated) {
		super(windowToBeDecorated);
	}
	
	public void draw() {
		super.draw();
		drawVerticalScrollBar();
	}
	
	private void drawVerticalScrollBar() {
		// Draw the vertical scrollbar
	}
	
	public String getDescription() {
		return super.getDescription() + ",including vertical scrollbars";
	}

	
}
