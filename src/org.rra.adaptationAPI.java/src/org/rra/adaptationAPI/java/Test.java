/**
 * 
 */
package org.rra.adaptationAPI.java;

import org.rra.adaptationAPI.AdaptationException;

/**
 * @author nicoh
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSystem    sys   = new JSystem("mySystem");
		JComponent compA = new JComponent("compA");
		JComponent compB = new JComponent("compB");

		System.out.println("INSTANCES");

		try {
			sys.addComponent(compA);
		} catch (AdaptationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			sys.addComponent(compB);
		} catch (AdaptationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FINISHED");
	}

}
