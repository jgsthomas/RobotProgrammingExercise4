import lejos.nxt.Button;
import lejos.nxt.ButtonListener;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

public class TrackedRobot {
	/*Turn values:
	 * 110 = 90 degrees (don't ask)
	 * 220 = 180 degrees (our calibration sucks)
	 * */
	private final DifferentialPilot m_pilot;
	protected boolean m_run = true;
	
	public TrackedRobot()
	{
		m_pilot = new DifferentialPilot(1.13, 5.20, Motor.A, Motor.B, false);
		
		Button.ESCAPE.addButtonListener(new ButtonListener() {

			@Override
			public void buttonReleased(Button _b) {
				m_run = false;
			}

			@Override
			public void buttonPressed(Button _b) {

			}
		});
	}
}
