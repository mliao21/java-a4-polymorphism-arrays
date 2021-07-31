/**
 * Stats class gets and adds the grades in an array input by user in StatsGUI.
 * From the list of grades input, Stats class sorts, counts, calculates 
 * and finds the mean and median of those grades.
 * 
 * @author Melissa Liao
 * 
 */
public class Stats {

	private int grades[];
	private int count;

	public Stats() {
		grades = new int[100];
		count = 0;
	}

	/**
	 * INSERTION SORT OF THE FIRST n ELEMENTS OF ARRAY arr 
	 * SEE PAGE 407 TO PAGE 410
	 * FOR A DISCUSSION
	 * 
	 * @param grades
	 * @param count
	 */
	public void sort(int[] grades, int count) {
		int temp, j, k;
		for (j = 1; j < count; j++) {
			temp = grades[j];
			for (k = j - 1; (k >= 0) && (grades[k] > temp); k--) {
				grades[k + 1] = grades[k];
			}
			grades[k + 1] = temp;
		}
	}

	/**
	 * add() method takes the number input by user and
	 * adds it to the grades[] array. As the input number
	 * is added, the count is incremented by the number of
	 * times the user inputs a new grade number.
	 * 
	 * @param number represents the grade that  
	 * the user inputs through StatsGUI.
	 * 
	 */
	public void add(int number) {
		grades[count] = number;
		count++;
	}
	
	/**
	 * toString() method summarizes and displays the grades
	 * input by user and results of its mean and median.
	 * This method displays in the displayStats area of 
	 * class StatsGUI.
	 * 
	 * @return method returns to whole information  
	 * that is appended to String 'display'.
	 * 
	 */
	@Override
	public String toString() {
		// StringBuilder is used to append array numbers in a string
		StringBuilder display = new StringBuilder();
		display.append("\nvalues: ");
		for (int i=0; i<count; i++) {
			display.append(grades[i]);
			display.append(", ");
		}
		// result of mean and median from all grades input 
		// is added in the String displayed in StatsGUI
		display.append("\nmean: " + getMean());		
		display.append("\nmedian: " + getMedian());
		
		return display.toString();
	}

	/**
	 * getMean() method calculates the mean of all
	 * the grades input by the user through StatsGUI.
	 * 
	 * @return it returns to the mean result from all grades
	 */
	public double getMean() {
		double sum = 0;
		double mean = 0;
		for (int i=0; i<count; i++) {
			sum += grades[i];
		}
		mean = sum/count;
		return mean;
	}

	/**
	 * getMedian() method calculates the median of all
	 * the grades input by the user through StatsGUI.
	 * 
	 * @return it returns to the median result from all grades
	 */
	public double getMedian() {
		double median = 0;
		sort(grades, count); // the grades[] array is sorted first
		if (count % 2 == 0) { // looks for the median when even number of grades are input
			median = ((grades[(count/2)-1] + grades[(count/2)]) / 2.000);
		}
		else if (count % 2 > 0) {// looks for the median when odd number of grades are input
			median = grades[Math.floorDiv(count,2)];
		}
		return median;
	}
	
}
