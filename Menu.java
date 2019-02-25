package mac_db;

import java.util.concurrent.TimeUnit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Menu {

	protected Shell shell;
	String test = "";

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Menu window = new Menu();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(195, 303);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Label title = new Label(shell, SWT.CENTER);
		title.setBounds(47, 10, 90, 20);
		title.setText("Main Menu");
		
		Label testAnswer = new Label(shell, SWT.NONE);
		testAnswer.setAlignment(SWT.CENTER);
		testAnswer.setText(test);
		testAnswer.setBounds(10, 34, 157, 20);
		
		Button btnAddMac = new Button(shell, SWT.NONE);
		btnAddMac.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				testAnswer.setText("Add Mac works");
			}
		});
		btnAddMac.setBounds(47, 60, 90, 30);
		btnAddMac.setText("Add MAC");
		
		Button btnSearch = new Button(shell, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				testAnswer.setText("SEARCH works");
			}
		});
		btnSearch.setBounds(47, 107, 90, 30);
		btnSearch.setText("Search");
		
		Button btnDelete = new Button(shell, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				testAnswer.setText("DELETE works");
			}
		});
		btnDelete.setBounds(47, 153, 90, 30);
		btnDelete.setText("Delete");
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				testAnswer.setText("Exit works");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {
					return;
				}
				System.exit(0);
			}
		});
		btnExit.setBounds(47, 203, 90, 30);
		btnExit.setText("Exit");
		


	}
}
