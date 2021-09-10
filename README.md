# Backend Coding Challenge: Module Dependency Challenge
## Solutions Description

## Mockito Problem
The test did fail on first run attempt, generating an exception `'Mockito cannot mock 
this class exception'`.

## Solution
To solve the Mockito issue, I had to add a new 
gradle dependency `org.mockito:mockito-core:2.23.4` (mockito core) to 
the application module.  

### Solution Redesign 
I observed that the test procedure test for 
 `EmailHandler#sendEmail(Inquiry)` and `PushNotificationHandler#sendNotification` method calls 
  when an inquiry is created, by calling `Invoice#create(Inquiry)` method of `InquiryService` class. 
  
### Problem with Existing Design
Based on existing design (old), It was problematic to 
inject `EmailHandler` and `PushNotificationHandler` into 
`InquiryService` class because they do not belong 
to the same module. Also, trying to include the module where 
these classes (EmailHandler & PushNotificationHandler) 
belong will lead to cyclical dependency problem. To solve this 
problem, I did the following:
- created a new module named `commons'
- converted EmailHandler and PushNotificationHandler from concrete 
classes to interface (this is to promote loose
 coupling of system function)
- implemented the created interfaces in `commons` module (new created module)
- added `notifications module` to the new module `commons`
- added `commons` (new created module) as dependency in `inquiry module`

After the above redesign, it was possible to access `EmailHandler` and `PushNotificationHandler`
in multiple modules.

- Redesign of inquiry service: I converted Inquiry Service to an 
interface so as to make the application loosely coupled with other 
components that may want to interact with the service 


## Problem with old design
Old design was highly coupled making it difficult to reuse components. New design introduces 
interfaces to promote loose coupling of component and re-usability
 
