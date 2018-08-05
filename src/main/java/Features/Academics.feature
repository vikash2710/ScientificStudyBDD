Feature: Academics Page

@VerifyAcademicspage @AcademicsPage
Scenario: Verify Academics page

Given user login into the website
When  user navigates to academics module
Then  user verify the page 
And   user logout from the Application


@CreateSubject @AcademicsPage
Scenario: Create Subject 

Given user login into the website
When  user navigates to academics module
Then  user select Subject from Masters dropdown
#Then  user enter subject name and save it 
Then  user enter "<Subject Name>" , "<Practical Paper>" , "<Co-Scholastic>" and save it
#Then  user verify toast notification user enter subject name and save it
And   user logout from the Application

@CreateGrade
Scenario: Create Grade

Given user login into the website
When  user navigates to academics module
Then  user select Grading from Masters dropdown
Then  user enter "<Scale Name>" and "<Scale Description>" and save it 
And   user logout from the Application

