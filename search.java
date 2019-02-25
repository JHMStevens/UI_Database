package mac_db;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class search {

	protected Shell shell;
	private Text macText;
	private Text assignedText;
	private Text locationText;
	private Text descriptionText;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			search window = new search();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnMac = new Button(shell, SWT.CHECK);
		btnMac.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 178, 155, 65);
		
		btnMac.setBounds(40, 54, 111, 20);
		btnMac.setText("MAC");
		
		Button btnAssigned = new Button(shell, SWT.CHECK);
		btnAssigned.setBounds(40, 85, 111, 20);
		btnAssigned.setText("Assigned");
		
		Button btnLocation = new Button(shell, SWT.CHECK);
		btnLocation.setBounds(40, 117, 111, 20);
		btnLocation.setText("Location");
		
		Button btnDescription = new Button(shell, SWT.CHECK);
		btnDescription.setBounds(40, 149, 111, 20);
		btnDescription.setText("Description");
		
		Label lblSearch = new Label(shell, SWT.NONE);
		lblSearch.setAlignment(SWT.CENTER);
		lblSearch.setBounds(10, 10, 412, 20);
		lblSearch.setText("SEARCH");
		
		macText = new Text(shell, SWT.BORDER);
		macText.setBounds(157, 50, 235, 26);
		
		assignedText = new Text(shell, SWT.BORDER);
		assignedText.setBounds(157, 82, 235, 26);
		
		locationText = new Text(shell, SWT.BORDER);
		locationText.setBounds(157, 114, 235, 26);
		
		descriptionText = new Text(shell, SWT.BORDER);
		descriptionText.setBounds(157, 146, 235, 26);
		
		Button btnSearch = new Button(shell, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String mac = "";
				String assigned = "";
				String location = "";
				String description = "";
				if(btnMac.getSelection()) {
					mac = macText.getText();
					lblNewLabel.setText(mac);
				}
			}
		});
		btnSearch.setBounds(168, 194, 90, 30);
		btnSearch.setText("SEARCH");
		
		

	}
}
