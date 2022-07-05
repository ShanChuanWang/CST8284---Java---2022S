package assignment1.Action.sec301;

/**
 * This is the Action Superclass class that provides a catalog of actions
 * to be carried out in view of COVID-19 OPH protocols.
 */
public abstract class Action {
   private String description;

   private int dueYear;
   private int dueMonth;
   private int dueDay;

   /**
    Constructs an action without a description.
    */
   public Action() {
      description = "";
   }

   /**
    * Constructs an action with a description.
    * @param desc description
    */
   public Action(String desc) {
      description = desc;
   }

   /**
    * cosntructs an action with due date elements (dueYear, dueMonth, dueDay)
    * @param dueYear the year
    * @param dueMonth the month
    * @param dueDay the day
    */
   public Action (int dueYear, int dueMonth, int dueDay) {
      this.dueYear = dueYear;
      this.dueMonth = dueMonth;
      this.dueDay= dueDay;
   }
   
   
   
   public int getDueYear() {
	   return dueYear;
   }

   public void setDueYear(int dueYear) {
	   this.dueYear = dueYear;
   }

	public int getDueMonth() {
		return dueMonth;
	}

	public void setDueMonth(int dueMonth) {
		this.dueMonth = dueMonth;
	}

	public int getDueDay() {
		return dueDay;
	}

	public void setDueDay(int dueDay) {
		this.dueDay = dueDay;
	}

/**
    Sets the description of this action.
    @param description the text description of the action
    */
   public void setDescription(String description) {
      this.description = description;
   }

   /**
    * Determines if this action occurs on the specified date.
    * @param year the year
    * @param month the month
    * @param day the day
    * @return true if the action activity occurs on the specified date.
    */
   public abstract boolean occursOn (int year, int month, int day);

   /**
    Converts action activity to string description.
    */
   public String toString() {
      return description;
   }
   
   public void dateCheck(int year, int month, int day) {
	   final int[] DAYS_PER_MONTH =
           {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   if (month <= 0 || month > 12) {
       throw new IllegalArgumentException("month (" + month + ") must be 1-12");
       }
	   if (day <= 0 || (day > DAYS_PER_MONTH[month] && !(month == 2 && month == 29))) {
       throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year)");
       }
	   if ((month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 || year % 100 == 0)))) {
       throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year)");
       }
   }
}

