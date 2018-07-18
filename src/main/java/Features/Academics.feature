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
Then  user enter subject name and save it 
Then  user verify toast notification 
And   user logout from the Application