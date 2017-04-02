# Calculate Bonus Workflow

This example project is focused on using Multiple instances Subprocess. It is designed for the following situation:

In a company, every employee gets quaterly bonus suggested by his or her manager. Based on the bonus amount, a number of reviews is necessary. For example, if the amount is less than or equal to $100, only one review is necessary. In contrast, if the amount is higher than $500, up to 5 reviews may be necessary. The amount of reviews is dictated by company policy. 

The project, once completed, has the following workflow:

1. A user from the HR group suggests monetary bonus for an employee and enters how many reviews are necessary.
2. Helper script creates a collection of reviews and prints out helper messages in the console.
3. Multiple instances Subprocess is executed for each review.
4. If at least half of people agreed with the bonuses, a boolean variable is set to `true`. Otherwise, the variable is set to `false`.
5. Based on the control variable, a script task is executed informing us if the bonus has been approved. 

## Tips

* Familiarize yourself with the Data Object employee and all the pre-set variables.
* Do not change variable names; otherwise, the helper script tasks may not work.
* Be sure to set the Human Tasks to correct group or actor. When debugging, you can set it to yourself. However, when done, set the tasks to the `HR` group.
* Save often.