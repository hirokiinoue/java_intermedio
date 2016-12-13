package decorator;

public class WindowDecorator implements IWindow {

	protected IWindow windowToBeDecorated; // the Window being decorated
	
	public WindowDecorator (IWindow windowToBeDecorated) {
		this.windowToBeDecorated = windowToBeDecorated;
	}
	public void draw() {
		windowToBeDecorated.draw(); //Delegation
	}
	public String getDescription() {
		return windowToBeDecorated.getDescription(); //Delegation
	}
}
