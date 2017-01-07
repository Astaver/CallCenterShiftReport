# CallCenterShiftReport
A simple app I created for a help desk to track various stats and log it in a shift report. 

The user selects themself(this is in a comboBox array) and then enters the data from their shift. 

Any additional information the next shift may need to know is entered in the textArea.

The log button then logs the information into the table. It generates an "FCR". This stands for first call resolution.

It is a metric used in many call centers to track the number of calls the desk is able to resolve without escelation. 
Typically the desirable range for this percentage is to be around the 60% threshold. 

These are editable in the event of a mistype. Click on the shift in the table and the getText methods are called to populate the 
textFields with the shift report. 
