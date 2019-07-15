
//First we import the objects we want to use for our program.
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

// This is a story synthesizer, our main block of code starts now we define the first method.
public class StorySynthesiserJF {
	// Here we define the window pane name.
	JFrame StoryFrame;

	// Now we add it into the class StorySynthesiser.
	StorySynthesiserJF() {
		// Add the title to the pane.
		StoryFrame = new JFrame("Choose your story!");
		// Here we are defining different elements to add to the pane like labels,
		// buttons and text fields.
		JLabel ltitle = new JLabel("Enter your options!");
		JLabel lage = new JLabel("Age:");
		JLabel lgender = new JLabel("Gender:");
		JLabel ltoy = new JLabel("Toy:");
		JButton story = new JButton("Create Story");
		// The line below creates the text field and sets the text field to accept
		// numbers only.
		JFormattedTextField age = new JFormattedTextField(NumberFormat.getInstance());

		// We're defining some Strings and Combo boxes
		String[] gender = { "Boy", "Girl" };
		String[] toy = { "Car", "Doll", "Teddy" };
		JComboBox<String> genList = new JComboBox<>(gender);
		JComboBox<String> toyList = new JComboBox<>(toy);

		// Now we're adding all our predefined objects into the window.
		StoryFrame.add(ltitle);
		StoryFrame.add(story);
		StoryFrame.add(lage);
		StoryFrame.add(lgender);
		StoryFrame.add(ltoy);
		StoryFrame.add(age);
		StoryFrame.add(genList);
		StoryFrame.add(toyList);

		// This next block of code positions our objects in the window on the x,y axis
		// and defines size.
		ltitle.setBounds(50, 20, 130, 20);
		story.setBounds(50, 150, 130, 20);
		lage.setBounds(50, 50, 75, 20);
		lgender.setBounds(50, 80, 75, 20);
		ltoy.setBounds(50, 110, 75, 20);
		age.setBounds(100, 50, 75, 20);
		genList.setBounds(100, 80, 75, 20);
		toyList.setBounds(100, 110, 75, 20);

		// This is some settings for the window, sets the window size, it's predefined
		// layout(null) and that it's visible.
		StoryFrame.setLayout(null);
		StoryFrame.setSize(300, 250);
		StoryFrame.setVisible(true);

		// his next part of the program is a little more complex, we add a listener to
		// the button so on the click action it
		// runs the next method.

		story.addActionListener(new java.awt.event.ActionListener() {

			// Next we define the next method actionPerformed butClick.
			public void actionPerformed(java.awt.event.ActionEvent butClick) {

				// Now we're defining some strings to use in the if statements.
				String Story1 = "";
				String Story2 = "";
				String Story3 = "";

				// And some ints.
				int genint = genList.getSelectedIndex();
				int toyint = toyList.getSelectedIndex();
				int ageint = Integer.parseInt(age.getText());

				// Now we're evaluating our inputs with ifs to provide different outputs.
				if (ageint <= 5) {
					Story3 = ("Toddler");
				} else if (ageint <= 12) {
					Story3 = ("Child");
				} else if (ageint > 12) {
					Story3 = ("Teenager");
				}

				if (genint == 0) {
					Story1 = ("Testing this block");
				} else if (genint == 1) {
					Story1 = ("Testing 2");
				}

				if (toyint == 0) {
					Story2 = ("Test1");
				} else if (toyint == 1) {
					Story2 = ("Test2");
				} else if (toyint == 3) {
					Story2 = ("Test3");
				}

				// Now we will define a few more strings and put them all together.
				String genderPop = (String) genList.getSelectedItem();
				String toyPop = (String) toyList.getSelectedItem();
				String agePop = (age.getText());
				JOptionPane.showMessageDialog(null, agePop + Story3 + genderPop + Story1 + toyPop + Story2);

			}
		});
	}

	public static void main(String[] args) {

		new StorySynthesiserJF();

	}

}